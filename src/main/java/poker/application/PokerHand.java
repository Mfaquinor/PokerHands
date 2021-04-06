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
                PokerSorter.sort(
                        Arrays.stream(cards)
                                .map(PokerCard::new)
                                .collect(Collectors.toList()));

        this.category =
                PokerCategoryService.evaluate(this.cards);
    }

    public PokerCard getCard(int index) {
        return this.cards.get(index);
    }

    public PokerResult compare(PokerHand hand) {
        return this.category.different(hand.getCategory()) ?
                this.category.compare(hand.getCategory()) :
                this.tiebreaker(hand);
    }

    public PokerResult tiebreaker(PokerHand hand) {
        return IntStream.range(0, NUMBER_OF_CARDS)
                    .map(i -> hand.getCard(i).compareTo(this.getCard(i)))
                    .filter(evaluation -> evaluation != 0)
                    .mapToObj(PokerResult::from)
                    .findFirst()
                    .orElse(PokerResult.DRAW);
    }
}
