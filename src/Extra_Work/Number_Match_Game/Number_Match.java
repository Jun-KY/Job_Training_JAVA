package Extra_Work.Number_Match_Game;

import java.util.Random;
import java.util.Scanner;

public class Number_Match {
    private static int number;
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);

//    public void RandNumber (int number){
//        this.number = number;
//
//    }
    public static void main(String[] args){
        int answer = (rand.nextInt(100) + 1);
        int count = 0;
        while(true){
            System.out.print("1 ~ 100, Choose number: ");
            number = sc.nextInt();
            sc.nextLine();
            if (number == answer) {
                System.out.println("you are correct");
                return;
            }else if(number < 1 || number > 100){
                System.out.println(number + " is out of bound");
            }else if(number > answer){
                System.out.println(number + " is bigger than Answer");
                count++;
            }else {
                System.out.println(number + " is smaller than Answer");
                count++;
            }
            System.out.println("You tried: " + count + "times\n");

        }
    }
}
