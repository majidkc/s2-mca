create database university;
use university;
create table student (names varchar(50) , student_no int, class int, major varchar(50));
create table course (course_name varchar(50), course_no varchar(50), credit_hour int, department varchar(50));
create table section (section_identifier int, course_no varchar(50), semester int, year int, instuctor varchar(50));
create table gradereport (student_no int, section_identifier int, grade varchar(50));
create table prerequisite (course_no varchar(50),prerequisite_no  varchar(50));

alter table student ADD primary key (student_no);
alter table course ADD primary key (course_no);
alter table section ADD primary key (section_identifier);

alter table section ADD foreign key (course_no) references course(course_no);
alter table gradereport ADD foreign key (student_no) references student(student_no);
alter table gradereport ADD foreign key (section_identifier) references section(section_identifier);
alter table prerequisite ADD foreign key (course_no) references course(course_no);
alter table prerequisite ADD foreign key (prerequisite_no) references prerequisite(course_no);

alter table prerequisite ADD primary key (prerequisite_no, course_no);
alter table gradereport ADD primary key (section_identifier, student_no);
alter table section modify column semester varchar(50); 

insert into student values('Smith', 17, 1, 'CS');
insert into student values('Smithrown', 8, 2, 'CS');

insert into course values('into to computer science', 'CS1310', 4, 'CS');
insert into course values('data structure', 'CS3320', 4, 'CS');
insert into course values('discrere mathematics', 'MATH2410', 3, 'MATH');
insert into course values('database', 'CS3380', 3, 'CS');

insert into section values(85, 'MATH2410', 'Fall', 07, 'King');
insert into section values(92, 'CS1310', 'Fall', 07, 'Anderson');
insert into section values(102, 'CS3320', 'Spring', 08, 'Knuth');
insert into section values(112, 'MATH2410', 'Fall', 08, 'Chang');
insert into section values(119, 'CS1310', 'Fall', 08, 'Anderson');
insert into section values(102, 'CS3380', 'Fall', 08, 'Stone');

insert into gradereport values(17, 112, 'B');
insert into gradereport values(17, 119, 'C');
insert into gradereport values(8, 85, 'A');
insert into gradereport values(8, 92, 'A');
insert into gradereport values(8, 102, 'B');
insert into gradereport values(8, 135, 'A');

insert into prerequisite values('CS3380', 'CS3320');
insert into prerequisite values('CS3380', 'MATH2410');
insert into prerequisite values('CS3320', 'CS1310');

select * from student;

select s.names, s.student_no, g.grade, c.course_name from student s
INNER JOIN gradereport g ON s.student_no = g.student_no INNER JOIN section se
ON g.section_identifier = se.section_identifier INNER JOIN course c
ON se.course_no = c.course_no WHERE s.names = 'Smith';


select s.names, g.grade from course c INNER JOIN section se ON c.course_no = se.course_no INNER JOIN gradereport g ON
se.section_identifier = g.section_identifier INNER JOIN student s ON g.student_no = s.student_no WHERE se.semester = 'Fall'
AND se.year = 08 AND c.course_name = 'database';

select course_name as prerequisite_name, prerequisite_no from prerequisite inner join course on 
prerequisite.prerequisite_no=course.course_no where prerequisite.course_no=(select course.course_no from course where 
course.course_name="database");

create view student_view as select names from student where major="CS";

select c.course_name from course c inner join section s  on c.course_no = s.course_no where s.instuctor="king"
and year in (07,08);

select course_no,semester,year,count(student_no) from section  inner join gradereport on
section.section_identifier = gradereport.section_identifier
group by gradereport.section_identifier having instuctor="King";
 
select names, course.course_no, course_name,credit_hour,section.semester,year,gradereport.grade from student 
inner join gradereport  on student.student_no = gradereport.student_no
inner join section on gradereport.section_identifier = section.section_identifier
inner join course on section.course_no = course.course_no
where Class = 2 and major = "cs";

insert into student values('johnson',25,1,'MATH');

SET SQL_SAFE_UPDATES=0;
update student set class=2 where names="Smith";
SET SQL_SAFE_UPDATES=1;

insert into course values('Knowledge Engneering','CS4390',3,'CS');

delete from student where names="Smith" and student_no=17;

select * from student;










