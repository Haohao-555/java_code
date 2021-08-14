/*
Navicat MySQL Data Transfer

Source Server         : Mysql.1
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : studentsystem

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2020-02-11 13:02:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL auto_increment,
  `admin` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '小黄', '123');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL auto_increment,
  `course` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  `credit` int(2) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'Java程序设计', '星期三12-13', '温泉思', '4');
INSERT INTO `course` VALUES ('2', '计算机事件基础', '星期一1-2', '张鉴新', '1');
INSERT INTO `course` VALUES ('3', '国情与国史', '星期三9-10', '张锦标', '1');
INSERT INTO `course` VALUES ('4', '心理辅导', '星期四12-13', '李小红', '2');
INSERT INTO `course` VALUES ('5', '计算机导论课', '星期五8-10', '陈海山', '3');

-- ----------------------------
-- Table structure for gg
-- ----------------------------
DROP TABLE IF EXISTS `gg`;
CREATE TABLE `gg` (
  `id` int(11) NOT NULL auto_increment,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `detail` text NOT NULL,
  `title` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`,`ctime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gg
-- ----------------------------
INSERT INTO `gg` VALUES ('2', '2019-07-12 13:20:20', '12号', '放假时间', '老师');
INSERT INTO `gg` VALUES ('3', '2019-07-20 14:48:12', '成功', '测试', '温泉思');

-- ----------------------------
-- Table structure for gpa
-- ----------------------------
DROP TABLE IF EXISTS `gpa`;
CREATE TABLE `gpa` (
  `id` int(11) NOT NULL auto_increment,
  `student` varchar(20) NOT NULL,
  `average` varchar(20) NOT NULL,
  `gpa` varchar(10) NOT NULL,
  PRIMARY KEY  (`id`,`student`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gpa
-- ----------------------------

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL auto_increment,
  `student` varchar(20) NOT NULL,
  `grade` varchar(20) NOT NULL,
  `course` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`,`student`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '小明', '90.5', 'Java程序设计');
INSERT INTO `grade` VALUES ('2', '小红', '60.5', 'Java程序设计');

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` int(20) NOT NULL auto_increment,
  `course` varchar(20) NOT NULL,
  `payment` varchar(20) NOT NULL,
  `credit` varchar(1) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES ('1', 'Java程序设计', '1200', '4');
INSERT INTO `payment` VALUES ('2', '计算机实践基础', '300', '1');
INSERT INTO `payment` VALUES ('3', '国情与国史', '200', '1');

-- ----------------------------
-- Table structure for request
-- ----------------------------
DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `id` int(11) NOT NULL auto_increment,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `teacher` varchar(20) NOT NULL,
  `student` varchar(20) NOT NULL,
  `course` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  `because` varchar(20) NOT NULL,
  `conditions` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of request
-- ----------------------------
INSERT INTO `request` VALUES ('1', '2019-07-24 11:51:37', '陈海山', '黄佳浩', '计算机导论课', '星期五8-10', '生病', '不同意');
INSERT INTO `request` VALUES ('3', '2019-07-21 12:15:20', '张锦标', '黄佳浩', '国情与国史', '星期三9-10', '生病请假3天', '请等待审批');
INSERT INTO `request` VALUES ('4', '2019-07-21 13:31:58', '温泉思', '小明', 'Java程序设计', '星期三12-13', '哈哈', '不同意');
INSERT INTO `request` VALUES ('5', '2019-07-21 12:15:16', '陈海山', '小明', '计算机导论课', '星期五8-10', '生病哈哈哈哈', '请等待审批');
INSERT INTO `request` VALUES ('6', '2019-07-21 12:15:14', '李小红', '小明', '心理辅导', '星期四12-13', '生病', '请等待审批');
INSERT INTO `request` VALUES ('7', '2019-07-21 12:14:45', '温泉思', '小红', 'Java程序设计', '星期三12-13', '生病', '请等待审批');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(20) NOT NULL auto_increment,
  `name` varchar(20) NOT NULL,
  `number` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '小明', '182017433');
INSERT INTO `student` VALUES ('2', '小红', '182017420');
INSERT INTO `student` VALUES ('3', '黄佳浩', '182017455');
INSERT INTO `student` VALUES ('4', '哈哈', '182017420');
INSERT INTO `student` VALUES ('5', '呵呵', '182017456');
INSERT INTO `student` VALUES ('6', '小黄', '15012360');
INSERT INTO `student` VALUES ('7', '胡一虎', '52013652');
INSERT INTO `student` VALUES ('8', '洪涛', '152013954');
INSERT INTO `student` VALUES ('9', '刘德华', '15201450');
INSERT INTO `student` VALUES ('10', '张德花', '152013964');
INSERT INTO `student` VALUES ('11', '黄的花', '15201369');
INSERT INTO `student` VALUES ('13', '小佳', '182017456');
INSERT INTO `student` VALUES ('14', '小号', '182017789');

-- ----------------------------
-- Table structure for studentcourse
-- ----------------------------
DROP TABLE IF EXISTS `studentcourse`;
CREATE TABLE `studentcourse` (
  `id` int(11) NOT NULL auto_increment,
  `number` varchar(255) NOT NULL,
  `course` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  `student` varchar(20) NOT NULL,
  `grade` varchar(20) default NULL,
  `credit` int(20) NOT NULL,
  `fee` int(20) default NULL,
  `feecondition` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentcourse
-- ----------------------------
INSERT INTO `studentcourse` VALUES ('1', '182017433', 'Java程序设计', '星期三12-13', '温泉思', '小明', '50', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('2', '182017433', '国情与国史', '星期三9-10', '张锦标', '小明', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('3', '182017433', '心理辅导', '星期四12-13', '李小红', '小明', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('4', '182017420', 'Java程序设计', '星期三12-13', '温泉思', '小红', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('5', '182017420', '国情与国史', '星期三9-10', '张锦标', '小红', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('6', '182017420', '心理辅导', '星期四12-13', '李小红', '小红', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('7', '182017420', 'Java程序设计', '星期三12-13', '温泉思', '哈哈', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('8', '182017420', '计算机事件基础', '星期一1-2', '张鉴新', '哈哈', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('9', '182017420', '心理辅导', '星期四12-13', '李小红', '哈哈', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('10', '182017456', '计算机事件基础', '星期一1-2', '张鉴新', '呵呵', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('11', '182017456', '国情与国史', '星期三9-10', '张锦标', '呵呵', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('12', '182017456', '心理辅导', '星期四12-13', '李小红', '呵呵', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('13', '15012360', 'Java程序设计', '星期三12-13', '温泉思', '小黄', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('14', '15012360', '国情与国史', '星期三9-10', '张锦标', '小黄', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('15', '15012360', '心理辅导', '星期四12-13', '李小红', '小黄', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('16', '52013652', '计算机事件基础', '星期一1-2', '张鉴新', '胡一虎', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('17', '52013652', '国情与国史', '星期三9-10', '张锦标', '胡一虎', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('18', '52013652', 'Java程序设计', '星期三12-13', '温泉思', '胡一虎', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('19', '152013954', 'Java程序设计', '星期三12-13', '温泉思', '洪涛', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('20', '152013954', '国情与国史', '星期三9-10', '张锦标', '洪涛', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('21', '152013954', '计算机事件基础', '星期一1-2', '张鉴新', '洪涛', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('22', '15201450', '计算机事件基础', '星期一1-2', '张鉴新', '刘德华', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('23', '15201450', '国情与国史', '星期三9-10', '张锦标', '刘德华', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('24', '15201450', 'Java程序设计', '星期三12-13', '温泉思', '刘德华', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('25', '152013964', 'Java程序设计', '星期三12-13', '温泉思', '张德花', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('26', '152013964', '心理辅导', '星期四12-13', '李小红', '张德花', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('27', '152013964', '计算机事件基础', '星期一1-2', '张鉴新', '张德花', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('28', '15201369', 'Java程序设计', '星期三12-13', '温泉思', '黄的花', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('29', '15201369', '计算机事件基础', '星期一1-2', '张鉴新', '黄的花', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('30', '15201369', '心理辅导', '星期四12-13', '李小红', '黄的花', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('31', '182017456', '计算机事件基础', '星期一1-2', '张鉴新', '小佳', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('32', '182017456', '国情与国史', '星期三9-10', '张锦标', '小佳', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('33', '182017456', '心理辅导', '星期四12-13', '李小红', '小佳', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('34', '182017789', '计算机事件基础', '星期一1-2', '张鉴新', '小号', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('36', '182017789', '心理辅导', '星期四12-13', '李小红', '小号', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('37', '182017456', '计算机导论课', '星期五8-10', '陈海山', '小佳', '0.0', '3', '1620', '未交费');
INSERT INTO `studentcourse` VALUES ('38', '182017455', 'Java程序设计', '星期三12-13', '温泉思', '黄佳浩', '0.0', '4', '2160', '未交费');
INSERT INTO `studentcourse` VALUES ('39', '182017455', '国情与国史', '星期三9-10', '张锦标', '黄佳浩', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('40', '182017455', '心理辅导', '星期四12-13', '李小红', '黄佳浩', '0.0', '2', '1080', '未交费');
INSERT INTO `studentcourse` VALUES ('41', '182017433', '计算机导论课', '星期五8-10', '陈海山', '小明', '0.0', '3', '1620', '未交费');
INSERT INTO `studentcourse` VALUES ('42', '182017455', '计算机事件基础', '星期一1-2', '张鉴新', '黄佳浩', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('43', '182017455', '计算机导论课', '星期五8-10', '陈海山', '黄佳浩', '0.0', '3', '1620', '未交费');
INSERT INTO `studentcourse` VALUES ('44', '182017433', '计算机事件基础', '星期一1-2', '张鉴新', '小明', '0.0', '1', '540', '未交费');
INSERT INTO `studentcourse` VALUES ('45', '52013652', '心理辅导', '星期四12-13', '李小红', '胡一虎', null, '2', '1080', '未交费');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL auto_increment,
  `course` varchar(20) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', 'Java程序设计', '温泉思', '666666', '星期三12-13');
INSERT INTO `teacher` VALUES ('2', '计算机实践基础', '张鉴新', '555555', '星期一1-2');
INSERT INTO `teacher` VALUES ('3', '国情与国史', '张锦标', '444444', '星期三9-10');
