package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn=1110;
        String carName="BMW828i";
        int carPrice=9000000;
        String carOwenr="홍길동";
        int carYear=2015;
        String carType="G";

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwenr;
        car.carYear=carYear;
        car.carType=carType;
//        carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }

}
