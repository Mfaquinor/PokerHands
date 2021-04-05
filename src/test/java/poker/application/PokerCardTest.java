package poker.application;

import poker.enums.PokerRank;
import poker.enums.PokerSuit;
import poker.exceptions.PokerException;
import org.junit.Assert;
import org.junit.Test;

public class PokerCardTest {

    @Test
    public void doDiamondsTwoCardTest() {
        PokerCard card = new PokerCard("2D");

        Assert.assertEquals(PokerRank.TWO, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsThreeCardTest() {
        PokerCard card = new PokerCard("3D");

        Assert.assertEquals(PokerRank.THREE, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsFourCardTest() {
        PokerCard card = new PokerCard("4D");

        Assert.assertEquals(PokerRank.FOUR, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsFiveCardTest() {
        PokerCard card = new PokerCard("5D");

        Assert.assertEquals(PokerRank.FIVE, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsSixCardTest() {
        PokerCard card = new PokerCard("6D");

        Assert.assertEquals(PokerRank.SIX, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsSevenCardTest() {
        PokerCard card = new PokerCard("7D");

        Assert.assertEquals(PokerRank.SEVEN, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsEightCardTest() {
        PokerCard card = new PokerCard("8D");

        Assert.assertEquals(PokerRank.EIGHT, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsNineCardTest() {
        PokerCard card = new PokerCard("9D");

        Assert.assertEquals(PokerRank.NINE, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsTenCardTest() {
        PokerCard card = new PokerCard("TD");

        Assert.assertEquals(PokerRank.TEN, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsJackCardTest() {
        PokerCard card = new PokerCard("JD");

        Assert.assertEquals(PokerRank.JACK, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsQueenCardTest() {
        PokerCard card = new PokerCard("QD");

        Assert.assertEquals(PokerRank.QUEEN, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsKingCardTest() {
        PokerCard card = new PokerCard("KD");

        Assert.assertEquals(PokerRank.KING, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doDiamondsAceCardTest() {
        PokerCard card = new PokerCard("AD");

        Assert.assertEquals(PokerRank.ACE, card.getRank());
        Assert.assertEquals(PokerSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void doSpadesTwoCardTest() {
        PokerCard card = new PokerCard("2S");

        Assert.assertEquals(PokerRank.TWO, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesThreeCardTest() {
        PokerCard card = new PokerCard("3S");

        Assert.assertEquals(PokerRank.THREE, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesFourCardTest() {
        PokerCard card = new PokerCard("4S");

        Assert.assertEquals(PokerRank.FOUR, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesFiveCardTest() {
        PokerCard card = new PokerCard("5S");

        Assert.assertEquals(PokerRank.FIVE, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesSixCardTest() {
        PokerCard card = new PokerCard("6S");

        Assert.assertEquals(PokerRank.SIX, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesSevenCardTest() {
        PokerCard card = new PokerCard("7S");

        Assert.assertEquals(PokerRank.SEVEN, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesEightCardTest() {
        PokerCard card = new PokerCard("8S");

        Assert.assertEquals(PokerRank.EIGHT, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesNineCardTest() {
        PokerCard card = new PokerCard("9S");

        Assert.assertEquals(PokerRank.NINE, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesTenCardTest() {
        PokerCard card = new PokerCard("TS");

        Assert.assertEquals(PokerRank.TEN, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesJackCardTest() {
        PokerCard card = new PokerCard("JS");

        Assert.assertEquals(PokerRank.JACK, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesQueenCardTest() {
        PokerCard card = new PokerCard("QS");

        Assert.assertEquals(PokerRank.QUEEN, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesKingCardTest() {
        PokerCard card = new PokerCard("KS");

        Assert.assertEquals(PokerRank.KING, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doSpadesAceCardTest() {
        PokerCard card = new PokerCard("AS");

        Assert.assertEquals(PokerRank.ACE, card.getRank());
        Assert.assertEquals(PokerSuit.SPADES, card.getSuit());
    }

    @Test
    public void doHeartsTwoCardTest() {
        PokerCard card = new PokerCard("2H");

        Assert.assertEquals(PokerRank.TWO, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsThreeCardTest() {
        PokerCard card = new PokerCard("3H");

        Assert.assertEquals(PokerRank.THREE, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsFourCardTest() {
        PokerCard card = new PokerCard("4H");

        Assert.assertEquals(PokerRank.FOUR, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsFiveCardTest() {
        PokerCard card = new PokerCard("5H");

        Assert.assertEquals(PokerRank.FIVE, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsSixCardTest() {
        PokerCard card = new PokerCard("6H");

        Assert.assertEquals(PokerRank.SIX, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsSevenCardTest() {
        PokerCard card = new PokerCard("7H");

        Assert.assertEquals(PokerRank.SEVEN, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsEightCardTest() {
        PokerCard card = new PokerCard("8H");

        Assert.assertEquals(PokerRank.EIGHT, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsNineCardTest() {
        PokerCard card = new PokerCard("9H");

        Assert.assertEquals(PokerRank.NINE, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsTenCardTest() {
        PokerCard card = new PokerCard("TH");

        Assert.assertEquals(PokerRank.TEN, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsJackCardTest() {
        PokerCard card = new PokerCard("JH");

        Assert.assertEquals(PokerRank.JACK, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsQueenCardTest() {
        PokerCard card = new PokerCard("QH");

        Assert.assertEquals(PokerRank.QUEEN, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsKingCardTest() {
        PokerCard card = new PokerCard("KH");

        Assert.assertEquals(PokerRank.KING, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doHeartsAceCardTest() {
        PokerCard card = new PokerCard("AH");

        Assert.assertEquals(PokerRank.ACE, card.getRank());
        Assert.assertEquals(PokerSuit.HEARTS, card.getSuit());
    }

    @Test
    public void doClubsTwoCardTest() {
        PokerCard card = new PokerCard("2C");

        Assert.assertEquals(PokerRank.TWO, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsThreeCardTest() {
        PokerCard card = new PokerCard("3C");

        Assert.assertEquals(PokerRank.THREE, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsFourCardTest() {
        PokerCard card = new PokerCard("4C");

        Assert.assertEquals(PokerRank.FOUR, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsFiveCardTest() {
        PokerCard card = new PokerCard("5C");

        Assert.assertEquals(PokerRank.FIVE, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsSixCardTest() {
        PokerCard card = new PokerCard("6C");

        Assert.assertEquals(PokerRank.SIX, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsSevenCardTest() {
        PokerCard card = new PokerCard("7C");

        Assert.assertEquals(PokerRank.SEVEN, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsEightCardTest() {
        PokerCard card = new PokerCard("8C");

        Assert.assertEquals(PokerRank.EIGHT, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsNineCardTest() {
        PokerCard card = new PokerCard("9C");

        Assert.assertEquals(PokerRank.NINE, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsTenCardTest() {
        PokerCard card = new PokerCard("TC");

        Assert.assertEquals(PokerRank.TEN, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsJackCardTest() {
        PokerCard card = new PokerCard("JC");

        Assert.assertEquals(PokerRank.JACK, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsQueenCardTest() {
        PokerCard card = new PokerCard("QC");

        Assert.assertEquals(PokerRank.QUEEN, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsKingCardTest() {
        PokerCard card = new PokerCard("KC");

        Assert.assertEquals(PokerRank.KING, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doClubsAceCardTest() {
        PokerCard card = new PokerCard("AC");

        Assert.assertEquals(PokerRank.ACE, card.getRank());
        Assert.assertEquals(PokerSuit.CLUBS, card.getSuit());
    }

    @Test
    public void doExceptionWithEmptyArgument() {
        PokerException exception =
                Assert.assertThrows(PokerException.class, () -> new PokerCard(""));

        Assert.assertEquals("PokerCard Invalid Size Arguments", exception.getMessage());
    }

    @Test
    public void doExceptionWithOneArgument() {
        PokerException exception =
                Assert.assertThrows(PokerException.class, () -> new PokerCard("1"));

        Assert.assertEquals("PokerCard Invalid Size Arguments", exception.getMessage());
    }

    @Test
    public void doExceptionWithManyArguments() {
        PokerException exception =
                Assert.assertThrows(PokerException.class, () -> new PokerCard("ACE"));

        Assert.assertEquals("PokerCard Invalid Size Arguments", exception.getMessage());
    }

    @Test
    public void doExceptionWithInvalidRank() {
        PokerException exception =
                Assert.assertThrows(PokerException.class, () -> new PokerCard("1D"));

        Assert.assertEquals("PokerRank Invalid Symbol", exception.getMessage());
    }

    @Test
    public void doExceptionWithInvalidSuit() {
        PokerException exception =
                Assert.assertThrows(PokerException.class, () -> new PokerCard("AL"));

        Assert.assertEquals("PokerSuit Invalid Symbol", exception.getMessage());
    }
}
