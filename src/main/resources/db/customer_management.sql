create database customer_management;

create table if not exists customers (
    id int primary key auto_increment,
    name varchar(45) not null,
    email varchar(45) not null,
    address varchar(45) not null
    );

insert into customers (name, email, address) values
('Ty', 'ty@gmail.com', '21K NVT')
,('Teo', 'teo@gmail.com', '21K NVT')
,('To', 'to@gmail.com', '21K NVT')
;