package J25_06_16;
interface Calculator{
    int compute (int a, int b);
}

public class Main {
    public static void main(String[] args){
        Calculator mulSquare = new Calculator(){

            @Override
            public int compute(int a, int b) {
//                return a * b * a * b;
                return (int) Math.pow(a * b , 2);
            }
        };
        System.out.println(mulSquare.compute(3,4));

        Calculator putNumTogether = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return Integer.parseInt("" + a + b);
            }
        };

        System.out.println(putNumTogether.compute(5, 3));


    }
}
