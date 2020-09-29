package com.vms.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vms.model.Vehicle;

@Repository
public class VehicleDao {

	@Autowired
	private VehicleRepository vRepository;

	public List<Vehicle> getAllVehicles() {
		return vRepository.findAll();

	}

	public List<Vehicle> getAllVehiclesByModelname(String modelName) {
		return vRepository.findByModelName(modelName);

	}

	public List<Vehicle> save(List<Vehicle> vehicles) {
		// TODO Auto-generated method stub
		return vRepository.saveAll(vehicles);
	}

	public List<Vehicle> getVehicleByPrice(long from, long to) {
		// TODO Auto-generated method stub
		return vRepository.findByPrice(from,to);
	}

	public List<Vehicle> getVehicleByFeatures(String exterior, String interior) {
		// TODO Auto-generated method stub
		return vRepository.findByFeatures(exterior,interior);
	}

}
