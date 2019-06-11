
use commonDemo;

-- common_table
create table common_table(
	id int auto_increment not null comment '流水号',
	name varchar(64) not null comment '名称',
	age int comment '年龄',
	address varchar(128) not null comment '地址',
	fcu varchar(32),
	fcd varchar(19),
	lcu varchar(32),
	lcd varchar(19),
	primary key (id)
) engine=InnoDB default charset=utf8;


select * from common_table;

select id,name,age,address,fcu,fcd,lcu,lcd from common_table;


drop table common_table;