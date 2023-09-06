create table lrc_Customer(
cust_id serial  primary key,
cust_fname varchar(50),
cust_lname varchar(50),
cust_dob Date,
cust_panno varchar(10),
cust_mobile int,
cust_address varchar(200),
cust_gname varchar(50)
)

create table lrc_loanapplicants(
la_id serial primary key,
la_cust_id int references lrc_Customer(cust_id),
la_date Date,
la_lt_id int references lrc_loantype(lt_id),
la_amount numeric,
la_emirange_from numeric,
la_emirange_to numeric,
la_nom_req int,
la_cibil_score numeric,
la_staus varchar(4),
la_conclusion_remarks varchar(255),
la_ln_id int references lrc_Loan_Nominees(ln_id)
)


create table lrc_loanType(
lt_id serial primary key,
ly_name varchar(50),
lt_desc varchar(255)
)

create table lrc_Loan_Nominees(
ln_id serial primary key,
ln_nominee varchar(50),
ln_relation varchar(50)
	)
	ALTER TABLE lrc_loanapplicants

ALTER COLUMN la_date  SET DATA TYPE varchar(10);


select * from lrc_Customer

select * from lrc_loanapplicants

select * from lrc_loanType

select * from lrc_Loan_Nominees



