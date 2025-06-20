package J25_06_09;

public class Overloading {
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void greet(){
        System.out.println("Hello, World!");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void main (String[] args){
        System.out.println("a + b = " + add(1, 2));
        System.out.println("a + b + c = " + add(1, 3, 4));
        greet();
        greet("Alice");
    }


}
