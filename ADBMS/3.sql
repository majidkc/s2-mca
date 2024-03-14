use student;
create table department(department_id int primary key,department_name varchar(50),location_id int,foreign key(location_id) references locations(location_id));

INSERT INTO
departments(department_id,department_name,location_id) VALUES
(1,'Administration',1700);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(2,'Marketing',1800);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(3,'Purchasing',1700);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(4,'Human Resources',2400);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(5,'Shipping',1500);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(6,'IT',1400);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(7,'Public Relations',2700);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(8,'Sales',2500);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(9,'Executive',1700);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(10,'Finance',1700);
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(11,'Accounting',1700);
