package application;

import enums.PokerRank;
import enums.PokerSuit;
import lombok.Getter;

public class PokerCard {

    @Getter
    private final PokerRank rank;

    @Getter
    private final PokerSuit suit;

    public PokerCard(char[] card) {
        this.rank = PokerRank.from(card[0]);
        this.suit = PokerSuit.from(card[1]);
    }

    public PokerCard(String card) {
        this(card.toCharArray());
    }
}
