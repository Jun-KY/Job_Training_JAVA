package J25_06_11;

import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    int age;

    public Person (){

    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Constructor {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();
        for (int i = 0; i<100; i ++){
            people.add (new Person("Michael", 23));
            people.add (new Person("Michalle", 30));

        }


    }
}
