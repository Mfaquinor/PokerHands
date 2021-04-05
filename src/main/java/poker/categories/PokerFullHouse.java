package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;

import java.util.List;
import java.util.stream.Collectors;

public class PokerFullHouse implements PokerCategory {

    @Override
    public boolean match(List<PokerCard> cards) {
        List<PokerRank> ranks =
                cards.stream()
                        .map(PokerCard::getRank)
                        .collect(Collectors.toList());

        return PokerRank.hasOccurrences(ranks, 3L) && PokerRank.hasOccurrences(ranks, 2L);
    }

    @Override
    public int strength() {
        return 7;
    }
}
