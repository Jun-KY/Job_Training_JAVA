package Extra_Work;

import java.text.DecimalFormat;
import java.util.Scanner;

class Numbers{
    double num1;
    double num2;
    double result;

//    public Numbers(double num1, double num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
    public Numbers(double num1, double num2, double result){
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
    public void Add() {
        this.result = num1;
        result += num2;
    }
    public void Minus() {
        this.result = num1;
        result -= num2;
    }
    public void Multiple() {
        this.result = num1;
        result *= num2;
    }
    public void Divide() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            result = Double.NaN;
        } else {
            this.result = num1;
            result /= num2;
        }
    }
    public void Square(){
        this.result = num1;
        for (int i = 1; i < num2; i++){
            result *= num1;
        }
    }
    public double getResult(){
        return result;
    }
}

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.######");

        double num1 ;
        double num2 ;
        char symbol;
        double result = 0;

        System.out.println("type 'exit' to quit");
        System.out.println("type '0' '0' to quit");
        System.out.println("=============================================");
        System.out.println("Input <First number> (symbol) <Second number>");
        System.out.println("=============================================");

        while (true){
            System.out.print("Please enter numbers: ");

            if (sc.hasNext("exit")){
                break;
            }
            num1 = sc.nextDouble();
            symbol = sc.next().charAt(0);
            if ((num1 == 0 && symbol == '0')){
                break;
            }
            num2 = sc.nextDouble();

            Numbers calculate = new Numbers(num1, num2, result);
            switch (symbol){
                case('+'):
                    calculate.Add();
                    break;

                case('-'):
                    calculate.Minus();
                    break;

                case ('x'), ('*'), ('X'):
                    calculate.Multiple();
                    break;

                case ('/'):
                    calculate.Divide();
                    break;

                case ('^'):
                    calculate.Square();
                    break;

                default:
                    System.out.println("Invalid operator");
                    continue;

            }
            System.out.println(" \t\t\t\t\t= " + df.format(calculate.result));

        }
        sc.close();
    }
}
