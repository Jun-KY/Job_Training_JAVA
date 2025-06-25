package J25_06_11;

import java.util.Scanner;

public class Banding_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 닥터페퍼 (800원)");
        System.out.println("2. 코카콜라 (5500원)");
        System.out.println("3. 칠성사이다 (2000원)");
        System.out.println("4. 마운틴듀 (3000원)");
        System.out.println("5. 밀키스 (2110원)");

        int choice = scanner.nextInt();
        int price = 0;
        String item = "";

        switch (choice) {
            case 1:
                item = "닥터페퍼";
                price = 800;
                break;
            case 2:
                item = "코카콜라";
                price = 5500;
                break;
            case 3:
                item = "칠성사이다";
                price = 2000;
                break;
            case 4:
                item = "마운틴듀";
                price = 3000;
                break;
            case 5:
                item = "밀키스";
                price = 2110;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.println(item + "을(를) 선택하셨습니다. 금액을 넣어주세요: ");
        int money = scanner.nextInt();

        if(money < price) {
            System.out.println("금액이 부족합니다. 거래를 취소합니다.");
        } else {
            int change = money - price;
            System.out.printf("%s을(를) 드립니다. 잔돈은 %d입니다.\n", item, change);
        }

        System.out.println("빠이빠이");
    }
}
