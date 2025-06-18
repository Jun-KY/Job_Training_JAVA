package J25_06_18;

import java.sql.SQLOutput;
import java.util.*;

public class Arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
        List<String> fruits = new ArrayList<>();
        fruits.add("Elderberry");
        fruits.add("Apple");
        fruits.add("Dragon fruit");
        fruits.add("Banana");
        fruits.add("Cherry");
        while(true){
            System.out.print("Add fruits: ");
            if(sc.hasNext("exit")){
                break;
            }
            fruits.add(sc.next());

        }
//        for(int i = 0; i < fruits.size(); i++){
//            System.out.println(fruits.get(i));
//        }
        Collections.sort(fruits); //Ascending

        for(String fruit : fruits){
            System.out.println(fruit);
            // List 에 포함된 요소 확인
            if(fruit.contains("Kiwi")){
                System.out.println("Kiwi is contained.");
            }
        }
        if (fruits.contains("Tomato")){
            fruits.remove(fruits.indexOf("Tomato"));
        }
        if(fruits.contains("Potato")){
            fruits.remove("Potato");
        }
        if (fruits.contains("Strawberry")){
            fruits.set(fruits.indexOf("Strawberry"),"Blueberry");
        }
        List<String>  sliced = fruits.subList(0, 3);
        System.out.println("=======Fixed=======");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("========sliced========");
        for(String slice : sliced){
            System.out.println(slice);
        }

        fruits.clear();
        System.out.println(fruits.size());
        if(fruits.isEmpty()){
            System.out.println(fruits.isEmpty());
        }

    }
}
