package J25_06_19;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Tree {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new TreeMap<>();

        fruitPrice.put("Apple", 17980);
        fruitPrice.put("Pear", 10320);
        fruitPrice.put("Watermelon", 15920);
        fruitPrice.put("Melon", 10630);

        for(Map.Entry<String, Integer> ent: fruitPrice.entrySet()){
            System.out.println(ent.getKey() + ", " + ent.getValue());
        }
    }
}
/*
class Map{
    String key;
    Integer value;
    public Map(String key, Integer value){
        this.key = key;
        this.value = value;
    }
}

 */