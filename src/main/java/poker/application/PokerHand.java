package poker.application;

import lombok.Getter;
import poker.categories.PokerCategory;
import poker.categories.PokerCategoryService;
import poker.enums.PokerResult;
import poker.exceptions.PokerException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public PokerResult compare(PokerHand hand) {
        return this.category.compare(hand.category);
    }
}
