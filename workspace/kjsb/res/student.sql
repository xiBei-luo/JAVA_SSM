drop database student ;
create database student ;
use student ;
set names gbk;
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` varchar(3) NOT NULL COMMENT '课程编号',
  `cname` varchar(20) NOT NULL COMMENT '课程名称',
  `tid` varchar(3) DEFAULT NULL COMMENT '授课教师编号',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `course` VALUES ('001', '企业管理', '002');
INSERT INTO `course` VALUES ('002', '马克思', '008');
INSERT INTO `course` VALUES ('003', 'UML', '006');
INSERT INTO `course` VALUES ('004', '数据库', '007');
INSERT INTO `course` VALUES ('005', '逻辑电路', '006');
INSERT INTO `course` VALUES ('006', '英语', '003');
INSERT INTO `course` VALUES ('007', '电子电路', '005');
INSERT INTO `course` VALUES ('008', '毛泽东思想概论', '004');
INSERT INTO `course` VALUES ('009', '西方哲学史', '012');
INSERT INTO `course` VALUES ('010', '线性代数', '017');
INSERT INTO `course` VALUES ('011', '计算机基础', '013');
INSERT INTO `course` VALUES ('012', 'AUTO CAD制图', '015');
INSERT INTO `course` VALUES ('013', '平面设计', '011');
INSERT INTO `course` VALUES ('014', 'Flash动漫', '001');
INSERT INTO `course` VALUES ('015', 'Java开发', '009');
INSERT INTO `course` VALUES ('016', 'C#基础', '002');
INSERT INTO `course` VALUES ('017', 'Oracl数据库原理', '010');

DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc` (
  `sid` varchar(5) DEFAULT NULL COMMENT '学号',
  `cid` varchar(3) DEFAULT NULL COMMENT '课程编号',
  `score` float DEFAULT NULL COMMENT '成绩'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `sc` VALUES ('1000', '014', '75');
INSERT INTO `sc` VALUES ('1000', '004', '16');
INSERT INTO `sc` VALUES ('1001', '003', '90');
INSERT INTO `sc` VALUES ('1001', '002', '87');
INSERT INTO `sc` VALUES ('1001', '001', '96');
INSERT INTO `sc` VALUES ('1001', '010', '85');
INSERT INTO `sc` VALUES ('1002', '003', '70');
INSERT INTO `sc` VALUES ('1002', '002', '87');
INSERT INTO `sc` VALUES ('1002', '001', '42');
INSERT INTO `sc` VALUES ('1002', '010', '65');
INSERT INTO `sc` VALUES ('1002', '016', '100');
INSERT INTO `sc` VALUES ('1002', '004', '55');
INSERT INTO `sc` VALUES ('1003', '006', '78');
INSERT INTO `sc` VALUES ('1003', '003', '70');
INSERT INTO `sc` VALUES ('1003', '005', '70');
INSERT INTO `sc` VALUES ('1003', '001', '32');
INSERT INTO `sc` VALUES ('1003', '010', '85');
INSERT INTO `sc` VALUES ('1003', '011', '21');
INSERT INTO `sc` VALUES ('1004', '007', '90');
INSERT INTO `sc` VALUES ('1004', '004', '42');
INSERT INTO `sc` VALUES ('1004', '002', '87');
INSERT INTO `sc` VALUES ('1004', '001', '83');
INSERT INTO `sc` VALUES ('1005', '001', '23');
INSERT INTO `sc` VALUES ('1006', '015', '85');
INSERT INTO `sc` VALUES ('1006', '006', '46');
INSERT INTO `sc` VALUES ('1006', '003', '59');
INSERT INTO `sc` VALUES ('1006', '004', '70');
INSERT INTO `sc` VALUES ('1006', '001', '99');
INSERT INTO `sc` VALUES ('1007', '011', '85');
INSERT INTO `sc` VALUES ('1007', '006', '84');
INSERT INTO `sc` VALUES ('1007', '003', '72');
INSERT INTO `sc` VALUES ('1007', '002', '87');
INSERT INTO `sc` VALUES ('1008', '001', '94');
INSERT INTO `sc` VALUES ('1008', '012', '85');
INSERT INTO `sc` VALUES ('1008', '006', '32');
INSERT INTO `sc` VALUES ('1008', '013', '97');
INSERT INTO `sc` VALUES ('1008', '004', '34');
INSERT INTO `sc` VALUES ('1009', '003', '90');
INSERT INTO `sc` VALUES ('1009', '002', '82');
INSERT INTO `sc` VALUES ('1009', '001', '96');
INSERT INTO `sc` VALUES ('1009', '010', '82');
INSERT INTO `sc` VALUES ('1009', '008', '92');
INSERT INTO `sc` VALUES ('1010', '003', '90');
INSERT INTO `sc` VALUES ('1010', '002', '87');
INSERT INTO `sc` VALUES ('1010', '001', '96');
INSERT INTO `sc` VALUES ('1011', '009', '24');
INSERT INTO `sc` VALUES ('1011', '009', '25');
INSERT INTO `sc` VALUES ('1012', '003', '30');
INSERT INTO `sc` VALUES ('1013', '002', '37');
INSERT INTO `sc` VALUES ('1013', '001', '16');
INSERT INTO `sc` VALUES ('1013', '007', '55');
INSERT INTO `sc` VALUES ('1013', '006', '42');
INSERT INTO `sc` VALUES ('1013', '012', '34');
INSERT INTO `sc` VALUES ('1013', '016', '86');
INSERT INTO `sc` VALUES ('1013', '016', '44');









DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` varchar(5) NOT NULL COMMENT '学号',
  `sname` varchar(10) NOT NULL COMMENT '学生姓名',
  `stuage` int(11) DEFAULT NULL COMMENT '学生年龄',
  `ssex` char(1) NOT NULL COMMENT '学生性别',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `student` VALUES ('1000', '张无忌', '18', '男');
INSERT INTO `student` VALUES ('1001', '周芷若', '19', '女');
INSERT INTO `student` VALUES ('1002', '杨过', '19', '男');
INSERT INTO `student` VALUES ('1003', '赵敏', '18', '女');
INSERT INTO `student` VALUES ('1004', '小龙女', '17', '女');
INSERT INTO `student` VALUES ('1005', '张三丰', '18', '男');
INSERT INTO `student` VALUES ('1006', '令狐冲', '19', '男');
INSERT INTO `student` VALUES ('1007', '任盈盈', '20', '女');
INSERT INTO `student` VALUES ('1008', '岳灵珊', '19', '女');
INSERT INTO `student` VALUES ('1009', '韦小宝', '18', '男');
INSERT INTO `student` VALUES ('1010', '康敏', '17', '女');
INSERT INTO `student` VALUES ('1011', '萧峰', '19', '男');
INSERT INTO `student` VALUES ('1012', '黄蓉', '18', '女');
INSERT INTO `student` VALUES ('1013', '郭靖', '19', '男');
INSERT INTO `student` VALUES ('1014', '周伯通', '19', '男');
INSERT INTO `student` VALUES ('1015', '瑛姑', '20', '女');
INSERT INTO `student` VALUES ('1016', '李秋水', '21', '女');
INSERT INTO `student` VALUES ('1017', '黄药师', '18', '男');
INSERT INTO `student` VALUES ('1018', '李莫愁', '18', '女');
INSERT INTO `student` VALUES ('1019', '冯默风', '17', '男');
INSERT INTO `student` VALUES ('1020', '王重阳', '17', '男');
INSERT INTO `student` VALUES ('1021', '郭襄', '18', '女');

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` varchar(3) NOT NULL COMMENT '教师编号',
  `tname` varchar(10) NOT NULL COMMENT '教师名称',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `teacher` VALUES ('001', '姚明');
INSERT INTO `teacher` VALUES ('002', '叶平');
INSERT INTO `teacher` VALUES ('003', '叶开');
INSERT INTO `teacher` VALUES ('004', '孟星魂');
INSERT INTO `teacher` VALUES ('005', '独孤求败');
INSERT INTO `teacher` VALUES ('006', '裘千仞');
INSERT INTO `teacher` VALUES ('007', '裘千尺');
INSERT INTO `teacher` VALUES ('008', '赵志敬');
INSERT INTO `teacher` VALUES ('009', '阿紫');
INSERT INTO `teacher` VALUES ('010', '郭芙蓉');
INSERT INTO `teacher` VALUES ('011', '佟湘玉');
INSERT INTO `teacher` VALUES ('012', '白展堂');
INSERT INTO `teacher` VALUES ('013', '吕轻侯');
INSERT INTO `teacher` VALUES ('014', '李大嘴');
INSERT INTO `teacher` VALUES ('015', '花无缺');
INSERT INTO `teacher` VALUES ('016', '金不换');
INSERT INTO `teacher` VALUES ('017', '乔丹');

#select sname from student where sid=(select sid from sc where cid=
#(select cid from course where tid=
#(select tid from teacher where tname like '姚明')));
#select sid,count(1) from sc where score < 60 group by sid having count(1) >= 2;
#count(n)n代表列数
#select sc.sid,avg(sc.score),sc.cid,c.cname from sc,course c,teacher t where sc.cid=c.cid and c.tid=t.tid and tname like '吕%'

#select * from student where sid not in(select stu.sid from student stu,course c,sc s,teacher t where stu.sid=s.sid and s.cid=c.cid and c.tid=t.tid and tname like '吕%');

#update sc set score=a.sco on
#(select sc.sid,sc.score from sc,course c,teacher t where sc.cid=c.cid and c.tid=t.tid and tname like '吕%') a 
#where sc.id in(t);



