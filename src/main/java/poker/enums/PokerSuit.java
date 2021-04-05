package poker.enums;

import java.util.Arrays;
import java.util.Optional;

public enum PokerSuit {
    CLUBS("C"),
    HEARTS("H"),
    SPADES("S"),
    DIAMONDS("D");

    private final String symbol;

    PokerSuit(String symbol) {
        this.symbol = symbol;
    }

    public static Optional<PokerSuit> from(char value) {
        return PokerSuit.from(Character.toString(value));
    }

    private static Optional<PokerSuit> from(String value) {
        return Arrays.stream(values())
                .filter(suit -> suit.symbol.equals(value))
                .findFirst();
    }
}
