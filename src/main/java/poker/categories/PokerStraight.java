package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerStraight implements PokerCategory {

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return PokerRank.isSequence(ranks);
    }

    @Override
    public int strength() {
        return 5;
    }
}
