package J25_06_05;

public class Temary_operator {
    public static void main(String[] args){
        int a = 10;
        int b = 13;

        int max = (a > b) ? a : b;

        System.out.println(max);

        int max1;
        if (a > b){
            max1 = a;
        } else max1 = b;
        System.out.println(max1);

        int score = 61;

        String res = (score > 60) ? "pass" : "fail";
        System.out.println("result: " + res);

        String res1;
        if (score > 60) res1 = "pass";
        else res1 = "fail";
        System.out.println("result: " + res1);
    }
}
