CREATE TABLE countries(
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0),
CODE_ID int
);

DESC countries;

ALTER TABLE countries
DROP column CODE_ID;


DESC countries;

