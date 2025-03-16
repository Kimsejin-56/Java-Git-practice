package method;

import java.util.Scanner;

public class Ex4 {
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입급하셨습니다. 현재 잔액은 " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount+"원을 출금하셨습니다. 현재 잔액은 "+balance);
        }else{
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int balance=0;

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            System.out.print("선택: ");
            int num=scanner.nextInt();

            if(num==1){
                System.out.print("입금액을 입력하세요: ");
                int amount=scanner.nextInt();
                balance=deposit(balance,amount);
            }else if(num==2){
                System.out.print("출금액을 입력하세요: ");
                int amount=scanner.nextInt();
                balance=withdraw(balance,amount);
            }else if(num==3){
                System.out.println("현재 잔액: "+balance);
            }else if(num==4){
                System.out.println("시스템을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 숫자를 입력하셨습니다.");
            }
        }
    }
}
