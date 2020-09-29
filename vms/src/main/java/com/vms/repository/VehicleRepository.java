package com.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vms.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	@Query(value = "select * from vehicle v,vehicle_detail vd,vehicle_features vf,vehicle_price vp where v.detail_id=vd.id and vd.price_id=vp.id and vd.feature_id=vf.id and vd.model = ?1", nativeQuery = true)
	public List<Vehicle> findByModelName(String modelName);

	@Query(value = "select * from vehicle v,vehicle_detail vd,vehicle_features vf,vehicle_price vp where v.detail_id=vd.id and vd.price_id=vp.id and vd.feature_id=vf.id and vp.finalPrice >= :from and vp.finalPrice <=:to", nativeQuery = true)
	public List<Vehicle> findByPrice(long from, long to);

	@Query(value = "select * from vehicle v,vehicle_detail vd,vehicle_features vf,vehicle_price vp where v.detail_id=vd.id and vd.price_id=vp.id and vd.feature_id=vf.id "
			+ "and vf.interiors LIKE CONCAT('%',:interior,'%') and vf.exteriors LIKE CONCAT('%',:exterior,'%')", nativeQuery = true)
	public List<Vehicle> findByFeatures(String exterior, String interior);

}
