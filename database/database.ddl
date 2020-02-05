-- creating Database
create database MLP194;

-- using the Database
use MLP194;


-- Creating Customer table
create table CUSTOMER(CUS_ID int(5) primary key,WAL_NO int(10),
PHN_NO int(10),ADDRESS varchar(30),CRD_NO int(10),PSWD varchar(20));


-- Creating Wallet table
create  table WALLET(WLT_PT int(5) ,WLT_NO int(5)primary key,CUS_ID int(5),
foreign key (CUS_ID) references CUSTOMER(CUS_ID));


-- Creating Menu table
create table MENU(ITM_ID int not null primary key,ITM_NAME varchar(50),PRICE int, PRI_DES varchar(60),QTY int(3));

-- Creating VENDOR table
 create table VENDOR(SPL varchar(30),STATUS varchar(50) not null,VDR_ID int not null primary key);

-- Creating Orders table
CREATE TABLE ORDERS (
    ODR_ID int NOT NULL primary key,
    STATUS varchar(50) NOT NULL,
    CUS_ID int,
    VDR_ID int,
    FOREIGN KEY (CUS_ID) REFERENCES CUSTOMER(CUS_ID),
	FOREIGN KEY (VDR_ID) REFERENCES VENDOR(VDR_ID),
    ODR_HTY varchar(50)
    );
