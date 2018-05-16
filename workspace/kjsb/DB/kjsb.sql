-- MySQL dump 10.11
--
-- Host: localhost    Database: kjsb
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category_unit`
--

DROP TABLE IF EXISTS `category_unit`;
CREATE TABLE `category_unit` (
  `categoryid` int(11) default NULL COMMENT '项目ID',
  `unitid` int(11) default NULL COMMENT '单位ID',
  KEY `FK_category_categoryunit` (`categoryid`),
  KEY `FK_unit_categoryunit` (`unitid`),
  CONSTRAINT `FK_category_categoryunit` FOREIGN KEY (`categoryid`) REFERENCES `project_category` (`categoryid`),
  CONSTRAINT `FK_unit_categoryunit` FOREIGN KEY (`unitid`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='项目类别_单位中间表';

--
-- Dumping data for table `category_unit`
--

LOCK TABLES `category_unit` WRITE;
/*!40000 ALTER TABLE `category_unit` DISABLE KEYS */;
INSERT INTO `category_unit` VALUES (1,1),(1,2),(2,1),(2,2);
/*!40000 ALTER TABLE `category_unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expert`
--

DROP TABLE IF EXISTS `expert`;
CREATE TABLE `expert` (
  `expertid` int(11) NOT NULL auto_increment COMMENT '专家信息表ID',
  `uid` int(11) default NULL COMMENT '登录用户ID自增',
  `name` varchar(20) default NULL COMMENT '专家名称',
  `nation` varchar(20) default NULL COMMENT '名称',
  `sex` varchar(2) default NULL COMMENT '性别',
  `unitname` varchar(50) default NULL COMMENT '所在单位名称',
  `title` varchar(50) default NULL COMMENT '职称',
  `tel` varchar(15) default NULL COMMENT '电话',
  `introduction` text COMMENT '研究介绍',
  `temp1` varchar(100) default NULL COMMENT '预留字段1',
  `temp2` varchar(100) default NULL COMMENT '预留字段2',
  `temp3` varchar(100) default NULL COMMENT '预留字段3',
  `temp4` varchar(100) default NULL COMMENT '预留字段4',
  PRIMARY KEY  (`expertid`),
  KEY `FK_user_expert` (`uid`),
  CONSTRAINT `FK_user_expert` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='专家信息表';

--
-- Dumping data for table `expert`
--

LOCK TABLES `expert` WRITE;
/*!40000 ALTER TABLE `expert` DISABLE KEYS */;
INSERT INTO `expert` VALUES (1,2,'郭锐','中国','男','亚思晟','特级教师','110',NULL,NULL,NULL,NULL,NULL),(2,5,'专家test','中国','女','单位测试','工程师','123456','测试修改专家信息',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `expert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `project_id` int(11) NOT NULL auto_increment COMMENT '项目ID',
  `categoryid` int(11) default NULL COMMENT '项目ID',
  `unitid` int(11) default NULL COMMENT '单位ID',
  `applicant` varchar(15) default NULL COMMENT '申请人',
  `grade` varchar(20) default NULL COMMENT '职称',
  `education` varchar(20) default NULL COMMENT '学历',
  `fill_date` date default NULL COMMENT '填报时间',
  `status` varchar(1000) default NULL COMMENT '现状',
  `future` varchar(1000) default NULL COMMENT '应用前景',
  `analysis` varchar(500) default NULL COMMENT '重点难点分析',
  `way` varchar(500) default NULL COMMENT '研究方法',
  `result` varchar(500) default NULL COMMENT '预期研究成果',
  `projectname` varchar(100) default NULL COMMENT '申请项目名称',
  `capital` varchar(20) default NULL COMMENT '申请资金',
  `expert_opinion` varchar(500) default NULL COMMENT '专家评审意见',
  `score` decimal(5,2) default NULL COMMENT '专家评分',
  `ispass` int(11) default '0' COMMENT '是否通过',
  `temp1` varchar(100) default NULL COMMENT '预留字段1',
  `Attribute_58` varchar(100) default NULL COMMENT '预留字段2',
  `Attribute_59` varchar(100) default NULL COMMENT '预留字段3',
  `Attribute_60` varchar(100) default NULL COMMENT '预留字段4',
  PRIMARY KEY  (`project_id`),
  KEY `FK_category_project` (`categoryid`),
  KEY `FK_unit_project` (`unitid`),
  CONSTRAINT `FK_category_project` FOREIGN KEY (`categoryid`) REFERENCES `project_category` (`categoryid`),
  CONSTRAINT `FK_unit_project` FOREIGN KEY (`unitid`) REFERENCES `unit` (`unitid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='项目信息表';

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,1,1,'郭锐','总裁','教授','2008-11-11','乐观','前途无量','据我多年的经验分析，前途无量','视频教学','资金成倍增长','视频java培训，项目驱动java学习','100万','不错','90.00',0,'','','',''),(2,1,2,'杨坡','小老板','高中','2008-11-11','一般','小有发展','发展代理的方式','做大的培训机构的代理','稳步发展','选择做大培训机构代理方式培训java','50万','','0.00',0,'','','',''),(3,2,1,'郭锐','总裁','教授','2008-11-12','不乐观','前途无量','绿色食品保藏的开发研究','先进技术有效长期保藏','资金成倍增长','先进技术长期保藏绿色食品','200万','','0.00',0,'','','',''),(4,2,2,'杨坡','小老板','高中','2008-11-12','一般','前途无量','绿色大棚','开发先进的绿色大棚种植技术','稳步发展','新式绿色大棚技术促进绿色环保','100万','想法不错，前途有待考虑','55.00',0,'','','','');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_category`
--

DROP TABLE IF EXISTS `project_category`;
CREATE TABLE `project_category` (
  `categoryid` int(11) NOT NULL auto_increment COMMENT '项目ID',
  `expertid` int(11) default NULL COMMENT '专家信息表ID',
  `categoryname` varchar(50) NOT NULL COMMENT '项目名称',
  `rep_start_time` date default NULL COMMENT '单位申报开始时间',
  `rep_stop_time` date default NULL COMMENT '单位申报结束时间',
  `exp_start_time` date default '1997-01-01' COMMENT '专家审批开始时间',
  `exp_stop_time` date default '1997-01-01' COMMENT '专家审批结束时间',
  PRIMARY KEY  (`categoryid`),
  KEY `FK_expert_category` (`expertid`),
  CONSTRAINT `FK_expert_category` FOREIGN KEY (`expertid`) REFERENCES `expert` (`expertid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='项目类别表';

--
-- Dumping data for table `project_category`
--

LOCK TABLES `project_category` WRITE;
/*!40000 ALTER TABLE `project_category` DISABLE KEYS */;
INSERT INTO `project_category` VALUES (1,1,'java培训研究','2008-11-10','2008-12-10','2008-12-10','2008-12-29'),(2,1,'绿色环保课题','2008-11-11','2008-12-11','2008-12-11','2008-12-29'),(3,1,'新添加类别测试1','2008-11-13','2008-12-13',NULL,NULL),(4,2,'ss','2008-11-14','2008-12-14',NULL,NULL),(5,2,'类别测试','2008-11-14','2008-12-14',NULL,NULL);
/*!40000 ALTER TABLE `project_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unit`
--

DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `unitid` int(11) NOT NULL auto_increment COMMENT '单位ID',
  `uid` int(11) default NULL COMMENT '登录用户ID自增',
  `unitname` varchar(50) default NULL COMMENT '单位名称',
  `address` varchar(50) default NULL COMMENT '单位地址',
  `corporation` varchar(20) default NULL COMMENT '单位法人',
  `investment` varchar(10) default NULL COMMENT '单位资产',
  `type` varchar(20) default NULL COMMENT '单位性质',
  `tel` varchar(15) default NULL COMMENT '单位电话',
  `email` varchar(30) default NULL COMMENT '单位邮箱',
  `fax` varchar(15) default NULL COMMENT '单位传真',
  `zipcode` varchar(6) default NULL COMMENT '单位邮编',
  `introduction` text COMMENT '单位介绍',
  `temp1` varchar(100) default NULL COMMENT '预留字段1',
  `temp2` varchar(100) default NULL COMMENT '预留字段2',
  `temp3` varchar(100) default NULL COMMENT '预留字段3',
  `temp4` varchar(100) default NULL COMMENT '预留字段4',
  PRIMARY KEY  (`unitid`),
  KEY `FK_user_unit` (`uid`),
  CONSTRAINT `FK_user_unit` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='单位信息表';

--
-- Dumping data for table `unit`
--

LOCK TABLES `unit` WRITE;
/*!40000 ALTER TABLE `unit` DISABLE KEYS */;
INSERT INTO `unit` VALUES (1,3,'单位1','海淀创业园','郭锐','1000万','私营','110','110@gmail.com','010-110','110000','单位1是一个注册资金1000万的私营企业，成立于2008年，一年时间内迅速壮大，于11月份成功上市！','','','',''),(2,4,'单位2','中关村','杨坡','10万','私营','119','119@gmail.com','010-119','119000','瞎混日子，谋求发展','','','',''),(3,6,'单位3','测试','测试','10万','民营','111','111@126.com','111','111111','测试测试测试',NULL,NULL,NULL,NULL),(4,7,'单位4','测试测试','测试测试','333','测试','121','121@126.com','121','111211','首都师大测试测试测试',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL auto_increment COMMENT '登录用户ID自增',
  `gid` int(11) default NULL COMMENT '人员分组ID',
  `username` varchar(15) NOT NULL COMMENT '登录用户名',
  `password` varchar(15) NOT NULL COMMENT '登录密码',
  PRIMARY KEY  (`uid`),
  KEY `FK_usergroup_user` (`gid`),
  CONSTRAINT `FK_usergroup_user` FOREIGN KEY (`gid`) REFERENCES `usergroup` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='统一登录用户信息表';

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'admin','admin'),(2,2,'expert1','123456'),(3,3,'unit1','123456'),(4,3,'unit2','123456'),(5,2,'expert2','123456'),(6,3,'unit3','123456'),(7,3,'unit4','123456');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useradmin`
--

DROP TABLE IF EXISTS `useradmin`;
CREATE TABLE `useradmin` (
  `aid` int(11) NOT NULL auto_increment COMMENT '管理员信息表ID',
  `uid` int(11) default NULL COMMENT '登录用户ID自增',
  `aname` varchar(20) NOT NULL COMMENT '管理员名称',
  `deptname` varchar(50) default NULL COMMENT '所属单位名称',
  PRIMARY KEY  (`aid`),
  KEY `FK_user_useradmin` (`uid`),
  CONSTRAINT `FK_user_useradmin` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='管理员信息表';

--
-- Dumping data for table `useradmin`
--

LOCK TABLES `useradmin` WRITE;
/*!40000 ALTER TABLE `useradmin` DISABLE KEYS */;
INSERT INTO `useradmin` VALUES (1,1,'管理员','最高管理部门');
/*!40000 ALTER TABLE `useradmin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroup`
--

DROP TABLE IF EXISTS `usergroup`;
CREATE TABLE `usergroup` (
  `gid` int(11) NOT NULL auto_increment COMMENT '人员分组ID',
  `gname` varchar(20) NOT NULL COMMENT '组类别名称',
  PRIMARY KEY  (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='人员分组信息表';

--
-- Dumping data for table `usergroup`
--

LOCK TABLES `usergroup` WRITE;
/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
INSERT INTO `usergroup` VALUES (1,'管理员'),(2,'专家'),(3,'单位');
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2008-11-14  7:05:04
