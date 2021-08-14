/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2021-01-14 12:09:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `co_id` int(11) NOT NULL auto_increment,
  `course` varchar(20) NOT NULL,
  `credit` int(11) NOT NULL,
  `tea_id` int(11) NOT NULL,
  `co_time` varchar(255) NOT NULL,
  `number` int(11) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY  (`co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '数据库原理及应用', '3', '4', '星期一1-2节', '120', '1');
INSERT INTO `course` VALUES ('2', '计算机操作系统', '3', '4', '星期三1-2节', '77', '1');
INSERT INTO `course` VALUES ('3', '网站设计', '2', '8', '星期二3-5节', '56', '1');
INSERT INTO `course` VALUES ('4', 'UI界面设计', '3', '3', '星期一3-5节', '57', '1');
INSERT INTO `course` VALUES ('6', 'web编程技术', '3', '1', '星期五12-14节', '119', '1');
INSERT INTO `course` VALUES ('7', 'Javascript编程技术', '2', '2', '星期一1-3节', '100', '1');
INSERT INTO `course` VALUES ('8', '计算机组成原理', '3', '5', '星期二1-2节', '119', '1');
INSERT INTO `course` VALUES ('10', '离散数学', '4', '6', '星期四1-2节', '120', '1');
INSERT INTO `course` VALUES ('11', '高等数学', '4', '7', '星期三3-5节', '99', '1');
INSERT INTO `course` VALUES ('14', '软件工程', '4', '4', '星期三1-2节', '120', '1');
INSERT INTO `course` VALUES ('16', 'Linux系统', '4', '4', '星期一1-2节', '100', '1');
INSERT INTO `course` VALUES ('18', '线性代数', '3', '2', '星期三1-2节', '99', '1');
INSERT INTO `course` VALUES ('19', '计算机操作系统', '3', '2', '星期五1-2节', '100', '1');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `st_id` int(11) NOT NULL auto_increment,
  `account` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `xuehao` varchar(20) NOT NULL,
  `majory` varchar(20) NOT NULL,
  `colleage` varchar(20) NOT NULL,
  `nianji` varchar(20) default NULL,
  PRIMARY KEY  (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('3', '2222', '小明', '185475466', '计算机科学与技术', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('6', '444', '小程序', '182541234', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('7', '333', '小红', '15845324', '软件工程', '电气与计算机工程学院', '2017');
INSERT INTO `student` VALUES ('8', '6666', '张三', '158457566', '计算机科学与技术', '电气与计算机工程学院', '2016');
INSERT INTO `student` VALUES ('9', '7777', '李四', '154784122', '计算机科学与技术', '电气与计算机工程学院', '2017');
INSERT INTO `student` VALUES ('14', '9999', '陈皮', '182017433', '软件工程', '电气与计算机工程学院', '2019');
INSERT INTO `student` VALUES ('15', '123', '小程', '154784562', '计算机科学与技术', '电气与计算机工程学院', '2017');
INSERT INTO `student` VALUES ('16', '233', '小黄', '182017433', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('17', '322', '王五', '154784566', '计算机科学与技术', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('18', '1314', '赵六', '154784561', '计算机科学与技术', '电气与计算机工程学院', '2019');
INSERT INTO `student` VALUES ('19', '4321', '橙皮', '185421477', '软件工程', '电气与计算机工程学院', '2019');
INSERT INTO `student` VALUES ('20', '5555', '小张', '182017455', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('21', '66666', '黄佳浩', '182017433', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('22', '999', '卢锦涛', '15845321', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('24', '111', '李坤杭', '15845322', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('25', '888', '龙朝枫', '15845323', '软件工程', '电气与计算机工程学院', '2018');
INSERT INTO `student` VALUES ('26', '567', '章三', '158453231', '计算机科学与技术', '电气与计算机工程学院', '2017');
INSERT INTO `student` VALUES ('27', '765', '章四', '1584532412', '软件工程', '电气与计算机工程学院', '2018');

-- ----------------------------
-- Table structure for st_course
-- ----------------------------
DROP TABLE IF EXISTS `st_course`;
CREATE TABLE `st_course` (
  `id` int(11) NOT NULL auto_increment,
  `account` varchar(20) NOT NULL,
  `co_id` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_course
-- ----------------------------
INSERT INTO `st_course` VALUES ('3', '123', '6');
INSERT INTO `st_course` VALUES ('4', '123', '7');
INSERT INTO `st_course` VALUES ('5', '6666', '1');
INSERT INTO `st_course` VALUES ('6', '123', '3');
INSERT INTO `st_course` VALUES ('7', '6666', '11');
INSERT INTO `st_course` VALUES ('8', '123', '11');
INSERT INTO `st_course` VALUES ('9', '123', '10');
INSERT INTO `st_course` VALUES ('10', '2222', '2');
INSERT INTO `st_course` VALUES ('11', '2222', '1');
INSERT INTO `st_course` VALUES ('12', '2222', '6');
INSERT INTO `st_course` VALUES ('13', '2222', '4');
INSERT INTO `st_course` VALUES ('14', '233', '1');
INSERT INTO `st_course` VALUES ('15', '233', '2');
INSERT INTO `st_course` VALUES ('16', '322', '1');
INSERT INTO `st_course` VALUES ('17', '322', '2');
INSERT INTO `st_course` VALUES ('18', '1314', '1');
INSERT INTO `st_course` VALUES ('19', '1314', '14');
INSERT INTO `st_course` VALUES ('20', '1314', '2');
INSERT INTO `st_course` VALUES ('23', '4321', '1');
INSERT INTO `st_course` VALUES ('37', '5555', '8');
INSERT INTO `st_course` VALUES ('38', '123', '14');
INSERT INTO `st_course` VALUES ('39', '123', '8');
INSERT INTO `st_course` VALUES ('41', '66666', '2');
INSERT INTO `st_course` VALUES ('43', '66666', '6');
INSERT INTO `st_course` VALUES ('44', '66666', '3');
INSERT INTO `st_course` VALUES ('45', '123', '2');
INSERT INTO `st_course` VALUES ('46', '123', '16');
INSERT INTO `st_course` VALUES ('47', '123', '1');
INSERT INTO `st_course` VALUES ('48', '6666', '3');
INSERT INTO `st_course` VALUES ('49', '6666', '2');
INSERT INTO `st_course` VALUES ('54', '111', '2');
INSERT INTO `st_course` VALUES ('55', '111', '1');
INSERT INTO `st_course` VALUES ('56', '111', '3');
INSERT INTO `st_course` VALUES ('58', '888', '2');
INSERT INTO `st_course` VALUES ('59', '888', '4');
INSERT INTO `st_course` VALUES ('60', '888', '1');
INSERT INTO `st_course` VALUES ('62', '567', '1');
INSERT INTO `st_course` VALUES ('64', '765', '3');
INSERT INTO `st_course` VALUES ('65', '765', '4');
INSERT INTO `st_course` VALUES ('66', '765', '1');
INSERT INTO `st_course` VALUES ('67', '765', '18');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `te_id` int(11) NOT NULL auto_increment,
  `te_name` varchar(20) NOT NULL,
  `pa` varchar(20) NOT NULL,
  `college` varchar(20) NOT NULL,
  `position` varchar(20) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY  (`te_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '温老师', '123', '电气与计算机工程学院', '教授', '1');
INSERT INTO `teacher` VALUES ('2', '何老师', '123', '电气与计算机工程学院', '讲师', '1');
INSERT INTO `teacher` VALUES ('3', '高老师', '789', '电气与计算机工程学院', '教授', '1');
INSERT INTO `teacher` VALUES ('4', '赵老师', '258', '电气与计算机工程学院', '副教授', '1');
INSERT INTO `teacher` VALUES ('5', '张老师', '123', '电气与计算机工程学院', '助教', '1');
INSERT INTO `teacher` VALUES ('6', '李老师', '123', '电气与计算机工程学院', '讲师', '1');
INSERT INTO `teacher` VALUES ('7', '袁老师', '123', '电气与计算机工程学院', '教授', '1');
INSERT INTO `teacher` VALUES ('8', '黄老师', '123', '电气与计算机工程学院', '副教授', '1');
INSERT INTO `teacher` VALUES ('9', '林老师', '123', '电气与计算机工程学院', '讲师', '1');
INSERT INTO `teacher` VALUES ('10', '欧阳老师', '123', '电气与计算机工程学院', '教授', '1');
INSERT INTO `teacher` VALUES ('11', '李四', '123', '电气与计算机工程学院', '教授', '1');
INSERT INTO `teacher` VALUES ('12', '赵三老师', '123', '电气与计算机工程学院', '教授', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '666', '666', '0');
INSERT INTO `user` VALUES ('3', '999', '999', '0');
INSERT INTO `user` VALUES ('4', '000', '000', '0');
INSERT INTO `user` VALUES ('5', '777', '777', '0');
INSERT INTO `user` VALUES ('6', '333', '333', '0');
INSERT INTO `user` VALUES ('7', '222', '222', '0');
INSERT INTO `user` VALUES ('9', '123', '123', '0');
INSERT INTO `user` VALUES ('10', '444', '444', '0');
INSERT INTO `user` VALUES ('11', '555', '555', '0');
INSERT INTO `user` VALUES ('12', '555', '555', '0');
INSERT INTO `user` VALUES ('13', '456', '456', '0');
INSERT INTO `user` VALUES ('14', '6666', '6666', '0');
INSERT INTO `user` VALUES ('15', '4444', '4444', '0');
INSERT INTO `user` VALUES ('16', '5555', '5555', '0');
INSERT INTO `user` VALUES ('17', '2222', '2222', '0');
INSERT INTO `user` VALUES ('18', '7777', '7777', '0');
INSERT INTO `user` VALUES ('19', '88888', '88888', '0');
INSERT INTO `user` VALUES ('20', '9999', '9999', '0');
INSERT INTO `user` VALUES ('21', '233', '233', '0');
INSERT INTO `user` VALUES ('22', '322', '322', '0');
INSERT INTO `user` VALUES ('23', '1314', '1314', '0');
INSERT INTO `user` VALUES ('24', '4321', '4321', '0');
INSERT INTO `user` VALUES ('25', '55555', '55555', '0');
INSERT INTO `user` VALUES ('26', '66666', '66666', '0');
INSERT INTO `user` VALUES ('27', 'admin', 'admin', '1');
INSERT INTO `user` VALUES ('29', '111', '111', '0');
INSERT INTO `user` VALUES ('30', '888', '888', '0');
INSERT INTO `user` VALUES ('31', '567', '567', '0');
INSERT INTO `user` VALUES ('32', '765', '765', '0');

-- ----------------------------
-- View structure for full_course
-- ----------------------------
DROP VIEW IF EXISTS `full_course`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `full_course` AS select `course`.`co_id` AS `co_id`,`course`.`credit` AS `credit`,`course`.`course` AS `course`,`course`.`co_time` AS `co_time`,`course`.`number` AS `number`,`teacher`.`te_name` AS `te_name`,`teacher`.`te_id` AS `te_id`,`course`.`flag` AS `flag` from (`course` join `teacher` on((`course`.`tea_id` = `teacher`.`te_id`))) ;

-- ----------------------------
-- View structure for st_full_course
-- ----------------------------
DROP VIEW IF EXISTS `st_full_course`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `st_full_course` AS select `teacher`.`te_name` AS `te_name`,`course`.`course` AS `course`,`course`.`credit` AS `credit`,`course`.`co_time` AS `co_time`,`st_course`.`account` AS `account`,`course`.`co_id` AS `co_id`,`course`.`flag` AS `flag` from ((`teacher` join `course`) join `st_course`) where ((`teacher`.`te_id` = `course`.`tea_id`) and (`st_course`.`co_id` = `course`.`co_id`)) ;
DROP TRIGGER IF EXISTS `intrigger`;
DELIMITER ;;
CREATE TRIGGER `intrigger` AFTER INSERT ON `st_course` FOR EACH ROW 
 
update course set number=number-1 where course.co_id=new.co_id
;;
DELIMITER ;
