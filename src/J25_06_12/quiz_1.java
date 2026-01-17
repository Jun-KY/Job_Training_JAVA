package J25_06_12;

import J25_06_11.Banding_Machine;

class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }
    public void display(){
        System.out.println("brand: " + brand);
    }
}

class Car extends Vehicle{
    String model;

    public Car (String brand, String model){
        super(brand);
        this.model = model;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("model: " + model);
    }
}

public class quiz_1 {
    public static void main(String[] args){
        Car car = new Car("BMW", "M4");
        car.display();
    }
}
