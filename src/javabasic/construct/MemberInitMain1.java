package javabasic.construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit meber1 = new MemberInit();
        meber1.name="user1";
        meber1.age=15;
        meber1.grade=90;

        MemberInit meber2 = new MemberInit();
        meber2.name="user2";
        meber2.age=16;
        meber2.grade=80;

        MemberInit[] members = {meber1, meber2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
