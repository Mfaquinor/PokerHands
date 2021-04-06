package poker.application;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import poker.enums.PokerRank;
import poker.enums.PokerSuit;
import poker.exceptions.PokerException;
import lombok.Getter;

import java.util.Optional;

@ToString
@EqualsAndHashCode(of = {"rank"})
public class PokerCard implements Comparable<PokerCard> {

    private final static int CHARS_SIZE = 2;

    @Getter
    private final PokerRank rank;

    @Getter
    private final PokerSuit suit;

    public PokerCard(PokerRank rank, PokerSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

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

    @Override
    public int compareTo(PokerCard card) {
        return this.rank.compareTo(card.getRank());
    }
}
