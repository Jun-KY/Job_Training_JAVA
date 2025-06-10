package J25_06_10.main.com.files;

public class Person {
    public int age;
    public String name;

    public Person() {

    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
