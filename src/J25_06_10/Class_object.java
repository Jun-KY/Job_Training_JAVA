package J25_06_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
    public int age;
    public int num;
    public String name;

    public Person (){

    }
    public Person (int age, int num, String name){
        this.age = age;
        this.num = num;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void work(){
        System.out.println("working... ");
    }

    @Override
    public String toString() {
        return num + " | " + name + " is " + age + "years old";
    }
}

class Car {
    String brand;
    int year;
    public Car(){

    };
    public Car(String brand, int year){

    }
    public void displayInfo(){
        System.out.println("Brand: " + brand + ", year: " + year);
    }
}

public class Class_object {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


//        Person person = new Person();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.print("age (if you put 0, break): "); int age = sc.nextInt();
            if (age == 0){
                break;
            }
            int num = i + 1;
            System.out.print("name: "); String name = sc.next();
            people.add(new Person(age, num, name));
        }
        for (Person p : people){
            System.out.println(p);
        }
//        Car car = new Car();
//        car.brand = "Toyota";
//        car.year = 2013;
//        System.out.println(car.brand + car.year);
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Toyota", 12));



    }
}


