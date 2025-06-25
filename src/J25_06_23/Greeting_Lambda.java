package J25_06_23;
@FunctionalInterface
interface Greeting{
    void sayHello(String name);


}
public class Greeting_Lambda {
    public static void main(String[] args){
        Greeting greeting = (name -> System.out.println("Hello, "+ name + "!"));
        greeting.sayHello("Alice");
    }
}
