package javabasic.construct;
public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
