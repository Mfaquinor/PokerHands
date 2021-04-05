package poker.application;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;
import poker.exceptions.PokerException;
import lombok.Getter;

import java.util.Optional;

public class PokerCard {

    private final static int CHARS_SIZE = 2;

    @Getter
    private final PokerRank rank;

    @Getter
    private final PokerSuit suit;

    public PokerCard(char[] card) {
        if(card == null || card.length != CHARS_SIZE)
            throw new PokerException("PokerCard Invalid Size Arguments");

        this.rank =
                Optional.of(PokerRank.from(card[0]))
                        .get().orElseThrow(() -> new PokerException("PokerRank Invalid Symbol"));

        this.suit =
                Optional.of(PokerSuit.from(card[1]))
                    .get().orElseThrow(() -> new PokerException("PokerSuit Invalid Symbol"));
    }

    public PokerCard(String card) {
        this(card.toCharArray());
    }
}
