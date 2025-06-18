package J25_06_18;

import java.util.*;

public class Hashset {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Kiwi");

        for (String fruit : fruits){
            System.out.println(fruit);
            System.out.printf("%x\n",fruit.hashCode());

        }
        System.out.println();
        Set<String> fruits2 = new LinkedHashSet<>();

        fruits2.add ("Banana");
        fruits2.add ("Apple");
        fruits2.add ("Cherry");

        for (String fruit: fruits2){
            System.out.println(fruit);
        }

        System.out.println();

        Set<String> fruits3 = new TreeSet<>();
        fruits3.add("Banana");
        fruits3.add("Apple");
        fruits3.add("Cherry");
        for (String fruit: fruits3){
            System.out.println(fruit);
        }

    }

}
