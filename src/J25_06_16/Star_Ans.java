package J25_06_16;

import java.util.Scanner;

public class Star_Ans {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j<2||j>4) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
