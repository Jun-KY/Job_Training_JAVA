package J25_06_16;

public class Star {
    public static void main(String[] args){
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for (int j = 5; j > i; j --){
                System.out.print(" ");

            }
            for (int k = 0; k < i; k++){
                System.out.print(k+1 + " ");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < 6-i; j++){
                System.out.print(" ");
            }
            for (int k = 4; k > 5-i; k --){
                System.out.print(5-k + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++){
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++ ){
                if (k == 1 || k == i * 2 - 1 || i == rows) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
    }

    }
}
