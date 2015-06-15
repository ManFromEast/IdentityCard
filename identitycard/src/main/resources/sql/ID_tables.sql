
--DROP table IDENTITY_CARD;

create table IDENTITY_CARD(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	ID_NUMBER VARCHAR(20) UNIQUE NOT NULL,
	NATIONALITY VARCHAR(255) NOT NULL,
	ISSUING_AUTHORITY VARCHAR(255) NOT NULL,
	FIRSTNAME VARCHAR(50) NOT NULL,
	LASTNAME VARCHAR(50) NOT NULL,
	FULLNAME VARCHAR(100) NOT NULL,
	GENDER CHAR(5) NOT NULL,
	DATE_OF_BIRTH TIMESTAMP NOT NULL,
	CREATION_DATE TIMESTAMP NOT NULL,
	EXPIRATION_DATE TIMESTAMP NOT NULL
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--DROP table RESIDENCE_ADDRESS;

create table RESIDENCE_ADDRESS(
	IDENTITY_CARD_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	PROVINCE_STATE VARCHAR(30) NOT NULL,
	CITY_COUNTY VARCHAR(30) NOT NULL,
	DISTRICT	VARCHAR(30) NOT NULL,
	TOWN		VARCHAR(30) NOT NULL,
	VILLAGE_STREET VARCHAR(255) NOT NULL,
	FULL_ADDRESS VARCHAR(255),
	CONSTRAINT FK_IDENTITY_CARD_ID foreign key (IDENTITY_CARD_ID) references IDENTITY_CARD(ID)
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--alter table RESIDENCE_ADDRESS add constraint FK_IDENTITY_CARD_ID foreign key (IDENTITY_CARD_ID) references IDENTITY_CARD(ID);