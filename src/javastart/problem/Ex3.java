package javastart.problem;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int totalPrice = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.print("상품명을 입력하세요: ");
                String goods = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                int prices=price * quantity;
                totalPrice += prices;
                System.out.println("상품명: " + goods + " 가격:" + price + " 합계:" + prices);
            } else if (input == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice=0;
            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
