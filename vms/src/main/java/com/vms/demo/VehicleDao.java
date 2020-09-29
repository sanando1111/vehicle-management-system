package com.vms.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleDao {
	
	@Autowired
	private VehicleRepository vRepository;
	
	public List<Vehicle> getAllVehicles()
	{
		return vRepository.findAll();
		
		
	}
	
	public List<Vehicle> getAllVehiclesByModelname(String modelName)
	{
		return vRepository.findByModelName(modelName);
		
		
	}

}
