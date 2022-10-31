package designpattern.builder;

import designpattern.builder.builders.CarBuilder;
import designpattern.builder.builders.CarManualBuilder;
import designpattern.builder.cars.Car;
import designpattern.builder.cars.Manual;
import designpattern.builder.director.Director;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 22:49
 * @Description: 客户端代码
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
    }
}
