package designpattern.builder.cars;

import designpattern.builder.components.Engine;
import designpattern.builder.components.GPSNavigator;
import designpattern.builder.components.Transmission;
import designpattern.builder.components.TripComputer;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 22:40
 * @Description: 汽车产品
 */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if(this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }
}
