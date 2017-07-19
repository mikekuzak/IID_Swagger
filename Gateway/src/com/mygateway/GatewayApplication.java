package com.mygateway;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class GatewayApplication extends Application {
	
	public GatewayApplication() {
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setTitle("PoT SWAGGER - REST GATEWAY");
		beanConfig.setDescription("Test API REST Interface with Swagger Annotations");
		beanConfig.setVersion("0.0.1");
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setHost("localhost:9080");
		beanConfig.setBasePath("/Gateway/rest");
		beanConfig.setResourcePackage("com.mygateway");
		beanConfig.setScan(true);
		beanConfig.setPrettyPrint(true);
	}

	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet();

		//JAX-RS interface
		classes.add(GatewayService.class);
		//Add Swagger initialisation classes
		classes.add(ApiListingResource.class);
		classes.add(SwaggerSerializers.class);

		return classes;
	}
}
