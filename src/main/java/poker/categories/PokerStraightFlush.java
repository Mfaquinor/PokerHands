package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;
import java.util.stream.Collectors;

public class PokerStraightFlush implements PokerCategory {

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

        return PokerRank.isSequence(ranks) && PokerSuit.isUnique(suits);
    }

    @Override
    public int strength() {
        return 9;
    }
}
