package J25_06_04;

public class Repeat_operator {
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
                System.out.println(5 + " x " + i + " = " + 5*i);
            }
        }
    }
}
