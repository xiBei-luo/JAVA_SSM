DROP TABLE expert;
CREATE TABLE expert (
  expertid number NOT NULL,
  userid number default NULL,
  name varchar(20) default NULL,
  nation varchar(20) default NULL,
  sex varchar(2) default NULL,
  unitname varchar(50) default NULL,
  title varchar(50) default NULL,
  tel varchar(15) default NULL,
  introduction clob,
  PRIMARY KEY  (expertid)
);
comment on table expert is '专家信息表';
comment on column expert.expertid is '专家主键';

DROP TABLE project;
CREATE TABLE project (
  project_id number NOT NULL,
  categoryid number default NULL,
  unitid number default NULL,
  applicant varchar(15) default NULL,
  grade varchar(20) default NULL,
  education varchar(20) default NULL,
  fill_date date default NULL,
  status varchar(1000) default NULL,
  future varchar(1000) default NULL,
  analysis varchar(500) default NULL,
  way varchar(500) default NULL,
  result varchar(500) default NULL,
  projectname varchar(100) default NULL,
  capital varchar(20) default NULL,
  expert_opinion varchar(500) default NULL,
  score decimal(5,2) default NULL,
  ispass number default '0',
  PRIMARY KEY  (project_id)
);

DROP TABLE project_category;
CREATE TABLE project_category (
  categoryid number NOT NULL ,
  expertid number default NULL ,
  categoryname varchar(50) NOT NULL,
  rep_start_time date default NULL,
  rep_stop_time date default NULL,
  exp_start_time date,
  exp_stop_time date,
  PRIMARY KEY  (categoryid)
);

DROP TABLE unit;
CREATE TABLE unit (
  unitid number NOT NULL ,
  userid number default NULL,
  unitname varchar(50) default NULL ,
  address varchar(50) default NULL,
  corporation varchar(20) default NULL,
  investment varchar(10) default NULL,
  type varchar(20) default NULL ,
  tel varchar(15) default NULL ,
  email varchar(30) default NULL,
  fax varchar(15) default NULL,
  zipcode varchar(6) default NULL,
  introduction clob,
  PRIMARY KEY  (unitid)
);

DROP TABLE  usr; --表名不要叫user
CREATE TABLE usr (
  id number NOT NULL , --字段不要起名为uid
  gid number default NULL,
  username varchar(15) NOT NULL,
  password varchar(15) NOT NULL,
  PRIMARY KEY  (id)
);

DROP TABLE useradmin;
CREATE TABLE useradmin (
  aid number NOT NULL ,
  userid number default NULL ,
  aname varchar(20) NOT NULL,
  deptname varchar(50) default NULL,
  PRIMARY KEY  (aid)  
);

DROP TABLE usergroup;
CREATE TABLE usergroup (
  gid number NOT NULL ,
  gname varchar(20) NOT NULL,
  PRIMARY KEY  (gid)
);

DROP TABLE category_unit;
CREATE TABLE category_unit (
	id number NOT NULL,
  categoryid number default NULL,
  unitid number default NUll,
  PRIMARY KEY(id)
);


insert into usergroup values(seq_id.nextval,'管理员');
insert into usergroup values(seq_id.nextval,'专家');
insert into usergroup values(seq_id.nextval,'单位');




 create sequence seq_id
      minvalue 1
      start with 1
      increment by 1
      cache 20;
      
commit ;    
      