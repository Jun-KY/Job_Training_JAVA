package J25_06_12.Trust_or_Betray;

import J25_06_12.Trust_or_Betray.Strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Game_Test {
    private static final int R = 3;
    private static final int T = 5;
    private static final int P = 1;
    private static final int S = 0;
    public static void main(String[] args){
        int rounds = 10;

        Player playerA = new Custom(rounds);
        Player playerB = new Win_Stay_Lose_Shift(rounds);
        Player playerC = new TitForTat(rounds);
        Player playerD = new One(rounds);
        Player playerE = new java_1_Team(rounds);
        List<Player> game = new ArrayList<>(5);
        game.add(playerA);
        game.add(playerB);
        game.add(playerC);
        game.add(playerD);
        game.add(playerE);
        int totalA = 0;
        int totalB = 0;

        for (int round = 1; round <= rounds; round++){
            boolean choiceA = playerA.cooperate(round);
            boolean choiceB = playerB.cooperate(round);

            if (choiceA && choiceB){
                totalA += R;
                totalB += R;
            } else if (choiceA && !choiceB) {
                totalA += S;
                totalB += T;
            } else if (!choiceA && choiceB){
                totalA += T;
                totalB += S;
            } else {
                totalA += P;
                totalB += P;
            }
            playerA.recordOpponentMove((choiceB));
            playerB.recordOpponentMove(choiceA);

            System.out.printf("Round %2d: A = %s, B = %s, -> Score: A = %d, B = %d%n",
                    round,
                    choiceA ? "Cooperate" : "Betray",
                    choiceB ? "Cooperate" : "Betray",
                    totalA, totalB);
        }

        System.out.println("===Final Score===");
        System.out.printf("Player A: %d%n | Player B: %d%n", totalA, totalB );

    }
}
