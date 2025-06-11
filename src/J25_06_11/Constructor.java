package J25_06_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
    String name;
    int age;
    String Nickname;

    public Person (){

    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Car{
    String brand;
    int year;
    String Nickname;

    public Car(){

    }
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public Car(String brand, int year, String Nickname){
        this.brand = brand;
        this.year = year;
        this.Nickname = Nickname;
    }
    public void displayInfo(){
        String displayNickname = this.Nickname.equals("") ? "" : this.Nickname;
        System.out.println(brand + " - " + year + displayNickname);
    }
}
public class Constructor {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();

        for (int i = 0; i<3; i ++){
            people.add (new Person("Michael", 23));
            people.add (new Person("Michalle", 30));

        }
        System.out.println(people.toArray().length);
        for (Person p : people){
            System.out.println(p.name + ", " + p.age);
        }

        List<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("To get out, type 'exit'");
        for (int i = 0; i < 100; i ++){
            System.out.print("brand: ");String brand = sc.next();
            if (brand.equals("exit")) break;
            System.out.print("year: ");int year = sc.nextInt();
            cars.add (new Car(brand, year));
        }
        for (Car c : cars){
            c.displayInfo();
        }

    }
}
