package J25_06_16;

class Car {
    String brand;
    Engine engine;
    public Car(String brand){
        this.brand = brand;
        this.engine = new Engine();
    }
    class Engine{
        public void start(){
            System.out.println("The engine of " + brand + " is starting. ");
        }
    }
    public void startEngine(){
        engine.start();
    }
}

public class Vehicle{
    public static void main(String[] args){
        Car car1 = new Car("Hyundai");
        car1.startEngine();

//        Car.Engine.start();
    }

}
