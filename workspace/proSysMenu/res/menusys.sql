DROP database IF EXISTS menuSys; 
create database menuSys;
use menuSys;
set names gbk;

DROP TABLE IF EXISTS t_menutype;
CREATE TABLE t_menutype (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) DEFAULT NULL,
  remark varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into t_menuType(name)values('凉菜'),('热菜');

DROP TABLE IF EXISTS t_menu;
CREATE TABLE t_menu (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) DEFAULT NULL,
  menuPic varchar(100),
  price float DEFAULT NULL,
  menuTypeId int(11) DEFAULT NULL,
  remark varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY menuTypeId (menuTypeId),
  CONSTRAINT t_menu_mtype_1 FOREIGN KEY (menuTypeId) REFERENCES t_menutype (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS t_order;
CREATE TABLE t_order (
  id int(11) NOT NULL AUTO_INCREMENT,
  tableNum varchar(10) DEFAULT NULL,
  createDatetime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  personCount int(11) DEFAULT NULL,
  isPay int(11) DEFAULT 0 comment '0是未买单',
  totalPrice double DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_orderitem;
CREATE TABLE t_orderitem (
  id int(11) NOT NULL AUTO_INCREMENT,
  orderId int(11) DEFAULT NULL,
  menuId int(11) DEFAULT NULL,
  num int(11) DEFAULT 1 COMMENT '份数',
  PRIMARY KEY (id),
  CONSTRAINT t_orderitem_ibfk_1 FOREIGN KEY (orderId) REFERENCES t_order (id),
  CONSTRAINT t_orderitem_ibfk_2 FOREIGN KEY (menuId) REFERENCES t_menu (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





