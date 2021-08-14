/*
Navicat MySQL Data Transfer

Source Server         : Mysql.1
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : gg

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2020-02-11 13:02:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('adamin', '123');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) default NULL,
  `cid` int(11) NOT NULL auto_increment,
  `detail` text,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `username` varchar(20) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (null, '5', '5', '2019-06-21 13:11:18', '6');

-- ----------------------------
-- Table structure for gg
-- ----------------------------
DROP TABLE IF EXISTS `gg`;
CREATE TABLE `gg` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(50) default NULL,
  `detail` text,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `username` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gg
-- ----------------------------
INSERT INTO `gg` VALUES ('1', '1', '1', '2019-06-02 11:04:38', 'admin');
INSERT INTO `gg` VALUES ('2', '1', '1', '2019-06-02 11:04:46', 'admin');
INSERT INTO `gg` VALUES ('3', '1', '1', '2019-06-02 11:05:03', 'admin');
INSERT INTO `gg` VALUES ('4', '1', '1', '2019-06-02 11:05:07', 'admin');
INSERT INTO `gg` VALUES ('5', '1', '1', '2019-06-02 11:19:01', 'admin');
INSERT INTO `gg` VALUES ('6', '1', '1', '2019-06-02 11:19:02', 'admin');
INSERT INTO `gg` VALUES ('7', '1', '1', '2019-06-02 11:19:03', 'admin');
INSERT INTO `gg` VALUES ('8', '1', '1', '2019-06-02 11:19:12', 'admin');
INSERT INTO `gg` VALUES ('9', '1', '1', '2019-06-02 11:31:12', 'admin');
INSERT INTO `gg` VALUES ('10', 'hhh', '123', '2019-06-05 14:20:07', 'adamin');
INSERT INTO `gg` VALUES ('11', 'hhh', '123', '2019-06-05 14:20:09', 'adamin');

-- ----------------------------
-- Table structure for reply1
-- ----------------------------
DROP TABLE IF EXISTS `reply1`;
CREATE TABLE `reply1` (
  `rid` int(11) default NULL,
  `cid` int(11) NOT NULL auto_increment,
  `datail` text,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `username` varchar(20) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of reply1
-- ----------------------------

-- ----------------------------
-- Table structure for reply2
-- ----------------------------
DROP TABLE IF EXISTS `reply2`;
CREATE TABLE `reply2` (
  `rid1` int(11) default NULL,
  `rid2` int(11) NOT NULL auto_increment,
  `detail` text,
  `ctime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `username` varchar(20) default NULL,
  PRIMARY KEY  (`rid2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of reply2
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '123');
INSERT INTO `user` VALUES ('??', '123');
INSERT INTO `user` VALUES ('xiaoming2', '123098');
INSERT INTO `user` VALUES ('xiaoming3', '123456');
INSERT INTO `user` VALUES ('xiaoming4', '1234578');
INSERT INTO `user` VALUES ('xiaoming5', '1290');
