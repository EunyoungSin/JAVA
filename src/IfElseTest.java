import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0){
            System.out.println("0 or 양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int su = scan.nextInt();
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
        System.out.println("정수를 입력하세요:");
        int baesu = scan.nextInt();
        if(baesu%12==0){
            System.out.println("12의 배수입니다.");
        }else{
            System.out.println("12의 배수가 아닙니다.");
        }
        // 윤년 : 4의 배수인 년도이거나(100으로 나누어 떨어지는 년도를 제외하고) 400의 배수인 년도
        System.out.println("년도를 입력하세요:");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){ // 윤년
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
