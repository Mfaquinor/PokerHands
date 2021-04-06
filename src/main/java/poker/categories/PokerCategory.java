package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;
import poker.enums.PokerResult;
import poker.enums.PokerSuit;

import java.util.List;
import java.util.stream.Collectors;

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

    default boolean match(List<PokerCard> cards) {
        List<PokerRank> ranks =
                cards.stream()
                        .map(PokerCard::getRank)
                        .collect(Collectors.toList());

        List<PokerSuit> suits =
                cards.stream()
                        .map(PokerCard::getSuit)
                        .collect(Collectors.toList());

        return this.match(ranks, suits);
    }

    boolean match(List<PokerRank> ranks, List<PokerSuit> suits);

    int strength();
}
