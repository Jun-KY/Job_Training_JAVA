package J25_06_18;

import java.util.HashMap;
import java.util.Map;

public class Map_Hash {
    public static void main (String[] args){
        Map<String, Integer> fruitPrice = new HashMap<>();

        fruitPrice.put("Apple", 17980);
        fruitPrice.put("Pear", 10320);
        fruitPrice.put("Watermelon", 15920);
        fruitPrice.put("Melon", 10630);

// To read Map
        for(Map.Entry<String, Integer> entry: fruitPrice.entrySet()){
            System.out.println(entry.getKey() + " costs " + entry.getValue() + "Won.");
        }
        System.out.println();
        int sum = 0;

// Only Key
        for(String key: fruitPrice.keySet()){
            System.out.println(key);
        }
// Only values
        for(int fruitprice: fruitPrice.values()){
            System.out.println(fruitprice);
            sum += fruitprice;
        }
        System.out.println("Sum of fruit price is: " + sum/fruitPrice.size());

// contains check (Key and Value)
        System.out.println(fruitPrice.containsKey("Apple"));
        System.out.println(fruitPrice.containsKey("Grape"));
        System.out.println(fruitPrice.containsValue(18900));
        System.out.println(fruitPrice.containsValue(10630));

// get or default
        System.out.println(fruitPrice.getOrDefault("Apple", 500));
        System.out.println(fruitPrice.getOrDefault("Grape", 500));

// replace / remove
        fruitPrice.replace("Apple", 10000);
        fruitPrice.remove("Melon");

        for(Map.Entry<String, Integer> entry: fruitPrice.entrySet()){
            System.out.println(entry.getKey() + " costs " + entry.getValue() + "Won.");
        }
        fruitPrice.put("Melon", 10630);

    }
}
