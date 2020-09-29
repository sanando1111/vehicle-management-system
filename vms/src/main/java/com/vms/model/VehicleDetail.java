package com.vms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_DETAIL")
public class VehicleDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "make")
    private String make;
	@Column(name = "model")
    private String model;
	@Column(name = "modelyear")
    private String modelYear;
	@Column(name = "bodystyle")
    private String  bodyStyle;
	@Column(name = "engine")
    private String engine;
	@Column(name = "drivetype")
    private String drivetype;
	@Column(name = "color")
    private String color;
	@Column(name = "mpg")
    private String mpg;  
    
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feature_id", referencedColumnName = "id")
    private VehicleFeature vehicleFeatues;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "price_id", referencedColumnName = "id")
    private VehiclePrice   vehiclePrice;
    
    
	public VehicleFeature getVehicleFeatues() {
		return vehicleFeatues;
	}
	public void setVehicleFeatues(VehicleFeature vehicleFeatues) {
		this.vehicleFeatues = vehicleFeatues;
	}
	public VehiclePrice getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(VehiclePrice vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivetype() {
		return drivetype;
	}
	public void setDrivetype(String drivetype) {
		this.drivetype = drivetype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMpg() {
		return mpg;
	}
	public void setMpg(String mpg) {
		this.mpg = mpg;
	}
    
    
    


}
