package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerFullHouse implements PokerCategory {

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return PokerRank.hasOccurrences(ranks, 3L) && PokerRank.hasOccurrences(ranks, 2L);
    }

    @Override
    public int strength() {
        return 7;
    }
}
