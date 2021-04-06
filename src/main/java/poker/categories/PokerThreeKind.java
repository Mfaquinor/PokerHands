package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerThreeKind implements PokerCategory {

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return PokerRank.hasOccurrences(ranks, 3L);
    }

    @Override
    public int strength() {
        return 4;
    }
}
