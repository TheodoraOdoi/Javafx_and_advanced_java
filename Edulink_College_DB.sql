-- Create the college Database
Create database Theodora_ADSE2501_CollegeDB;

-- Switch to the college DB
Use Theodora_ADSE2501_CollegeDB;

-- Create the course table
Create Table Course
(
	CourseCode nvarchar(20) not null primary key,
	CourseName nvarchar(100) not null,
	Fee float not null default(40000.0),
	Duration int not null
);

-- Create the modules table
Create table Module
(
	ModuleID nvarchar(20) not null primary key,
	ModuleName nvarchar(100) not null,
	CourseCode nvarchar(20) not null
	Foreign key(CourseCode) references Course(CourseCode)
);

-- Insert/Add rows into the course table
Insert into Course
values
('ACCP', 'Aptech Certified Computer Professional', 250000.4, 24),
('ARENA', 'Aptech Multimedia', 210000.10, 18),
('BBA', 'Bachelors in Business Accounting', 750000.3, 36),
('BBET', 'Business Entrepreneurship', 780000.4, 40),
('BBM', 'Business Marketing', 650000.8,36),
('ICDL', 'International Computer Driving Licence', 420000.4, 3);

--Insert/Add rows into the Module table
Insert into Module
values
('OV-MOD-C', 'C Programming', 'ACCP'),
('OV-MOD-DWCC2020', 'Designing Websites using Dreamweaver', 'ACCP'),
('EDU-MOD-BEC', 'Business Economics', 'BBA'),
('PAC-WORD', 'Wordpressing using MS-Word', 'ICDL'),
('PAC-EXCEL', 'Spreadsheets using MS-Excel', 'ICDL'),
('OV-MOD-MAYA', '3-D Modelling using Autodesk Maya', 'ARENA'),
('OV-MOD-SQLSVR', 'Database Management using SQL Server', 'ACCP'),
('EDU-MOD-DM', 'Digital Marketing', 'BBM'),
('OV-MOD-GOOGADVTG', 'Google Advertising Fundamentals', 'ACCP'),
('OV-MOD-GOOGANYTCS', 'Google Analytics', 'ACCP'),
('OV-MOD-HTML5', 'Creating Next Generation Websites', 'ACCP'),
('OV-MOD-INTSE', 'Internet Security', 'ACCP');