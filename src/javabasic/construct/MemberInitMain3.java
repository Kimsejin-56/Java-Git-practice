package javabasic.construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit meber1 = new MemberInit();
        meber1.initMember(meber1, "user1", 15, 90);


        MemberInit meber2 = new MemberInit();
        meber2.initMember(meber2, "user2", 16, 80);

        MemberInit[] members = {meber1, meber2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }


}
