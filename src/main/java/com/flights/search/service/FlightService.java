package com.flights.search.service;

import java.util.*;

import com.flights.search.beans.FlightSearchRequestVO;
import com.flights.search.domain.Flight;

public interface FlightService {
	
	public List<Flight> getOneWayFlights(FlightSearchRequestVO searchRequest);
	
	public Map<String,List<Flight>> getRoundTripFlights(FlightSearchRequestVO searchRequest);
	
}
