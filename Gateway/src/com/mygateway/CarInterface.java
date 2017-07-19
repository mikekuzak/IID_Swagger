package com.mygateway;

import gateway.my.Car;
import gateway.my.Cars;
import gateway.my.Specs;

public interface CarInterface {

	public Car getById(int id);

	public Cars getAllCars();

	public Specs getSpecification(String model);

}
