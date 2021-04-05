package poker.categories;

import org.junit.Assert;
import org.junit.Test;
import poker.application.PokerCard;
import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerCategoryTest {

    @Test
    public void doRoyalFlushCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.ACE, PokerSuit.HEARTS),
                new PokerCard(PokerRank.KING, PokerSuit.HEARTS),
                new PokerCard(PokerRank.QUEEN, PokerSuit.HEARTS),
                new PokerCard(PokerRank.JACK, PokerSuit.HEARTS),
                new PokerCard(PokerRank.TEN, PokerSuit.HEARTS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerRoyalFlush);
        Assert.assertEquals(10, category.strength());
    }

    @Test
    public void doStraightFlushCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.NINE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.EIGHT, PokerSuit.CLUBS),
                new PokerCard(PokerRank.SEVEN, PokerSuit.CLUBS),
                new PokerCard(PokerRank.SIX, PokerSuit.CLUBS),
                new PokerCard(PokerRank.FIVE, PokerSuit.CLUBS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerStraightFlush);
        Assert.assertEquals(9, category.strength());
    }

    @Test
    public void doFourKindCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.ACE, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.ACE, PokerSuit.SPADES),
                new PokerCard(PokerRank.ACE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.ACE, PokerSuit.HEARTS),
                new PokerCard(PokerRank.EIGHT, PokerSuit.CLUBS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerFourKind);
        Assert.assertEquals(8, category.strength());
    }

    @Test
    public void doFullHouseCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.KING, PokerSuit.SPADES),
                new PokerCard(PokerRank.KING, PokerSuit.CLUBS),
                new PokerCard(PokerRank.KING, PokerSuit.HEARTS),
                new PokerCard(PokerRank.TEN, PokerSuit.CLUBS),
                new PokerCard(PokerRank.TEN, PokerSuit.HEARTS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerFullHouse);
        Assert.assertEquals(7, category.strength());
    }

    @Test
    public void doFlushCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.QUEEN, PokerSuit.CLUBS),
                new PokerCard(PokerRank.EIGHT, PokerSuit.CLUBS),
                new PokerCard(PokerRank.SIX, PokerSuit.CLUBS),
                new PokerCard(PokerRank.FOUR, PokerSuit.CLUBS),
                new PokerCard(PokerRank.THREE, PokerSuit.CLUBS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerFlush);
        Assert.assertEquals(6, category.strength());
    }

    @Test
    public void doStraightCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.SIX, PokerSuit.CLUBS),
                new PokerCard(PokerRank.FIVE, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.FOUR, PokerSuit.SPADES),
                new PokerCard(PokerRank.THREE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.TWO, PokerSuit.DIAMONDS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerStraight);
        Assert.assertEquals(5, category.strength());
    }

    @Test
    public void doThreeKindCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.JACK, PokerSuit.CLUBS),
                new PokerCard(PokerRank.JACK, PokerSuit.HEARTS),
                new PokerCard(PokerRank.JACK, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.EIGHT, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.FIVE, PokerSuit.CLUBS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerThreeKind);
        Assert.assertEquals(4, category.strength());
    }

    @Test
    public void doTwoPairCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.KING, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.TEN, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.TEN, PokerSuit.CLUBS),
                new PokerCard(PokerRank.SIX, PokerSuit.SPADES),
                new PokerCard(PokerRank.SIX, PokerSuit.CLUBS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerTwoPair);
        Assert.assertEquals(3, category.strength());
    }

    @Test
    public void doOnePairCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.ACE, PokerSuit.HEARTS),
                new PokerCard(PokerRank.ACE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.EIGHT, PokerSuit.SPADES),
                new PokerCard(PokerRank.SIX, PokerSuit.HEARTS),
                new PokerCard(PokerRank.TWO, PokerSuit.DIAMONDS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerOnePair);
        Assert.assertEquals(2, category.strength());
    }

    @Test
    public void doHighCardCategoryTest() {
        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.THREE, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.SIX, PokerSuit.HEARTS),
                new PokerCard(PokerRank.TEN, PokerSuit.CLUBS),
                new PokerCard(PokerRank.JACK, PokerSuit.SPADES),
                new PokerCard(PokerRank.KING, PokerSuit.HEARTS));

        PokerCategory category =
                PokerCategoryService.evaluate(cards);

        Assert.assertTrue(category instanceof PokerHighCard);
        Assert.assertEquals(1, category.strength());
    }
}
