package J25_06_13;

public class Interface_prac {
    public static void main(String[] args){

        Shape s1 = new Circle(5.4);
        Shape s2 = new Square(3.3);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
