package J25_06_19;

import java.text.DecimalFormat;
import java.util.*;

public class ArrayToArrayList {
    /*
    public static void main (String[] args){
        //공변성 구현
        Object [] arr = new Integer[3];
        List<Object> arr1 = new ArrayList<>(3);
        List<? extends Number> arr2 = new ArrayList<Integer>();

//        arr[1] = "Hello";
        arr1.add("Hello");
//        arr2.add(3);
    }

     */


    // <?> 모든 타입 허용 (읽기만 가능)
    // <? extends T> T 또는 하위 타입 허용 (읽기만 가능)
    // <? super T> T 또는 상위 타입 허용 (쓰기 가능, 읽기는 Object로)
    // List<T> 정확한 T만 허용 (읽기/쓰기)
    public static void printElements(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
    public static double sumList(List<? extends Number> list){
        double sum = 0;

        for (Number n: list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.######");

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "c");
        List<Double> doubleList = Arrays.asList(0.1, 0.2);

        printElements(numbers);
        printElements(words);
        System.out.println("Sum: " + df.format(sumList(doubleList)));
    }
}
