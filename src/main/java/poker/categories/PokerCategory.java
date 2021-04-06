package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerResult;

import java.util.List;

public interface PokerCategory {

    default PokerResult compare(PokerCategory category) {
        return PokerResult.from(this.strength() - category.strength());
    }

    boolean match(List<PokerCard> cards);

    int strength();
}
