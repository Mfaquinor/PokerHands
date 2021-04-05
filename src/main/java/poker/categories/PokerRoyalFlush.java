package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;

import java.util.List;
import java.util.stream.Collectors;

public class PokerRoyalFlush implements PokerCategory {

    private final static List<PokerRank> PATTERN =
            List.of(PokerRank.ACE, PokerRank.KING, PokerRank.QUEEN, PokerRank.JACK, PokerRank.TEN);

    @Override
    public boolean match(List<PokerCard> cards) {
        return cards.stream()
                .map(PokerCard::getRank)
                .collect(Collectors.toList())
                .equals(PATTERN);
    }

    @Override
    public int strength() {
        return 10;
    }
}
