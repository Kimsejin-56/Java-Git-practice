package loop.ex;

public class LoopEx1 {
    public static void main(String[] args) {
        int count = 10;
        int i = 1;
        while (i <= count) {
            System.out.println(i);
            i++;
        }
        System.out.println("for문 반복문 시작-------");
        for (int j = 1; j <= count; j++) {
            System.out.println(j);
        }
    }
}
