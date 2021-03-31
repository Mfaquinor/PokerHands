package application;

import application.enums.Result;

public class PokerHand {

    public PokerHand(String cards) { }

    public Result compare(PokerHand hand) {
        return Result.DRAW;
    }
}
