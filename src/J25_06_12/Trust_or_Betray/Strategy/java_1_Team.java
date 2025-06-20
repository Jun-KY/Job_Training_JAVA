package J25_06_12.Trust_or_Betray.Strategy;

import J25_06_12.Trust_or_Betray.Player;

public class java_1_Team implements Player {
    final boolean[] opponentHistory;
    int recordIndex = 0;
    boolean opponentHasBetrayed = false;

    public java_1_Team(int maxRounds){
        this.opponentHistory = new boolean[10];
    }

    @Override
    public boolean cooperate(int round){
        if(round == 1){
            return true;
        }

        if(opponentHasBetrayed){
            return false;
        }

        return opponentHistory[round - 2]; // 상대의 직전 라운드 행동을 따라함
    }

    @Override
    public void recordOpponentMove(boolean opponentMove){
        opponentHistory[recordIndex++] = opponentMove;

        if(!opponentMove){
            opponentHasBetrayed = true; // 상대가 배신한 기록 저장
        }
    }
}