package poker.categories;

import poker.application.PokerCard;

import java.util.List;

public interface PokerCategory {

    boolean match(List<PokerCard> cards);

    int strength();
}
