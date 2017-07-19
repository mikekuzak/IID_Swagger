package com.mygateway;

import gateway.my.Car;
import gateway.my.Cars;
import gateway.my.Specs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.websphere.sca.Service;
import com.ibm.websphere.sca.ServiceManager;

import commonj.sdo.DataObject;

@Api(value = "/cars", description = "RESTful API to interact with Car Servcie.")
@Path("/cars")
@Stateless
public class GatewayService extends Application {

	@ApiOperation(value = "Get Car by ID", notes = "Get model details by ID", responseContainer = "Car", response = Car.class)
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(
			@ApiParam(value = "Car ID", required = true) @PathParam("id") int id)
			throws Exception {

		// Invoke SCA Stand-alone Reference Partner
		Service service = (Service) ServiceManager.INSTANCE.locateService("CarPartner");
		DataObject car = (DataObject) service.invoke("getCarById",Integer.valueOf(id));
		DataObject res = (DataObject) car.get(0);

		//Use SDO to JSON Converter
		com.ibm.bpe.message.JsonConverter jc = com.ibm.bpe.message.JsonConverter.getInstance();
        String resp = jc.convertObject2JSON(res);

		if (res != null) {
			return Response.ok(resp).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}

	@ApiOperation(value = "Get all car models", notes = "Get all car models", responseContainer = "Cars", response = Cars.class)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCars() {
		Cars cars = new CarService().getAllCars();
		if (cars != null) {
			return Response.ok(cars).build();
		}
		return Response.status(Response.Status.NOT_FOUND).build();
	}

	@ApiOperation(value = "Get car specification by model", notes = "Enter car model name to get Model Specification", responseContainer = "Specs", response = Specs.class)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getCarSpecification(
			@ApiParam(value = "Model Name", required = true) String modelName) {
		Specs spec = new CarService().getSpecification(modelName);
		return Response.ok(spec).build();
	}
}
