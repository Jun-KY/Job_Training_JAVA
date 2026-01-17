package J25_06_16;

interface Greeting{
    void greet();
}

/*
class callGreeting implements Greeting{
    @Override
    public void greet() {
        System.out.println("This is from implements Greeting");
    }
}
 */  //No Need. but Everytime you have to make it in 'main'


public class Anonymous_Class {

    public static void main (String[] args){

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous class");
            }
        };

        greeting.greet();

    }
}
