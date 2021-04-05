package poker.categories;

import poker.application.PokerCard;

import java.util.List;

public abstract class PokerCategoryService {
    private static final List<PokerCategory> categories = List.of(
            new PokerRoyalFlush(),
            new PokerStraightFlush(),
            new PokerFourKind(),
            new PokerFullHouse(),
            new PokerFlush(),
            new PokerStraight(),
            new PokerThreeKind(),
            new PokerTwoPair(),
            new PokerOnePair(),
            new PokerHighCard());

    public static PokerCategory evaluate(List<PokerCard> cards) {
        return categories.stream()
                .filter(category -> category.match(cards))
                .findFirst()
                .orElse(new PokerHighCard());
    }
}
