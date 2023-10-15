package fc.java.part4;

//public class Employee extends Object { // 최상위 클래스 Object. 생략되어있음
public class Employee {
    //protected String name;
    private String name;
    //protected int age;
    private int age;
    //protected String phone;
    private String phone;
    //protected String empDate;
    private String empDate;
    //protected String dept;
    private String dept;
    //protected boolean marriage;
    private boolean marriage;

    public Employee(){
        super(); // 상위클래스의 생성자를 호출 -> new Object(); 이 부분은 생략해도 컴파일러가 생성해줌.
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    // toStirng()
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
