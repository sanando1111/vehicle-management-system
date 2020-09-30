insert into vehicle_price(id,finalprice,savings,msrp) values(1,20000,5000,25000);
insert into vehicle_price(id,finalprice,savings,msrp) values(2,30000,6000,22000);
insert into vehicle_features(id,exteriors,interiors) values(1,'Acoustic-Laminate Windshld','Illuminated Entry System');
insert into vehicle_features(id,exteriors,interiors) values(2,'Acoustic-Laminate Carbon fibre','Voice control');
insert into vehicle_detail(id,make,model,modelYear,bodyStyle,engine,drivetype,color,mpg,feature_id,price_id) values(1,'Ford','ecoSport','2020','4D Sport Utility','1.0L EcoBoost','FWD','shadow black','27',1,1);
insert into vehicle_detail(id,make,model,modelYear,bodyStyle,engine,drivetype,color,mpg,feature_id,price_id) values(2,'Ford','Edge','2019','4D Sport Utility','1.0L EcoBoost','FWD','shadow black','27',2,2);
insert into vehicle(vehicleid,detail_id) values(101,1);
insert into vehicle(vehicleid,detail_id) values(102,2);