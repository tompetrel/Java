create database softech

use

create table student (studentID nvarchar(10) not null, batch nvarchar(10) not null, name nvarchar(50)not null ,primary key(studentID))

insert into student values 
('softech001','batch130','Nguyen Anh Tan'),
('softech002','batch130','Nguyen Hong Hai'),
('softech003','batch130','Phan Phuong Nam'),
('softech004','batch131','Nguyen Huu Hiep'),
('softech005','batch131','Vo Ngoc Hai'),
('softech006','batch131','Tran Anh Tuan');

create table test (num int not null, primary key(num))
