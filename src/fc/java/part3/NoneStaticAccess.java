package fc.java.part3;

import fc.java.model.MyUtil;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //객체생성해서 접근
        MyUtil my = new MyUtil();
        int sum = my.hap2(a,b);
        System.out.println("sum = " + sum);
    }
}
