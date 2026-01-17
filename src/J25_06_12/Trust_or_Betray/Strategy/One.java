package J25_06_12.Trust_or_Betray.Strategy;

import J25_06_12.Trust_or_Betray.Player;

public class One implements Player {
    private final boolean[] opponentHistory;
    private int recordIndex = 0;
    private boolean exploitMode = false;

    public One(int maxRound){
        this.opponentHistory = new boolean[maxRound];
    }

    @Override
    public boolean cooperate(int round) {
        if(round == 1){
            return true;
        }

        if(round == 2){
            return false;
        }

        if(round == 3){
            if(opponentHistory[0]&&opponentHistory[1]){
                return false;
            }else {
                return true;
            }
        }

        if(round == 4){
            return opponentHistory[round - 2];
        }

        if (round == 5) {
            if (opponentHistory[1] && opponentHistory[2] && opponentHistory[3]) {
                exploitMode = true;
            }
        }
        if (exploitMode) {
            return false;
        }

        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++] = opponentMove;
    }
}