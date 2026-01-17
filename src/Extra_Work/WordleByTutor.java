package Extra_Work;
import java.util.Random;
import java.util.Scanner;

public class WordleByTutor {
    private static final String[] WORD_LIST = {
            "APPLE", "BRAIN", "CRANE", "DREAM", "EAGLE",
            "FRAME", "GRACE", "HOUSE", "INPUT", "JUDGE"
    };
    private static final int MAX_ATTEMPTS = 6;
    private static final int WORD_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = pickRandomWord();
//        System.out.println("정답(디버그용): " + answer);

        System.out.println("=== Wordle 게임 ===");
        System.out.println("5글자 단어를 맞춰보세요. 총 6번의 기회가 있습니다.");
        System.out.println("C: 정확한 위치, W: 단어에는 있으나 위치 불일치, N: 단어에 없음");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            String guess;

            while (true) {
                System.out.print("\n[" + attempt + "/" + MAX_ATTEMPTS + "] 추측> ");
                guess = scanner.nextLine().trim().toUpperCase();
                if (guess.length() == WORD_LENGTH) {
                    break;
                }
                System.out.println("5글자 단어를 입력하세요.");
            }

            Feedback fb = evaluateGuess(guess, answer);

            System.out.println(fb.getWordResultCheck());

            if(fb.isAllCorrect()) {
                System.out.println("🎉 정답입니다! " + attempt + "번 만에 맞추셨군요.");
                scanner.close();
                return;
            }
        }

        System.out.println("\n😭 6번의 기회를 모두 사용하셨습니다. 정답은 " + answer + "였습니다.");
        scanner.close();
    }

    public static String pickRandomWord() {
        Random rand = new Random();

        return WORD_LIST[rand.nextInt(WORD_LIST.length)];
    }

    // C - 알파벳 o, 자리 o
    // W - 알파벳 o, 자리 x
    // N - 알파벳 x, 자리 x
    private static class Feedback {
        private final char[] resultSymbols;

        Feedback(char[] resultSymbols) {
            this.resultSymbols = resultSymbols;
        }

        boolean isAllCorrect() {
            for (char c: resultSymbols) {
                if (c != 'C') {
                    return false;
                }
            }
            return true;
        }

        String getWordResultCheck() {
            StringBuilder sb = new StringBuilder();

            for (char c: resultSymbols) {
                sb.append(c);
            }

            return sb.toString();
        }
    }

    private static Feedback evaluateGuess(String guess, String answer) {
        char[] symbols = new char[WORD_LENGTH];
        int[] count = new int[26];

        for (char c: answer.toCharArray()) {
            count[c - 'A']++;
        }

        for (int i = 0; i < WORD_LENGTH; i++) {
            if(guess.charAt(i) == answer.charAt(i)) {
                symbols[i] = 'C';
                count[guess.charAt(i) - 'A']--;
            }
        }

        for (int i = 0; i < WORD_LENGTH; i++) {
            if (symbols[i] != 0) continue;

            char c = guess.charAt(i);

            if (count[c - 'A'] > 0) {
                symbols[i] = 'W';
            } else {
                symbols[i] = 'N';
            }
        }

        return new Feedback(symbols);
    }
}
