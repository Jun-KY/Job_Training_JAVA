package J25_06_11;

import java.math.BigDecimal;
import java.util.Scanner;

public class print {
    public static void main (String[] args){
        String name = "Son";
        int PlayerNumber = 7;
        double pi = 3.1415926535;
        double pi_long = Math.PI;
        Scanner sc = new Scanner(System.in);

        System.out.println((name + PlayerNumber).getClass());
        System.out.println((name + PlayerNumber).getClass().getName());//참조타입
        System.out.print("\n");
        System.out.print("\\");
        System.out.print("\t");
        System.out.print("\" \"");
        System.out.printf("%s is %d\n",name, PlayerNumber);
        System.out.printf("Pi: %.6f\n", pi);
        System.out.printf("Pi: %.16f\n", pi_long);
        System.out.printf("Pi in Integer: %d\n", (int)pi_long);
        System.out.printf("Pi in Float: %f\n", (float)pi_long);

        double num;
        num = sc.nextDouble();
        System.out.printf("%.2f",num);
        String input;
        char character;
        input = sc.next();
        character = input.charAt(0);
        System.out.println(input + "charAt(0): " + character);

    }
}
