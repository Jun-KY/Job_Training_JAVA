package J25_06_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functions {
    public static void printStudent(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------");
    }
    public static int addNumber (int a, int b){
        return a + b;
    }
    public static int subNumber (int a, int b){
        return a - b;
    }
    public static int mulNumber (int a, int b){
        return a * b;
    }
    public static int divNumber (int a, int b){
        return a / b;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Information ===");
        printStudent("Anne", 28);
        printStudent("James", 34);

        int a = 12;
        int b = 3;

        System.out.println(addNumber(a,b));
        System.out.println(subNumber(a,b));
        System.out.println(mulNumber(a,b));
        System.out.println(divNumber(a,b));


    }

}


