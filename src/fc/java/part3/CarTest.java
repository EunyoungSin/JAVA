package fc.java.part3;

import com.sun.jdi.CharType;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차이름:");
        String carName = scan.nextLine();

        System.out.println("자동차가격:");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차소유자:");
        String carOwner = scan.nextLine();

        System.out.println("자동차년식:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차타입:"); // G(휘발유), D(경유)
        String carType = scan.nextLine(); // char이 없어 string 사용

        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요(DTO, VO)
        // 클래스로 CarDTO, CarVO 모델 설계
        // carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);
    }

    // public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
    public static void carInfoPrint(CarDTO car) {
        // System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
