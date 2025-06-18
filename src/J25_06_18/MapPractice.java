package J25_06_18;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main (String[] args){
        Map<String, Integer> fruitPrice = new HashMap<>();

        fruitPrice.put("Apple", 17980);
        fruitPrice.put("Pear", 10320);
        fruitPrice.put("Watermelon", 15920);
        fruitPrice.put("Melon", 10630);

        for(Map.Entry<String, Integer> entry: fruitPrice.entrySet()){
            System.out.println(entry.getKey() + " costs " + entry.getValue() + "Won.");
        }
        System.out.println();
        int sum = 0;
        for(int fruitprice: fruitPrice.values()){
            System.out.println(fruitprice);
            sum += fruitprice;
        }
        System.out.println("Sum of fruit price is: " + sum/fruitPrice.size());
    }
}
