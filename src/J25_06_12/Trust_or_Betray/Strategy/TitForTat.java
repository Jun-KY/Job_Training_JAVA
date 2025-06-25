package J25_06_12.Trust_or_Betray.Strategy;

import J25_06_12.Trust_or_Betray.Player;

public class TitForTat implements Player {

    private final boolean[] opponentHistory;
    private int recordIndex = 0;

    /**
     * @param maxRounds 전체 라운드 수
     */
    public TitForTat(int maxRounds) {
        this.opponentHistory = new boolean[maxRounds];
        // 배열 기본값은 false
    }

    @Override
    public boolean cooperate(int round) {
        if (round == 1) {
            return true; // 첫 라운드는 무조건 협력
        }
        // 이전 라운드의 상대 선택을 그대로 따라 함
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        // 호출 순서대로 배열에 기록
        opponentHistory[recordIndex++] = opponentMove;
    }
}
