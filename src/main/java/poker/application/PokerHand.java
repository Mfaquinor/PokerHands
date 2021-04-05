package poker.application;

import lombok.Getter;
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

    public PokerHand(String hand) {
        String[] cards = hand.split(SEPARATOR);

        if (cards.length != NUMBER_OF_CARDS)
            throw new PokerException("PokerHand Number Of Cards Must Be 5!");

        this.cards =
                Arrays.stream(cards)
                        .map(PokerCard::new)
                        .sorted()
                        .collect(Collectors.toList());
    }

    public PokerResult compare(PokerHand hand) {
        return PokerResult.DRAW;
    }
}
