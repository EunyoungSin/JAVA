package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 34, "010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo.toString()); // 동일한 결과값 출력
        System.out.println(vo); // 자바 컴파일러는 .toString()을 생략하면 객체가 갖고있는 전체값을 출력함.
    }
}
