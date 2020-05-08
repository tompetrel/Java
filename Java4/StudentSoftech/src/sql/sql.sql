
create database session01_02

create table class (ClassID varchar(10) not null, ClassName nvarchar(10) not null, primary key(ClassID))

insert into class values 
('Batch130','Batch 130'),
('Batch131','Batch 131'),
('Batch132','Batch 132'),
('Batch133','Batch 133'),
('Batch134','Batch 134'),
('Batch135','Batch 135');

create table Student (StudentID nvarchar(10) not null, StudentName nvarchar(50) not null, Sex bit not null, ClassID varchar(10), primary key(StudentID))

insert into Student values 
('Softech001','Nguyen Anh Tan',1,'Batch130'),
('Softech002','Nguyen Hong Hai',1,'Batch130'),
('Softech003','Nguyen Hoang Nguyen',1,'Batch130'),
('Softech004','Phan Phuong Nam',1,'Batch130'),
('Softech005','Nguyen Thanh Tuan',1,'Batch130'),
('Softech006','Nguyen Van Nhat Tan',1,'Batch131'),
('Softech007','Phan Thi Thanh Thao',0,'Batch131'),
('Softech008','Vo Ngoc Hai',1,'Batch131'),
('Softech009','Truong Cong Khoa',1,'Batch131'),
('Softech010','Truong Minh Tri',1,'Batch131'),
('Softech011','Nguyen Cong Phu',1,'Batch132'),
('Softech012','Le Tuan Anh',1,'Batch132'),
('Softech013','Nguyen Duc Thanh Hai',1,'Batch132'),
('Softech014','Huynh Ba Rin',1,'Batch132'),
('Softech015','Tran Tan An',1,'Batch132');