package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerRoyalFlush implements PokerCategory {

    private final static List<PokerRank> PATTERN =
            List.of(PokerRank.ACE, PokerRank.KING, PokerRank.QUEEN, PokerRank.JACK, PokerRank.TEN);

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return ranks.equals(PATTERN) && PokerSuit.isUnique(suits);
    }

    @Override
    public int strength() {
        return 10;
    }
}
