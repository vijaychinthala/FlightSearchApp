package com.flights.search.module;

import com.flights.search.service.FlightService;
import com.flights.search.service.FlightServiceImpl;
import com.google.inject.AbstractModule;

public class FlightServiceModule  extends AbstractModule {

	@Override
	protected void configure() {
		bind(FlightService.class).to(FlightServiceImpl.class);		
	}

}
