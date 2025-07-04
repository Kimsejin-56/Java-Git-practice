package javabasic.construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit meber1 = new MemberInit();
        initMember(meber1, "user1", 15, 90);


        MemberInit meber2 = new MemberInit();
        initMember(meber2, "user2", 16, 80);

        MemberInit[] members = {meber1, meber2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
