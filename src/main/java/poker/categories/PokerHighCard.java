package poker.categories;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerHighCard implements PokerCategory {

    @Override
    public boolean match(List<PokerRank> ranks, List<PokerSuit> suits) {
        return !ranks.isEmpty();
    }

    @Override
    public int strength() {
        return 1;
    }
}
