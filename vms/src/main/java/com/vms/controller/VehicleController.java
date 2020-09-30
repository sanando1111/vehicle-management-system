package com.vms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vms.exception.ProcessingException;
import com.vms.model.ResponseMessage;
import com.vms.model.Vehicle;
import com.vms.service.VehicleService;

@RestController
public class VehicleController {
	private final static String successMsg = "submitted to database successfully";

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

	@GetMapping("/getVehiclePrice/{from}/{to}")
	public List<Vehicle> getVehicleByPrice(@PathVariable("from") long from, @PathVariable("to") long to) {
		return vehicleService.getVehicleByPrice(from, to);
	}

	@GetMapping("/getVehicleByFeatures/{exterior}/{interior}")
	public List<Vehicle> getVehicleByFeatures(@PathVariable("exterior") String exterior,
			@PathVariable("interior") String interior) throws ProcessingException {
		return vehicleService.getVehicleByFeatures(exterior,interior);
	}

	@PostMapping("/vehicleInformation/submitVehicle")
	public ResponseMessage createVehicles(@Valid @RequestBody List<Vehicle> vehicles) {
		vehicleService.save(vehicles);
		return new ResponseMessage(HttpStatus.OK.name(), HttpStatus.OK.value(), successMsg);
	}
}
