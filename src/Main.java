import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restart Java again");
        byte b = 10;
        short s = 1000;
        int age = 25;
        long count = 1000000000L;
        float pi = 3.14f;
        double salary = 55000.5;
        char grade = 'A';
        boolean inValid = true;

        String name = "Alice";
        int[] scores = {90,80,70,80};


        List<Person> people  = new ArrayList<>();
        people.add(new Person(25, "Alice"));
        people.add(new Person(32, "Michael"));

//        System.out.println(people);
        for (Person p : people){
            System.out.println(p);
        }
//        List<String> list =
    }

}
class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person {name = "+ name + ", age = " + age + " }";
    }
}



