package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);

        System.out.println("|| OR 연산");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);

        System.out.println("! 연산");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
