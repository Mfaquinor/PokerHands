package poker.enums;

import java.util.Arrays;
import java.util.Optional;

public enum PokerRank implements Comparable<PokerRank> {
    ACE("A"),
    KING("K"),
    QUEEN("Q"),
    JACK("J"),
    TEN("T"),
    NINE("9"),
    EIGHT("8"),
    SEVEN("7"),
    SIX("6"),
    FIVE("5"),
    FOUR("4"),
    THREE("3"),
    TWO("2");

    private final String symbol;

    PokerRank(String symbol) {
        this.symbol = symbol;
    }

    public static Optional<PokerRank> from(char value) {
        return PokerRank.from(Character.toString(value));
    }

    public static Optional<PokerRank> from(String value) {
        return Arrays.stream(values())
                .filter(rank -> rank.symbol.equals(value))
                .findFirst();
    }
}
