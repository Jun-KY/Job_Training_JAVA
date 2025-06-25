package Practice_Quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz_1 {
    //Q1
    public static int getFullPageCount(int itemsCount, int itemsPerPage){
        return itemsCount/itemsPerPage;
    }
    //Q2
    public static  int getProductAbs(int x, int y){
        int mul = x * y;
        if(mul < 0){
            mul *= -1;
        }
        return mul;
    }
    //Q3
    public static List<Integer> getDivisorSum(int n){
        List<Integer> divisor = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                divisor.add(i);
            }
        }
        return divisor;
    }
    //Q4
    public static boolean checkBrackets(String s){
        return true;
    }

    public static void main(String[] args){
//        Q1)
        System.out.println(getFullPageCount(10,5));
        System.out.println(getFullPageCount(7, 2));
//        Q2)
        System.out.println(getProductAbs(10, 20));
        System.out.println(getProductAbs(20, -40));
//        Q3)
        System.out.println(getDivisorSum(12));
        System.out.println(getDivisorSum(5));




    }
}
