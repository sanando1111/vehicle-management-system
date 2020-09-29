insert into VEHICLE_price(id,finalprice) values(1,'100');
insert into VEHICLE_features(id,exteriors) values(1,'Excellent');
insert into VEHICLE_detail(id,model,feature_id,price_id) values(1,'Edge',1,1);
insert into VEHICLE(vehicleid,detail_id) values(1,1);