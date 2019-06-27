create table student
(
 id int primary key,
 name varchar(20),
 cgpa float
);
insert into student values (1,"deepak",9.99);
insert into student values (2,"abhishek",8.9);
insert into student values (3,"yogita",5.55);
select * from student;`
create table course
(
 id int primary key,
 name varchar(20),
 fees int
);
insert into course values (101,"java",10000);
insert into course values (102,".net",1000);
select * from course;
alter table course change id course_id int;
alter table student add course_id int;
alter table student add foreign key (course_id) references course(course_id);
select * from student;
update student set course_id = 101 where id = 1;
update student set course_id = 101 where id = 2;
update student set course_id = 102 where id = 3;

create table customer
(
 customer_id int primary key,
 name varchar(20)
);
insert into customer values (1,"deepak");
insert into customer values (2,"shekhar");
select * from customer;

create table orders
(
 order_id int primary key,
 cost int,
 customer_id int,
 foreign key(customer_id) references customer(customer_id)
);

insert into orders values (1,1000,1);
insert into orders values (2,15000,1);
select * from orders;

create table product
(
 product_id int primary key,
 name varchar(20),
 cost int
);

insert into product values (2,"table",200);
insert into product values (3,"chair",100);
select * from product;

create table lineitem
(
 item_id int primary key,
 quantity int,
 product_id int,
 customer_id int,
 foreign key(product_id) references product(product_id),
 foreign key(customer_id) references customer(customer_id)
);

insert into lineitem values (1,5,2,1);
insert into lineitem values (2,3,3,1);
select * from lineitem;


create table customers
(
	id int primary key AUTO_INCREMENT,
	firstname varchar(20),
	lastname varchar(20),
	dob varchar(20),
	balance double,
	cardtype varchar(20)
);

insert into customers values (1,'deepak','gupta','2/4/1990',2000,'CREDIT');
insert into customers (firstname,lastname,dob,balance,cardtype) values ('yogita','more','2/8/1990',200,'DEBIT');
insert into customers (firstname,lastname,dob,balance,cardtype) values ('abhishek','londhe','24/9/1990',200,'CREDIT');



create table users
(
	id int primary key,
	username varchar(20),
	pwd varchar(20),
	role varchar(20)
);

insert into users values (1,'admin','admin','admin');

select * from users;

create table vendor
(
	id int primary key,
	name varchar(20),
	balance double
);

insert into vendor values(101,'DMart',500000);

select * from vendor;
select * from customers;



