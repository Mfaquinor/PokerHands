package poker.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PokerSorter {

    public static List<PokerCard> sort(List<PokerCard> cards) {
        return cards.stream()
                .sorted()
                .sorted(Comparator.comparing(i -> Collections.frequency(cards, i)).reversed())
                .collect(Collectors.toList());
    }

}
