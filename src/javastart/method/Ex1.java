package javastart.method;

public class Ex1 {
    public static void avg(int a,int b, int c){
        int sum=a+b+c;
        double avg=(double)sum/3;
        System.out.println("평균값: " + avg);
    }
    public static void main(String[] args) {
        avg(1,2,3);
        avg(15,25,35);
    }
}
