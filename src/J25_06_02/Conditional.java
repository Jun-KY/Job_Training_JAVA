package J25_06_02;

public class Conditional {
    public static void main (String[] args) {
        int num = 5;

        if (num > 0){
            System.out.println("number 는 0 보다 큽니다.");
        }else if (num < 0){
            System.out.println("number 는 0 보다 작습니다.");
        }
        else System.out.println("number는 0 입니다.");


        boolean avo = true;
        int milk;
        if (avo){
            milk = 6;
        }else milk = 1;
        System.out.println(milk);
    }
}
