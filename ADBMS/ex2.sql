create database work;
use work;
select * from countries;
select email, phone_number from employees;
select * from employees where last_name ='fay'; 
select hire_date from employees where last_name = 'Grant'or 'Whalen'; 
select first_name, last_name from employees where job_id=(select job_id from jobs where job_title="shipping clerk");
select e.first_name, e.last_name from employees e join jobs j on e.job_id=j.job_id where job_title='shipping clerk';
select first_name from employees where department_id='8';
select * from departments order by department_name desc;
select first_name, last_name from employees where last_name like 'K%';
select first_name, last_name from employees where hire_date between 1995 and 1997;
select * from jobs where max_salary<5000;
select lower(email) from employees;
select dayname('2024-02-27');
select first_name, last_name from employees where year(hire_date) = '1995';
select * from employees where dayname(hire_date) = 'Tuesday';
insert into employees (first_name, last_name, employee_id, department_id) values ('paul', 'newton', 207,11);



