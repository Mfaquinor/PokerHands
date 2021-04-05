package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;

import java.util.List;
import java.util.stream.Collectors;

public class PokerTwoPair implements PokerCategory {

    @Override
    public boolean match(List<PokerCard> cards) {
        List<PokerRank> ranks =
                cards.stream()
                        .map(PokerCard::getRank)
                        .collect(Collectors.toList());

        return PokerRank.hasOccurrences(ranks, 2L) && PokerRank.hasDistinct(ranks, 3L);
    }

    @Override
    public int strength() {
        return 3;
    }
}
