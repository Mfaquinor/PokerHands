package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;
import java.util.stream.Collectors;

public class PokerRoyalFlush implements PokerCategory {

    private final static List<PokerRank> PATTERN =
            List.of(PokerRank.ACE, PokerRank.KING, PokerRank.QUEEN, PokerRank.JACK, PokerRank.TEN);

    @Override
    public boolean match(List<PokerCard> cards) {
        List<PokerRank> ranks =
                cards.stream()
                        .map(PokerCard::getRank)
                        .collect(Collectors.toList());

        List<PokerSuit> suits =
                cards.stream()
                        .map(PokerCard::getSuit)
                        .collect(Collectors.toList());

        return ranks.equals(PATTERN) && PokerSuit.isUnique(suits);
    }

    @Override
    public int strength() {
        return 10;
    }
}
