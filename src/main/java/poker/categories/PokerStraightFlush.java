package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerStraightFlush implements PokerCategory {

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return PokerRank.isSequence(ranks) && PokerSuit.isUnique(suits);
    }

    @Override
    public int strength() {
        return 9;
    }
}
