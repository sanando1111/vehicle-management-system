package com.vms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="VEHICLE_FEATURES")
public class VehicleFeature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonIgnore(value = true)
	private int feature_id;
	
	@Column(name = "interiors")
	private String interiors;
	
	public int getFeature_id() {
		return feature_id;
	}

	public void setFeature_id(int feature_id) {
		this.feature_id = feature_id;
	}

	public String getInteriors() {
		return interiors;
	}

	public void setInteriors(String interiors) {
		this.interiors = interiors;
	}

	public String getExteriors() {
		return exteriors;
	}

	public void setExteriors(String exteriors) {
		this.exteriors = exteriors;
	}

	@Column(name = "exteriors")
	private String exteriors;
	
	
	
	
	

}
