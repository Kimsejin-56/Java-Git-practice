package javastart.Cond.ex;

public class IfEx7 {
    public static void main(String[] args) {
        int x = 2;
        String result = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + result);
    }
}
