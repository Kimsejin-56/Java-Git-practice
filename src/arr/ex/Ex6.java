package arr.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double avg = 0;
        int max=0;
        int min=999999999;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        avg=(double)sum/count;
        System.out.println("가장 작은 정수:" + min);
        System.out.println("가장 큰 정수:" + max);
        }
    }
