package com.vms.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
	
	@Id
	@Column(name = "vehicleid")
	private String vehicleId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id", referencedColumnName = "id")
	private VehicleDetail vehicleDetails;
	
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public VehicleDetail getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(VehicleDetail vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	

}
