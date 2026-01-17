package J25_06_12.Trust_or_Betray;

import J25_06_12.Trust_or_Betray.Strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Game_Test_auto {
    private static final int R = 3;
    private static final int T = 5;
    private static final int P = 1;
    private static final int S = 0;

    private static final int ROUNDS = 10;

    public static void main(String[] args) {
        List<Player> strategies = new ArrayList<>();
        strategies.add(new Custom(ROUNDS));
        strategies.add(new Win_Stay_Lose_Shift(ROUNDS));
        strategies.add(new TitForTat(ROUNDS));
        strategies.add(new One(ROUNDS));
        strategies.add(new java_1_Team(ROUNDS));

        String[] names = {"Custom", "WSLS", "TitForTat", "One", "java_1_Team"};

        int numPlayers = strategies.size();
        int[] totalScores = new int[numPlayers]; // sum of scores across all matches

        // All-vs-All round-robin
        for (int i = 0; i < numPlayers; i++) {
            for (int j = i + 1; j < numPlayers; j++) {
                Player playerA = clonePlayer(strategies.get(i), ROUNDS);
                Player playerB = clonePlayer(strategies.get(j), ROUNDS);

                int scoreA = 0;
                int scoreB = 0;

                System.out.printf("== Match: %s vs %s ==%n", names[i], names[j]);

                for (int round = 1; round <= ROUNDS; round++) {
                    boolean moveA = playerA.cooperate(round);
                    boolean moveB = playerB.cooperate(round);

                    if (moveA && moveB) {
                        scoreA += R;
                        scoreB += R;
                    } else if (moveA && !moveB) {
                        scoreA += S;
                        scoreB += T;
                    } else if (!moveA && moveB) {
                        scoreA += T;
                        scoreB += S;
                    } else {
                        scoreA += P;
                        scoreB += P;
                    }

                    playerA.recordOpponentMove(moveB);
                    playerB.recordOpponentMove(moveA);

                    System.out.printf("Round %2d: %s = %s, %s = %s → Score: %d - %d%n",
                            round,
                            names[i], moveA ? "Cooperate" : "Betray",
                            names[j], moveB ? "Cooperate" : "Betray",
                            scoreA, scoreB
                    );
                }

                // Update total tournament score
                totalScores[i] += scoreA;
                totalScores[j] += scoreB;

                System.out.printf("Final Score → %s: %d | %s: %d%n%n", names[i], scoreA, names[j], scoreB);
            }
        }

        // Print tournament summary
        System.out.println("=== Total Tournament Scores ===");
        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("%s: %d points%n", names[i], totalScores[i]);
        }
    }

    // Cloning players for clean match state
    private static Player clonePlayer(Player player, int rounds) {
        if (player instanceof Custom) return new Custom(rounds);
        if (player instanceof Win_Stay_Lose_Shift) return new Win_Stay_Lose_Shift(rounds);
        if (player instanceof TitForTat) return new TitForTat(rounds);
        if (player instanceof One) return new One(rounds);
        if (player instanceof java_1_Team) return new java_1_Team(rounds);
        throw new IllegalArgumentException("Unknown player type: " + player.getClass());
    }
}
