package J25_06_16;
class Greet{
    int a;
    static int b;
    public static void greeting() {
        System.out.println("From static method");

//        System.out.println(a); //생성 시점이 다르다. 객체생성후 호출됨
        System.out.println(b);

    }
    public void hello(){
        System.out.println("From instance method");
    }
}
public class Static {
    public static void main(String[] args){
//        Greet.hello(); // Unavailable
        Greet.greeting(); // Call without instance by 'static'

        Greet p = new Greet();
        p.hello();

    }
}
