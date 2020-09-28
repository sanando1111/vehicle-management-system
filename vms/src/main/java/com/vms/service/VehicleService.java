package com.vms.service;

import java.util.List;

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

}
