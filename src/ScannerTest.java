import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num=scan.nextInt(); // 블럭상태. nextInt() = 정수를 읽어들이는 함수
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f=scan.nextFloat(); // 블럭상태
        System.out.println("f = " + f);

        System.out.print("문자열 입력하세요:");
        String str=scan.next(); // next() = 공백 앞까지만 출력
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.print("문자열 입력하세요:");
        String str1=scan.nextLine();
        System.out.println("str1 = " + str1);
    }
}
