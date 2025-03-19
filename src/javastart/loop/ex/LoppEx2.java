package javastart.loop.ex;

public class LoppEx2 {
    public static void main(String[] args) {
        int num=2;
        int i=1;

        while (i <= 10) {
            System.out.println(num);
            num+=2;
            i++;
        }
        System.out.println("for문 시작-------");

        for (num = 2,i=1; i <= 10; i++,num+=2) {
            System.out.println(num);

        }
    }
}
