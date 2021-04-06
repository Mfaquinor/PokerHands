package poker.application;

import org.junit.Assert;
import org.junit.Test;
import poker.enums.PokerRank;
import poker.enums.PokerSuit;

import java.util.List;

public class PokerSorterTest {

    @Test
    public void doSortCardsByRank() {
        PokerHand hand = new PokerHand("4D 2C 5C 3S 6H");

        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.SIX, PokerSuit.HEARTS),
                new PokerCard(PokerRank.FIVE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.FOUR, PokerSuit.DIAMONDS),
                new PokerCard(PokerRank.THREE, PokerSuit.SPADES),
                new PokerCard(PokerRank.TWO, PokerSuit.CLUBS));

        Assert.assertEquals(cards, hand.getCards());
    }

    @Test
    public void doSortCardsByGroup() {
        PokerHand hand = new PokerHand("9C AC 5C 5H 9H");

        List<PokerCard> cards = List.of(
                new PokerCard(PokerRank.NINE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.NINE, PokerSuit.HEARTS),
                new PokerCard(PokerRank.FIVE, PokerSuit.CLUBS),
                new PokerCard(PokerRank.FIVE, PokerSuit.HEARTS),
                new PokerCard(PokerRank.ACE, PokerSuit.CLUBS));

        Assert.assertEquals(cards, hand.getCards());
    }
}
