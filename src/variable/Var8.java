package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수 기본 int
        byte b=127;//-128~127
        short s=32767;//-32768~32767
        int i=2147483647;//-2147483648~2147483647(약 20억)
        long l=9223372036854775807L; // 어마하게 길게 까지 20억 넘어가면 사용, 20억을 넘어가면 대문자 소문자 L을 붙여야한다

        //실수 기본 double
        float f=10.0f;//표현범위가 double보다 작음
        double d=10.0;
    }
}
