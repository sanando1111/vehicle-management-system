package com.vms.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="VEHICLE_FEATURES")
public class VehicleFeature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int feature_id;
	
	@Column(name = "interiors")
	private String interiors;
	
	@Column(name = "exteriors")
	private String exteriors;
	
	
	

}
