package Extra_Work;

import java.util.ArrayList;
import java.util.*;

class Feedback{
    private String guess;
    private String word;
    private int WORD_LENGTH = 5;

    public Feedback(String guess, String word){
        this.word = word.toUpperCase();
        this.guess = guess.toUpperCase();
    }

    public String getFeedback(){
        char[] result = new char[WORD_LENGTH];
        boolean[] usedInSecret = new boolean[WORD_LENGTH];

        for (int i = 0; i < WORD_LENGTH; i ++){
            if (guess.charAt(i) == word.charAt(i)) {
                result [i] = 'C';
                usedInSecret[i] = true;
            }
            else{
                result [i] = '_';
            }
        }
        for (int i = 0; i < WORD_LENGTH; i++){
            if (result[i] == 'C'){
                continue;
            }
            char g = guess.charAt(i);
            boolean found = false;

            for (int j = 0; j < 5; j ++){
                if (!usedInSecret[j] && g == word.charAt(j)){
                    usedInSecret[j] = true;
                    found = true;
                    break;
                }
            }
            result[i] = found ? 'W' : 'N';


        }
        return new String(result);
    }

}


public class Wordle {
    private static final String[] WORD_LIST = {
            "APPLE", "BRAIN", "CRANE", "MUNCH", "DREAM",
            "DEPTH", "DOUBT", "DOZEN", "GUIDE", "GUEST",
            "EVENT", "ERROR", "OCCUR", "BLAME", "ABUSE"
    };

    public static void main(String[] args){

//        List<String> words = new ArrayList<>();
        final int maxTry = 6;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        String word = WORD_LIST[rn.nextInt(15)];

        System.out.println("Welcome to 'Wordle' game");
        for (int i = 1; i <= maxTry; i ++){
            System.out.println("5-letter word. " + (maxTry + 1 -i) + "times left");
            String guess = sc.nextLine().trim().toUpperCase();
            while(guess.length() != 5){
                System.out.println("Enter 5-letter word!!");
                guess = sc.nextLine().trim().toUpperCase();
            }
            Feedback fb = new Feedback(guess,word);
            System.out.println(fb.getFeedback());

            if (guess.equals(word)) {
                System.out.println("Correct!");
                return;
            }
        }
        System.out.println("Game over. The word was: " + word);
    }
}
