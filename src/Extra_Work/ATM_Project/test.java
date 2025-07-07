package Extra_Work.ATM_Project;

import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("변의 길이를 입력하세요: ");
            int n = sc.nextInt();

            char[][] arr = new char[n][n];
            int ascii = 0;

            for (int sum = 0; sum <= 2 * (n - 1); sum++) {
                for (int i = 0; i <= sum; i++) {
                    int j = sum - i;
                    if (i < n && j < n) {
                        arr[i][j] = (char) (ascii + 65);
                        ascii++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();
        }

}
