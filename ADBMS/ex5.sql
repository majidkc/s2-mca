create database store;
use store;
create table product(pdtid int primary key, pname varchar(20), price int, quantity int);
 call insertproduct(1,"mutayi",33,5)
 
 CREATE DEFINER=`root`@`localhost` PROCEDURE `insertproduct`(in barcode int, in pname varchar(36), in price int, in quantity int)
BEGIN
if(price>0 && quantity>=0)
then
insert into product values(barcode, pname, price, quantity);
end if;
END