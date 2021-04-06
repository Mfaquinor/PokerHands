package poker.enums;

public enum PokerResult {
    WIN, DRAW, LOSS;

    public static PokerResult from(int evaluation) {
        if (evaluation == 0)
            return PokerResult.DRAW;
        else if (evaluation > 0)
            return PokerResult.WIN;
        else
            return PokerResult.LOSS;
    }
}
