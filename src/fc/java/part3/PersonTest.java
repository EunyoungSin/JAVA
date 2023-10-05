 package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // 모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성 => 인스턴스를 만드는 과정
        // 객체를 메모리에 올린다 = 객체생성
        Person p = new Person();
        p.name = "홍길동";
        p.age=30;
        p.phone="010-1111-1111";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name = "나길동";
        p1.age=30;
        p1.phone="010-1111-1111";

        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
