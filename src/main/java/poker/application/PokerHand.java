package poker.application;

import lombok.Getter;
import poker.categories.PokerCategory;
import poker.categories.PokerCategoryService;
import poker.enums.PokerResult;
import poker.exceptions.PokerException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PokerHand {

    private final static String SEPARATOR = " ";
    private final static int NUMBER_OF_CARDS = 5;

    @Getter
    private final List<PokerCard> cards;

    @Getter
    private final PokerCategory category;

    public PokerHand(String hand) {
        String[] cards = hand.split(SEPARATOR);

        if (cards.length != NUMBER_OF_CARDS)
            throw new PokerException("PokerHand Number Of Cards Must Be 5!");

        this.cards =
                Arrays.stream(cards)
                        .map(PokerCard::new)
                        .sorted()
                        .collect(Collectors.toList());

        this.category =
                PokerCategoryService.evaluate(this.cards);
    }

    public PokerResult compare(PokerHand hand) {
        int evaluation =
                this.category.strength() - hand.category.strength();

        if (evaluation > 0)
            return PokerResult.WIN;
        else if (evaluation < 0)
            return PokerResult.LOSS;
        else
            return this.tiebreaker(hand);
    }

    private PokerResult tiebreaker(PokerHand hand) {
        List<PokerCard> cards = hand.getCards();

        int rank =
                IntStream.range(0, this.cards.size())
                        .map(i -> this.cards.get(i).compareTo(cards.get(i)))
                        .filter(compare -> compare != 0)
                        .findFirst()
                        .orElse(0);

        if (rank < 0)
            return PokerResult.WIN;
        else if (rank > 0)
            return PokerResult.LOSS;
        else
            return PokerResult.DRAW;
    }
}
