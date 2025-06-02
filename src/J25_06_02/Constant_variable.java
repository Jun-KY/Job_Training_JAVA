package J25_06_02;

public class Constant_variable {
    public static void main(String[] args){

        final int A = 10;

        System.out.println(A);

//        java: cannot assign a value to final variable a
//        a = 11;

//        System.out.println(a);
        final int DAYS_IN_WEEK = 7;
        final double PI = 3.141592;
        final String GREETING = "Hello, world";
        System.out.println("Days in a week: "+DAYS_IN_WEEK);
        System.out.println("Value of PI: " + PI);
        System.out.println("Greeting: " + GREETING);

    }

}
