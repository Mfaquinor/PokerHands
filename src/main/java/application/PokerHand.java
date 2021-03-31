package application;

import enums.PokerResult;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerHand {

    private final List<PokerCard> cards;

    private final static String SEPARATOR = " ";

    public PokerHand(String cards) {
        this.cards =
                Arrays.stream(cards.split(SEPARATOR))
                        .map(PokerCard::new)
                        .collect(Collectors.toList());
    }

    public PokerResult compare(PokerHand hand) {
        return PokerResult.DRAW;
    }
}
