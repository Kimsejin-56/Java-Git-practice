package javastart.arr.ex;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int students[] = new int[4];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");

            System.out.print("국어 점수:");
            int kor = scanner.nextInt();

            System.out.print("영어 점수:");
            int eng = scanner.nextInt();

            System.out.print("수학 점수:");
            int math = scanner.nextInt();

            students[i]=kor+eng+math;
        }

        for(int i=0;i<students.length;i++){
            System.out.println((i+1)+"번 학생의 총점: "+students[i]+", 평균: "+students[i]/3);
        }
    }
}
