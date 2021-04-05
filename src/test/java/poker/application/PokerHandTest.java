package poker.application;

import poker.enums.PokerResult;
import org.junit.Assert;
import org.junit.Test;

public class PokerHandTest {

    @Test
    public void do1thCaseTest() {
        PokerResult game =
                new PokerHand("9C TC JC QC KC")
                        .compare(new PokerHand("9C 9H 5C 5H AC"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do2thCaseTest() {
        PokerResult game =
                new PokerHand("TC TH 5C 5H KH")
                        .compare(new PokerHand("9C 9H 5C 5H AC"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do3thCaseTest() {
        PokerResult game =
                new PokerHand("TS TD KC JC 7C")
                        .compare(new PokerHand("JS JC AS KC TD"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do4thCaseTest() {
        PokerResult game =
                new PokerHand("7H 7C QC JS TS")
                        .compare(new PokerHand("7D 7C JS TS 6D"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do5thCaseTest() {
        PokerResult game =
                new PokerHand("5S 5D 8C 7S 6H")
                        .compare(new PokerHand("7D 7S 5S 5D JS"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do6thCaseTest() {
        PokerResult game =
                new PokerHand("AS AD KD 7C 3D")
                        .compare(new PokerHand("AD AH KD 7C 4S"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do7thCaseTest() {
        PokerResult game =
                new PokerHand("TS JS QS KS AS")
                        .compare(new PokerHand("AC AH AS AS KS"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do8thCaseTest() {
        PokerResult game =
                new PokerHand("TS JS QS KS AS")
                        .compare(new PokerHand("TC JS QC KS AC"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do9thCaseTest() {
        PokerResult game =
                new PokerHand("TS JS QS KS AS")
                        .compare(new PokerHand("QH QS QC AS 8H"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do10thCaseTest() {
        PokerResult game =
                new PokerHand("AC AH AS AS KS")
                        .compare(new PokerHand("TC JS QC KS AC"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do11thCaseTest() {
        PokerResult game =
                new PokerHand("AC AH AS AS KS")
                        .compare(new PokerHand("QH QS QC AS 8H"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do12thCaseTest() {
        PokerResult game =
                new PokerHand("TC JS QC KS AC")
                        .compare(new PokerHand("QH QS QC AS 8H"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do13thCaseTest() {
        PokerResult game =
                new PokerHand("7H 8H 9H TH JH")
                        .compare(new PokerHand("JH JC JS JD TH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do14thCaseTest() {
        PokerResult game =
                new PokerHand("7H 8H 9H TH JH")
                        .compare(new PokerHand("4H 5H 9H TH JH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do15thCaseTest() {
        PokerResult game =
                new PokerHand("7H 8H 9H TH JH")
                        .compare(new PokerHand("7C 8S 9H TH JH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do16thCaseTest() {
        PokerResult game =
                new PokerHand("7H 8H 9H TH JH")
                        .compare(new PokerHand("TS TH TD JH JD"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do17thCaseTest() {
        PokerResult game =
                new PokerHand("7H 8H 9H TH JH")
                        .compare(new PokerHand("JH JD TH TC 4C"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do18thCaseTest() {
        PokerResult game =
                new PokerHand("JH JC JS JD TH")
                        .compare(new PokerHand("4H 5H 9H TH JH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do19thCaseTest() {
        PokerResult game =
                new PokerHand("JH JC JS JD TH")
                        .compare(new PokerHand("7C 8S 9H TH JH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do20thCaseTest() {
        PokerResult game =
                new PokerHand("JH JC JS JD TH")
                        .compare(new PokerHand("TS TH TD JH JD"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do21thCaseTest() {
        PokerResult game =
                new PokerHand("JH JC JS JD TH")
                        .compare(new PokerHand("JH JD TH TC 4C"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do22thCaseTest() {
        PokerResult game =
                new PokerHand("4H 5H 9H TH JH")
                        .compare(new PokerHand("7C 8S 9H TH JH"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do23thCaseTest() {
        PokerResult game =
                new PokerHand("4H 5H 9H TH JH")
                        .compare(new PokerHand("TS TH TD JH JD"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do24thCaseTest() {
        PokerResult game =
                new PokerHand("4H 5H 9H TH JH")
                        .compare(new PokerHand("JH JD TH TC 4C"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do25thCaseTest() {
        PokerResult game =
                new PokerHand("7C 8S 9H TH JH")
                        .compare(new PokerHand("TS TH TD JH JD"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do26thCaseTest() {
        PokerResult game =
                new PokerHand("7C 8S 9H TH JH")
                        .compare(new PokerHand("JH JD TH TC 4C"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do27thCaseTest() {
        PokerResult game =
                new PokerHand("TS TH TD JH JD")
                        .compare(new PokerHand("JH JD TH TC 4C"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do28thCaseTest() {
        PokerResult game =
                new PokerHand("2S 3H 4D 5H 6D")
                        .compare(new PokerHand("5H 6D 7H 8C 9C"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do29thCaseTest() {
        PokerResult game =
                new PokerHand("2S 3H 4D 5H 6D")
                        .compare(new PokerHand("2S 3H 4D 5H 6C"));

        Assert.assertEquals(game, PokerResult.DRAW);
    }

    @Test
    public void do30thCaseTest() {
        PokerResult game =
                new PokerHand("2H 3H 4H 5H 7H")
                        .compare(new PokerHand("2D 3D 4D 5D 8D"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do31thCaseTest() {
        PokerResult game =
                new PokerHand("2S 2H 2D 5H 6D")
                        .compare(new PokerHand("5H 5D 5H 8C 9C"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do32thCaseTest() {
        PokerResult game =
                new PokerHand("2H 3H 4H 5H 6H")
                        .compare(new PokerHand("5H 6H 7H 8H 9H"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do33thCaseTest() {
        PokerResult game =
                new PokerHand("TH JH QH KH AH")
                        .compare(new PokerHand("TC JC QC KC AC"));

        Assert.assertEquals(game, PokerResult.DRAW);
    }

    @Test
    public void do34thCaseTest() {
        PokerResult game =
                new PokerHand("TH TH TH TH AS")
                        .compare(new PokerHand("9C 9C 9C 9C 2S"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do35thCaseTest() {
        PokerResult game =
                new PokerHand("TH TH TH AH AS")
                        .compare(new PokerHand("9C 9C 9C 2C 2S"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do36thCaseTest() {
        PokerResult game =
                new PokerHand("2H 4H 6H 8H AS")
                        .compare(new PokerHand("3C 5C 6C 8C JS"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do37thCaseTest() {
        PokerResult game =
                new PokerHand("2H 2H 2H AH AS")
                        .compare(new PokerHand("2C 2C 2C JC JS"));

        Assert.assertEquals(game, PokerResult.WIN);
    }

    @Test
    public void do38thCaseTest() {
        PokerResult game =
                new PokerHand("2H 2H 5H AH AS")
                        .compare(new PokerHand("2C 2C 6C AC AS"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do39thCaseTest() {
        PokerResult game =
                new PokerHand("2H 3C 3D 3S 6H")
                        .compare(new PokerHand("2C 3D 4D 5C 6C"));

        Assert.assertEquals(game, PokerResult.LOSS);
    }

    @Test
    public void do40thCaseTest() {
        PokerResult game =
                new PokerHand("AS 2S 5S 8S QS")
                        .compare(new PokerHand("KS JS 5S 8S QS"));

        Assert.assertEquals(game, PokerResult.WIN);
    }
}
