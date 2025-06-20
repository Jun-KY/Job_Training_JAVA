package J25_06_12;

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("breed: " + breed);
    }
}

public class Inheritance {
    public static void main (String[] args){
        Dog dog = new Dog("쪼꼬", "푸들");
        dog.printName();
    }
}
