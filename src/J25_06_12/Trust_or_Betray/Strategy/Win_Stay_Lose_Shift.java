package J25_06_12.Trust_or_Betray.Strategy;

import J25_06_12.Trust_or_Betray.Player;

import java.util.ArrayList;
import java.util.List;

public class Win_Stay_Lose_Shift implements Player {
    private final List<Boolean> myHistory;
    private final List<Boolean> opponentHistory;

    boolean nextMove;
//    private int betrayStack = 0;
//    private final int forgiveness = 2;

    public Win_Stay_Lose_Shift(int maxRounds) {
        this.opponentHistory = new ArrayList<>(maxRounds);
        this.myHistory = new ArrayList<>(maxRounds);
    }
    @Override
    public boolean cooperate(int round) {
        if (round == 1){
//            boolean randomStart = Math.random() >= 0.5;
            myHistory.add(false);
            return false;
        }
        boolean myLastMove = myHistory.get(round - 2);
        boolean opponentLastMove = opponentHistory.get(round - 2);
        boolean lastResultWin = (myLastMove && opponentLastMove) || (!myLastMove && opponentLastMove);

        if(round >= 4){
            boolean win1 = isWin(round -2);
            boolean win2 = isWin(round -3);
            boolean win3 = isWin(round -4);

            if (!win1 == !win2 && !win2 == !win3){
                if (myHistory.get(round-4))
                    nextMove = myLastMove;
            }
        }else {
            nextMove = lastResultWin ? myLastMove : !myLastMove;

        }
        // change strategy if my result are the same 3 times in a row

        myHistory.add(nextMove);
        return nextMove;

    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory.add(opponentMove);
    }

    private boolean isWin(int roundIndex) {
        if (roundIndex < 0 || roundIndex >= myHistory.size()) return false;
        boolean myMove = myHistory.get(roundIndex);
        boolean oppMove = opponentHistory.get(roundIndex);
        return (myMove && oppMove) || (!myMove && !oppMove);
    }
}
