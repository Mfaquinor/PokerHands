package enums;

import java.util.Arrays;

public enum PokerRank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String symbol;

    PokerRank(String symbol) {
        this.symbol = symbol;
    }

    public static PokerRank from(char value) {
        return PokerRank.from(Character.toString(value));
    }

    public static PokerRank from(String value) {
        return Arrays.stream(values())
                .filter(rank -> rank.symbol.equals(value))
                .findFirst()
                .orElse(null);
    }
}
