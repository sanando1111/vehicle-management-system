package com.vms.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleService {

	@Autowired
	private VehicleDao vdao;

	public List<Vehicle> allVehicles() {
		return vdao.getAllVehicles();

	}
	
	public List<Vehicle> getVehiclesByModelname(String modelName) {
		return vdao.getAllVehiclesByModelname(modelName);

	}

}
