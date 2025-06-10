package J25_06_10.org.example;

import J25_06_10.org.example.animal.Person;

class Helper {
    String helper = "helper";
}

public class Main {
    public static void main(String[] args){
        Person person = new Person();
        Helper helper = new Helper();
        System.out.println(helper.helper);

    }
}
