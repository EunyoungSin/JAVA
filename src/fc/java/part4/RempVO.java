package fc.java.part4;

public class RempVO extends Employee {
    public RempVO() {
        super(); // 부모의 생성자를 호출. 인자x
    }

    //public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
    // 초기화(자식이 부모의 기억공간에 초기화를 하는 경우)
    //this.name=name;
    //this.age=age;
    //this.phone=phone;
    //this.empDate=empDate;
    //this.marriage=marriage;
    //}
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        super(name,age,phone,empDate,dept,marriage); //부모의 생성자를 호출
    }
}
