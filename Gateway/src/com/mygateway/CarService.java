package com.mygateway;

import gateway.my.Car;
import gateway.my.Cars;
import gateway.my.Specs;
import gateway.my.impl.CarImpl;

import com.ibm.websphere.sca.Service;
import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;


public class CarService implements CarInterface {

	@Override
	public Car getById(int id) {
		System.out.println("REQUEST GOT ID: " + id);
		
		 Service service = (Service)ServiceManager.INSTANCE.locateService("CarPartner");
		 DataObject response = (DataObject)service.invoke("getCarById", Integer.valueOf(id));
		 //CarImpl car = (CarImpl)response.get(0);
		 System.out.println("RESPONSE: " + response.getInstanceProperties().toArray().toString());
		 System.out.println("RESPONSE: " + response.get(0).toString());
		 System.out.println("RESPONSE: ");
		 
		// JSONDataHandler mk = new JSONDataHandler();
		 
		return null;
	}

	@Override
	public Cars getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Specs getSpecification(String model) {
		// TODO Auto-generated method stub
		return null;
	}
}
