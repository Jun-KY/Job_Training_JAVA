package J25_06_05;

import java.util.Scanner;

public class Temary_operator2 {
    public static void main (String[] args){
        String color = "Red";

        String choiceColor = (color == "Red") ? "Red" : (color == "Blue") ? "Blue"  :"Purple";

        System.out.println(choiceColor);

        Scanner sc = new Scanner(System.in);
        color = sc.next();

        String choiceColor1 ;

        if (color.equals("Red")) choiceColor1 = "Red";
        else if (color.equals("Blue")) choiceColor1 = "Blue";
        else if (color.equals("Purple")) choiceColor1 = "Purple";
        else choiceColor1 = "Green";
        System.out.println(choiceColor1);

    }
}
