package com.org.tav.BP;


//Car is product class 
public class Car {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fule =0;
	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}
	public double getFule() {
		return fule;
	}
	public void setFule(double fule) {
		this.fule = fule;
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
	public TripComputer getTripComputer() {
		return tripComputer;
	}
	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
	 
	
}
