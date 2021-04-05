package poker.categories;

import poker.application.PokerCard;

import java.util.List;

public class PokerHighCard implements PokerCategory {

    @Override
    public boolean match(List<PokerCard> cards) {
        return !cards.isEmpty();
    }

    @Override
    public int strength() {
        return 1;
    }
}
