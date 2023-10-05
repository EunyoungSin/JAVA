package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        // 정적 바인딩 : 컴파일 시점에서 사용될(호출될) 메서드가 결정(연결)되는 바인딩이므로 실행속도와 무관
        // 컴파일 시점에 메소드명이 add_float_float, add_int_int로 바뀜
        // <-> 동적 바인딩 : override(재정의). 실행속도 느려짐.
        float v=add(35.6f, 56.7f);
        System.out.println("v = " + v);
        int vv=add(10, 50);
        System.out.println("vv = " + vv);
    }
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static float add(float a, float b){
        float sum=a+b;
        return sum;
    }
}
