package designpattern.builder.builders;

import designpattern.builder.cars.CarType;
import designpattern.builder.components.Engine;
import designpattern.builder.components.GPSNavigator;
import designpattern.builder.components.Transmission;
import designpattern.builder.components.TripComputer;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 22:32
 * @Description: 通用生成器接口
 */
public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
