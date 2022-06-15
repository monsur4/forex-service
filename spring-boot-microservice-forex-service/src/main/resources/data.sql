create table exchange_value(id integer, currency_from varchar(50), currency_to varchar(50), conversion_multiple integer, port integer);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10002,'EUR','INR',75,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10003,'AUD','INR',25,0);