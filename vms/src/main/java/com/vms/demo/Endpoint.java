package com.vms.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

	@Autowired
	private VehicleService vService;

	
	@GetMapping("/getVehicleInfomation")
	public List<Vehicle> getAllVehicles() {
		return vService.allVehicles();

	}

}
