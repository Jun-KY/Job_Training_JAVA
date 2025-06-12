package J25_06_12.Trust_or_Betray;

public interface Player {
    /**
     * 현재 라운드 번호를 바탕으로 행동 선택
     * @param round 현재 라운드 번호 (1부터 시작 ~ 10)
     * @return true = 협력(Cooperate), false = 배신(Defect)
     */
    boolean cooperate(int round);

    /**
     * 상대의 이전 선택을 기록
     * @param opponentMove true = 협력, false = 배신
     */
    void recordOpponentMove(boolean opponentMove);
}
