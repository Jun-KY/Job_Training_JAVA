package J25_06_02;

public class Assignment_operators {
    public static void main (String[] args){
        int a = 10, b = 3;
        a += 5;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a = 10; a %= b;
        System.out.println(a);


        // Increment & Decrement operator
        a = 10;
        System.out.println("a = " + a);

        System.out.println("a++, a = " + a++);
        System.out.println("now: " + a);

        System.out.println("a--, a = " + a--);
        System.out.println("now: " + a);


        System.out.println("++a, a = " + ++a);
        System.out.println("now: " + a);

        System.out.println("--a, a = " + --a);
        System.out.println("now: " + a);


    }
}
