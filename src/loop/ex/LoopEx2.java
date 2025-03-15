package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int max=100;
        int i=1;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        System.out.println("for방식");
        sum=0;
        for (i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
