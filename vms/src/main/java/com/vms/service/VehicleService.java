package com.vms.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vms.model.Vehicle;
import com.vms.repository.VehicleDao;



@Repository
public class VehicleService {

	@Autowired
	private VehicleDao vdao;

	public List<Vehicle> allVehicles() {
		return vdao.getAllVehicles();

	}
	
	public List<Vehicle> getVehiclesByModelname(String modelName) {
		return vdao.getAllVehiclesByModelname(modelName);

	}

	public List<Vehicle> save(List<Vehicle> vehicles) {
		// TODO Auto-generated method stub
		return vdao.save(vehicles);
	}

	public List<Vehicle> getVehicleByPrice(long from, long to) {
		// TODO Auto-generated method stub
		return vdao.getVehicleByPrice(from,to);
	}

	public List<Vehicle> getVehicleByFeatures(String exterior, String interior) {
		// TODO Auto-generated method stub
		return vdao.getVehicleByFeatures(exterior,interior);
	}

}
