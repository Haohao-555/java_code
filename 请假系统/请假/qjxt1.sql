/*
Navicat MySQL Data Transfer

Source Server         : Mysql.1
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : qjxt1

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2020-02-11 13:01:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `pw` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1', '1');
INSERT INTO `admin` VALUES ('2', '2', '2');

-- ----------------------------
-- Table structure for request
-- ----------------------------
DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `id` int(11) NOT NULL auto_increment,
  `student` varchar(20) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  `course` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  `because` varchar(20) NOT NULL,
  `requesttime` varchar(20) NOT NULL,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `situations` varchar(20) NOT NULL,
  `number` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of request
-- ----------------------------
INSERT INTO `request` VALUES ('1', '学生1', '老师1', '程序设计', '星期五12-13', '生病', '一天', '2019-10-02 15:41:44', '已批准', '182017433');
INSERT INTO `request` VALUES ('2', '学生2', '老师2', '计算机组成原理', '星期三10-12', '发烧', '两天', '2019-10-03 13:27:03', '已驳回', '182017455');
INSERT INTO `request` VALUES ('3', '学生3', '老师1', '程序设计', '星期五12-13', '牙痛', '三天', '2019-10-08 12:50:24', '已驳回', '182017488');
INSERT INTO `request` VALUES ('4', '小明', '老师2', '计算机组成原理', '星期三12-13', '生病', '两天', '2019-10-03 21:21:30', '已批准', '182017450');
INSERT INTO `request` VALUES ('5', 'jj', 'jj', '12', '12', 'oo', '1', '2019-10-06 16:02:10', '已批准', '1234');
INSERT INTO `request` VALUES ('6', '小小', '老师2', '计算机组成原理', '星期三10-12', '生病', '两天', '2019-10-04 11:31:11', '已批准', '182017562');
INSERT INTO `request` VALUES ('7', '123', '123', '123', '123', '123', '123', '2019-10-08 12:50:07', '已批准', '123');
INSERT INTO `request` VALUES ('8', '123', '456', '456', '456', '456', '456', '2019-10-08 12:58:34', '未审批', '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `type` varchar(1) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `number` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '0', '学生1', '123', '182017433');
INSERT INTO `user` VALUES ('2', '0', '学生2', '124', '182017455');
INSERT INTO `user` VALUES ('3', '1', '老师1', '125', null);
INSERT INTO `user` VALUES ('4', '1', '老师2', '126', null);
INSERT INTO `user` VALUES ('5', '2', '辅导员1', '127', null);
INSERT INTO `user` VALUES ('6', '2', '辅导员2', '128', null);
INSERT INTO `user` VALUES ('7', '0', '小明', '345', '182017450');
INSERT INTO `user` VALUES ('8', '0', '小红', '789', '182017465');
INSERT INTO `user` VALUES ('9', '0', 'jj', '123', '1234');
INSERT INTO `user` VALUES ('10', '0', '小小', '890', '182017562');
INSERT INTO `user` VALUES ('11', '0', '123', '123', '123');
