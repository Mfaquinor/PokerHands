package poker.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    public static boolean isSequence(List<PokerRank> ranks) {
        return Collections.indexOfSubList(List.of(values()), ranks) != -1;
    }

    public static boolean hasOccurrences(List<PokerRank> ranks, long count) {
        return ranks.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .containsValue(count);
    }

    public static boolean hasDistinct(List<PokerRank> ranks, long count) {
        return ranks.stream().distinct().count() == count;
    }
}
