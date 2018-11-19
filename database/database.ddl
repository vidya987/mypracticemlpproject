--creating Database
create database canteenmanagement;

--using the Database
use canteenmanagement;

--Creating Menu table 
CREATE TABLE MENU(FOOD_ID INT PRIMARY KEY,FOOD_NAME VARCHAR(40) NOT NULL, VENDOR_ID INT)

--creating vendor table
CREATE TABLE VENDOR(VENDOR_ID INT PRIMARY KEY);

--Alter table
ALTER TABLE MENU add constraint fk foreign key(vendor_id) references vendor(vendor_id);


SELECT * FROM VENDOR;
SELECT * FROM MENU;
