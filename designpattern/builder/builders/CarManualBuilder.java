package designpattern.builder.builders;

import designpattern.builder.cars.CarType;
import designpattern.builder.cars.Manual;
import designpattern.builder.components.Engine;
import designpattern.builder.components.GPSNavigator;
import designpattern.builder.components.Transmission;
import designpattern.builder.components.TripComputer;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 22:57
 * @Description: 汽车手册生成器
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
