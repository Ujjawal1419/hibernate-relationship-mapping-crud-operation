package com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.dao.PassengerBusDao;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity.Bus;
import com.tcs.hibernate_relationship_mapping_crud_operation.many_to_one_mapping.entity.Passenger;

public class InsertPassengerBusController {
	public static void main(String[] args) {
		
		Bus bus =new Bus();
		
		bus.setId(101);
		bus.setName("UPSRCT");
		bus.setSeat(50);
		
		
		Passenger passenger1=new Passenger();
		passenger1.setId(564);
		passenger1.setName("Rahul");
		passenger1.setEmail("rahul123@gmail.com");
		passenger1.setBus(bus);
		
		Passenger passenger2=new Passenger();
		passenger2.setId(342);
		passenger2.setName("Amit");
		passenger2.setEmail("amit123@gmail.com");
		passenger2.setBus(bus);
		
		List<Passenger> passengers=new ArrayList<Passenger>(Arrays.asList(passenger1,passenger2));
		
		List<Passenger> passenegers2=new PassengerBusDao().savePassengerBusDao(passengers, bus);
	}

}
