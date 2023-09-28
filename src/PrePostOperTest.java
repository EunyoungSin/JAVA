public class PrePostOperTest {
    public static void main(String[] args) {
        int x=10;
        System.out.println(--x); // 9. 1 감소 후 9 출력
        System.out.println(x++); // 9. 9 출력 후 1 증가
        System.out.println(x--); // 10. 10 출력 후 1 감소
        System.out.println(++x); // 10. 1 증가 후 10 출력
        System.out.println("x = " + x); // 10
    }
}
