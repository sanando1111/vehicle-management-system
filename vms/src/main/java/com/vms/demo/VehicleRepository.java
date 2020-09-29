package com.vms.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
//Below query will fetch all details 
//	select * from vehicle v,vehicle_detail vd,vehicle_features vf,vehicle_price vp 
//	where v.detail_id=vd.id and vd.price_id=vp.id and vd.feature_id=vf.id;

	
	 @Query(value = "select * from vehicle v,vehicle_detail vd,vehicle_features vf,vehicle_price vp where v.detail_id=vd.id and vd.price_id=vp.id and vd.feature_id=vf.id and vd.model = ?1", nativeQuery = true)
	  public List<Vehicle> findByModelName(String modelName);
	
}
