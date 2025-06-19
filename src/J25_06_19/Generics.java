package J25_06_19;

import J25_06_09.Array;

import java.util.*;

class Box<T> {   // Type 매개변수
    private T content;

    public Box(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo){
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }

}/*
//기존
class StringBox {
    private String content;

    public StringBox(String content){
        this.content = content;
    }
}
*/
class Box_1 {
    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
    public static <T> void displayArrayList(List<T> array){
        for (T element : array) {
            System.out.println(element);
        }
    }
}
public class Generics {
    public static void main (String[] args){
        Box<String> stringbox = new Box<>("Good box");
        System.out.println(stringbox.getContent());

        stringbox.setContent("Fail");

        System.out.println(stringbox.getContent());

        Box<Integer> intbox = new Box<>(53);

        System.out.println(intbox.getContent());

        stringbox.printContent(123);

        //T array
        // T[] array;
        // T element : array

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};

        Box_1.displayArray(numbers);
        Box_1.displayArray(words);

        //Array List 생성
        List<Integer> nums = new ArrayList<>();
        List<String> word= new ArrayList<>();
        List<String> moreNumbers = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
        List<String> moreWords = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        word.add("apple");
        word.add("banana");
        word.add("cherry");
        for (Integer i : nums){
            Box_1.displayArray(new Integer[]{i});
        }
        Box_1.displayArrayList(nums);
        Box_1.displayArrayList(word);
        Box_1.displayArrayList(moreNumbers);
        Box_1.displayArrayList(moreWords);

    }
}
