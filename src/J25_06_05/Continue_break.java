package J25_06_05;

public class Continue_break {
    public static void main(String[] args){
        for (int i = 1; i <= 1000; i++){
            if (i % 2 != 0 || i % 3 != 0){
                if (i >= 100) {
                    break;
                }
                continue;
            }

            System.out.println(i);
        }

        for(int i = 1; i <= 20; i++){
                if(i % 5 != 0) {
                    if (i>=15) {
                        break;
                    }
                    System.out.print(i +" ");
                }
        }
    }
}
