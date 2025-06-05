package J25_06_04;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        for (int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++){
                System.out.print(j + " x " + i + " = " + i*j + " ");
                if (i*j < 10) System.out.print(" ");
            }
            System.out.println();
        }
//        for ( int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }
        for (int i = 1; i <= 19; i++){
            if (i >= 5) {
                System.out.print(5 + " x " + i + " = " + 5*i + " ");
            }
        }
        for (int i = 20; i >= 1; i--){
            if (i % 4 == 0){
                System.out.print("i = " + i + " ");
            }
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int num = 1;
        while(num!=0) {
            System.out.print("Number: ");
            num = sc.nextInt();
            int arr[] = new int[20];
            int bi_num = num;
            int k;
            for (k = 0; bi_num > 0; k++) {
                arr[k] = (bi_num % 2);
                bi_num /= 2;
            }

            for (int j = k - 1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }

    }
}