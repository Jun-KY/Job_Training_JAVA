package J25_06_02;

public class Variable {
    public static void main (String[] args){

        int a = 10, b = 3;
        System.out.printf("Plus: %s + %s = %s", a, b, a+b);
        System.out.printf("\nMinus: %s - %s = %s", a, b, a-b); // addition
        System.out.printf("\nmultiplication: %s x %s = %s", a, b, a*b); // subtraction
        System.out.printf("\nDivision: %s / %s = %s", a, b, a/b);
        System.out.printf("\nremainder: %s & %s = %s", a, b, a%b);

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int remain = a % b;
    }
}
