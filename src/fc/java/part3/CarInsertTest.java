package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차정1보를 키보드로부터 입력을 받아서 DB에 저장을 하세요.(JDBC)
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

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
