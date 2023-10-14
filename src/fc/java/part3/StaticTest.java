package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // a+b=?
        int sum=hap(a,b); // StaticTest.hap(a,b);와 같음. 같은 클래스 내는 클래스명 생략가능.
        System.out.println("sum = " + sum);
    }
    public static int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
