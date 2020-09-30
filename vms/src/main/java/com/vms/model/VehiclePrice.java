package com.vms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="VEHICLE_PRICE")
public class VehiclePrice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "msrp")
	private long msrp;
	@Column(name = "savings")
	private long savings;

	@Column(name = "finalPrice")
	private long finalPrice;

	public long getMsrp() {
		return msrp;
	}

	public void setMsrp(long msrp) {
		this.msrp = msrp;
	}

	public long getSavings() {
		return savings;
	}

	public void setSavings(long savings) {
		this.savings = savings;
	}

	public long getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(long finalPrice) {
		this.finalPrice = finalPrice;
	}

}
