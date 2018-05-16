drop database kjsb ;
create database kjsb ;
use kjsb ;
DROP TABLE IF EXISTS expert;
CREATE TABLE expert (
  expertid int(11) NOT NULL auto_increment COMMENT '专家信息表ID',
  uid int(11) default NULL COMMENT '登录用户ID自增',
  name varchar(20) default NULL COMMENT '专家名称',
  nation varchar(20) default NULL COMMENT '名称',
  sex varchar(2) default NULL COMMENT '性别',
  unitname varchar(50) default NULL COMMENT '所在单位名称',
  title varchar(50) default NULL COMMENT '职称',
  tel varchar(15) default NULL COMMENT '电话',
  introduction text COMMENT '研究介绍',
  PRIMARY KEY  (expertid)
)COMMENT='专家信息表';

DROP TABLE IF EXISTS project;
CREATE TABLE project (
  project_id int(11) NOT NULL auto_increment COMMENT '项目ID',
  categoryid int(11) default NULL COMMENT '项目ID',
  unitid int(11) default NULL COMMENT '单位ID',
  applicant varchar(15) default NULL COMMENT '申请人',
  grade varchar(20) default NULL COMMENT '职称',
  education varchar(20) default NULL COMMENT '学历',
  fill_date date default NULL COMMENT '填报时间',
  status varchar(1000) default NULL COMMENT '现状',
  future varchar(1000) default NULL COMMENT '应用前景',
  analysis varchar(500) default NULL COMMENT '重点难点分析',
  way varchar(500) default NULL COMMENT '研究方法',
  result varchar(500) default NULL COMMENT '预期研究成果',
  projectname varchar(100) default NULL COMMENT '申请项目名称',
  capital varchar(20) default NULL COMMENT '申请资金',
  expert_opinion varchar(500) default NULL COMMENT '专家评审意见',
  score decimal(5,2) default NULL COMMENT '专家评分',
  ispass int(11) default '0' COMMENT '是否通过',
 
  PRIMARY KEY  (project_id)
  
)COMMENT='项目信息表';

DROP TABLE IF EXISTS project_category;
CREATE TABLE project_category (
  categoryid int(11) NOT NULL auto_increment COMMENT '项目ID',
  expertid int(11) default NULL COMMENT '专家信息表ID',
  categoryname varchar(50) NOT NULL COMMENT '项目名称',
  rep_start_time date default NULL COMMENT '单位申报开始时间',
  rep_stop_time date default NULL COMMENT '单位申报结束时间',
  exp_start_time date default '1997-01-01' COMMENT '专家审批开始时间',
  exp_stop_time date default '1997-01-01' COMMENT '专家审批结束时间',
  PRIMARY KEY  (categoryid)
)COMMENT='项目类别表';

DROP TABLE IF EXISTS unit;
CREATE TABLE unit (
  unitid int(11) NOT NULL auto_increment COMMENT '单位ID',
  uid int(11) default NULL COMMENT '登录用户ID自增',
  unitname varchar(50) default NULL COMMENT '单位名称',
  address varchar(50) default NULL COMMENT '单位地址',
  corporation varchar(20) default NULL COMMENT '单位法人',
  investment varchar(10) default NULL COMMENT '单位资产',
  type varchar(20) default NULL COMMENT '单位性质',
  tel varchar(15) default NULL COMMENT '单位电话',
  email varchar(30) default NULL COMMENT '单位邮箱',
  fax varchar(15) default NULL COMMENT '单位传真',
  zipcode varchar(6) default NULL COMMENT '单位邮编',
  introduction text COMMENT '单位介绍',
 
  PRIMARY KEY  (unitid)
  
)COMMENT='单位信息表';

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  uid int(11) NOT NULL auto_increment COMMENT '登录用户ID自增',
  gid int(11) default NULL COMMENT '人员分组ID',
  username varchar(15) NOT NULL COMMENT '登录用户名',
  password varchar(15) NOT NULL COMMENT '登录密码',
  PRIMARY KEY  (uid)
)COMMENT='统一登录用户信息表';

DROP TABLE IF EXISTS useradmin;
CREATE TABLE useradmin (
  aid int(11) NOT NULL auto_increment COMMENT '管理员信息表ID',
  uid int(11) default NULL COMMENT '登录用户ID自增',
  aname varchar(20) NOT NULL COMMENT '管理员名称',
  deptname varchar(50) default NULL COMMENT '所属单位名称',
  PRIMARY KEY  (aid)  
)COMMENT='管理员信息表';

DROP TABLE IF EXISTS usergroup;
CREATE TABLE usergroup (
  gid int(11) NOT NULL auto_increment COMMENT '人员分组ID',
  gname varchar(20) NOT NULL COMMENT '组类别名称',
  PRIMARY KEY  (gid)
)COMMENT='人员分组信息表';

DROP TABLE IF EXISTS category_unit;
CREATE TABLE category_unit (
	id int(11) NOT NULL auto_increment COMMENT '主键ID',
  categoryid int(11) default NULL COMMENT '项目ID',
  unitid int(11) default NULL COMMENT '单位ID',
  PRIMARY KEY(id)
) COMMENT='项目类别_单位中间表';
