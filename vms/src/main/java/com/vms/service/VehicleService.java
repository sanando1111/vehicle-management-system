package com.vms.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.model.Vehicle;
import com.vms.repository.VehicleDao;


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

	public List<Vehicle> save(List<Vehicle> vehicles) {
		// TODO Auto-generated method stub
		return vdao.save(vehicles);
	}

}
