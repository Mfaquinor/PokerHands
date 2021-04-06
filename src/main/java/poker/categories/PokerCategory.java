package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerResult;

import java.util.List;

public interface PokerCategory {

    default PokerResult compare(PokerCategory category) {
        return PokerResult.from(this.strength() - category.strength());
    }

    default boolean equals(PokerCategory category) {
        return this.getClass().equals(category.getClass());
    }
    
    default boolean different(PokerCategory category) {
        return !this.equals(category);
    }

    boolean match(List<PokerCard> cards);

    int strength();
}
