package application;

import enums.PokerRank;
import enums.PokerSuit;

public class PokerCard {

    private PokerRank rank;

    private PokerSuit suit;

    public PokerCard(char[] card) {
        this.rank = PokerRank.from(card[0]);
        this.suit = PokerSuit.from(card[1]);
    }

    public PokerCard(String card) {
        this(card.toCharArray());
    }
}
