package com.gvacharya.main.hibernateassignment.car;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@Column(name="car_id")
	private int carId;
	
	@Column(name="car_brand")
	private String carBrand;

	@OneToOne(cascade=CascadeType.ALL)
	private Engine engine;

	public Car() {
		super();
	}

	public Car(int carId, String carBrand, Engine engine) {
		super();
		this.carId = carId;
		this.carBrand = carBrand;
		this.engine = engine;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carBrand=" + carBrand + ", engine=" + engine + "]";
	}
	
	
	
}
