package J25_06_11;

import java.util.Scanner;

public class Test {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cal cal = new Cal();

    double num1, num2, result;
    char simbol;


    while (true){
        System.out.print("첫번째 값을 입력해 주세요: ");
        num1 = scanner.nextDouble();
        System.out.println();
        while (true) {
            System.out.println("연산 기호를 입력해 주세요(+, -, *, /): ");
            simbol = scanner.next().charAt(0);
            if (simbol == '+' || simbol == '-' || simbol == '*' || simbol == '/') {
                break;
            }
            System.out.println("잘못 입력하셨습니다.");
        }
        System.out.println();
        System.out.print("두번째 값을 입력해 주세요: ");
        num2 = scanner.nextDouble();
        if (simbol == '/' && (num1 == 0 || num2 == 0)) {
            System.out.println("0은 나눌 수 없습니다.");
        } else {
            result = cal.cale(num1, num2, simbol);
            System.out.println(num1 +" " + simbol + " " + num2 + " = "+result + "입니다.");

        }
        System.out.println();

        System.out.println("계산기를 종료하시겠습니까?(Y or N)");
        while (true){
            char select = scanner.next().charAt(0);
            if(select == 'y' ||select == 'Y' ){
                System.out.println("계산기를 종료합니다.");
                return;
            }else if(select == 'n' || select == 'N'){
                break;
            }else {
                System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
            }
            System.out.println();
        }

    }
}

}

class Cal {
    double result;
    public double cale(double num1, double num2, char simbol){

        switch (simbol){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("잘못 입력하셧습니다.");
                return  0;
        }
        return result;
    }

}