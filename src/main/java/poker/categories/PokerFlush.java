package poker.categories;

import poker.application.PokerCard;
import poker.enums.PokerSuit;

import java.util.List;
import java.util.stream.Collectors;

public class PokerFlush implements PokerCategory {

    @Override
    public boolean match(List<PokerCard> cards) {
        List<PokerSuit> suits =
                cards.stream()
                        .map(PokerCard::getSuit)
                        .collect(Collectors.toList());

        return PokerSuit.isUnique(suits);
    }

    @Override
    public int strength() {
        return 6;
    }
}
