public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit=3625; // 3+6+2+5=?
        System.out.println(digit%10); // 5
        System.out.println(digit/10%10); // 2
        System.out.println(digit/100%10); // 6
        System.out.println(digit/1000%10); // 3
        int num=2579; // 2+5+7+9=?

        int su=5;
        if(su%2==0) {
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }
}
