/*
Navicat MySQL Data Transfer

Source Server         : week6
Source Server Version : 50018
Source Host           : 127.0.0.1:3307
Source Database       : gg

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-09-26 16:55:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(255) NOT NULL,
  `pw` varchar(255) default NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1');

-- ----------------------------
-- Table structure for gg
-- ----------------------------
DROP TABLE IF EXISTS `gg`;
CREATE TABLE `gg` (
  `gid` int(11) NOT NULL auto_increment,
  `gtitle` varchar(255) default NULL,
  `gdetai` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `gtime` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gg
-- ----------------------------
INSERT INTO `gg` VALUES ('1', '1', '1', '1', '2019-09-26 16:39:33');
INSERT INTO `gg` VALUES ('2', '2', '2', '2', '2019-08-20 16:39:38');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL auto_increment,
  `uname` varchar(255) default NULL,
  `upw` varchar(255) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', '1', '1');
INSERT INTO `user` VALUES ('1002', '1', '2');
