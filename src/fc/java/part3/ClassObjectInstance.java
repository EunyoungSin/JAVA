package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1 : ovject
        Student st2; // st2 : ovject
        Student st3; // st3 : ovject

        //st1 = new Student(); // st1 : instance
        st1 = new Student("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111");
        //st2 = new Student(); // st2 : instance
        st2 = new Student("나길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111");
        //st3 = new Student(); // st3 : instance
        st3 = new Student("이길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
