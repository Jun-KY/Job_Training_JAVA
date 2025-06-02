package J25_06_02;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mood; //= "happy";
        System.out.println("Enter your mood. : ");
        mood = sc.next();
        switch (mood) {
            case "happy":
                System.out.println("I'm happy. It's a new day to refresh");
                break;

            case "tired":
                System.out.println("I'm tired. I stayed up late last night");
                break;

            case "angry":
                System.out.println("I'm angry, cause one of my friends pissed me off");
                break;

            case "sad":
                System.out.println("I'm sad, because I broke up yesterday");
                break;

            default:
                System.out.println("I can't explain my feeling right now");
        }
//        if (mood == "happy"){
//        System.out.println("I'm happy. It's a new day to refresh");
//    }else if (mood == "tired"){
//        System.out.println("I'm tired. I stayed up late last night");
//    }
    }

}
