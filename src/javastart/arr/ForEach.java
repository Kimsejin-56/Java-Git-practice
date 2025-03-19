package javastart.arr;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //향상된 for문 for-Each
        for (int number : numbers) {
            System.out.println(number);
        }
        //for-Each문을 사용 할 수 없는 경우, 증가하는 index의 값이 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
