package method;

public class Ex2 {
    public static void printMessage(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        String message="Hello, world!";
        printMessage(message,3);
        System.out.println("----------");
        printMessage(message,5);
    }
}
