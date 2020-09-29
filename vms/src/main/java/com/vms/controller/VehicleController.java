package com.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vms.model.Vehicle;
import com.vms.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	
	@GetMapping("/getVehicleInfomation")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.allVehicles();

	}
	
	@GetMapping("/getVehicleModelName/{model}")
	public List<Vehicle> getVehiclesByModelName(@PathVariable("model") String model) {
		return vehicleService.getVehiclesByModelname(model);

}
}
