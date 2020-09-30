package com.vms.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vms.model.Vehicle;
import com.vms.service.VehicleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleServiceIntegrationTest {

	@Autowired
	private VehicleService vehicleService;

	@Test
	public void getAllVehicleDetails() {
		List<Vehicle> allVehicle = vehicleService.allVehicles();
		assertEquals(allVehicle.size(), 2);
	}

	@Test
	public void getVehicleByModelName() {
		List<Vehicle> allVehicle = vehicleService.getVehiclesByModelname("ecoSport");
		assertEquals(allVehicle.size(), 1);
	}

	@Test
	public void getVehicleByprice() {
		List<Vehicle> allVehicle = vehicleService.getVehicleByPrice(20000l, 25000l);
		assertEquals(allVehicle.size(), 1);
	}
	@Test
	public void getVehicleByFeature() {
		List<Vehicle> allVehicle = vehicleService.getVehicleByFeatures("Carbon", "Voice");
		assertEquals(allVehicle.size(), 1);
	}
}
