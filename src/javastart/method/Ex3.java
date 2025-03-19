package javastart.method;

public class Ex3 {
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
        int balance=10000;
        balance=deposit(balance,1000);
        balance=withdraw(balance,2000);
        System.out.println("최종잔액은 "+ balance);
    }
}
