/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : dianbo

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-04-30 21:21:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for collect_song
-- ----------------------------
DROP TABLE IF EXISTS `collect_song`;
CREATE TABLE `collect_song` (
  `username` varchar(255) DEFAULT NULL,
  `songname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_song
-- ----------------------------
INSERT INTO `collect_song` VALUES ('123', '5');
INSERT INTO `collect_song` VALUES ('ljt', 'xsxs');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `songname` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '123213');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '的方式公司的');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '的方式公司的');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '的方式公司的');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '上单飞');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '上单飞');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '上单飞');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '上单飞');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '愚人节规划');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '地方');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '了');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '阿瑟东');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '阿瑟东阿瑟东');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '1223');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '123');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '阿瑟东');
INSERT INTO `comment` VALUES ('杀杀杀', 'youke', '阿瑟东');
INSERT INTO `comment` VALUES ('杀杀杀', '123', '234 ');
INSERT INTO `comment` VALUES ('234', '123', '前稳');
INSERT INTO `comment` VALUES ('234', '123', '前稳我去饿我去而我却');
INSERT INTO `comment` VALUES ('234', '123', '前稳我去饿我去而我却');
INSERT INTO `comment` VALUES ('234', '123', '前稳我去饿我去而我却');
INSERT INTO `comment` VALUES ('234', '123', '前稳我去饿我去而我却');
INSERT INTO `comment` VALUES ('234', '123', '前稳我去饿我去而我却');
INSERT INTO `comment` VALUES ('前稳', 'youke', '微软微软额外认为');
INSERT INTO `comment` VALUES ('前稳', 'youke', '微软微软额外认为werewolf');
INSERT INTO `comment` VALUES ('234', 'youke', '手动阀手动阀');
INSERT INTO `comment` VALUES ('234', 'youke', '手动阀手动阀');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了了，了零秒看了吗\n\n');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了了，了零秒看了吗\n\n');
INSERT INTO `comment` VALUES ('231', 'youke', '了，了；了了，了零秒看了吗\n\n');
INSERT INTO `comment` VALUES ('xsxs', 'ljt', 'xsxs');

-- ----------------------------
-- Table structure for dianzan
-- ----------------------------
DROP TABLE IF EXISTS `dianzan`;
CREATE TABLE `dianzan` (
  `username` varchar(30) DEFAULT NULL,
  `songname` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dianzan
-- ----------------------------
INSERT INTO `dianzan` VALUES ('s', 'd');
INSERT INTO `dianzan` VALUES ('null', '杀杀杀');
INSERT INTO `dianzan` VALUES ('null', '杀杀杀');
INSERT INTO `dianzan` VALUES ('null', '杀杀杀');
INSERT INTO `dianzan` VALUES ('youke', '234');
INSERT INTO `dianzan` VALUES ('youke', '5');
INSERT INTO `dianzan` VALUES ('ljt', 'xsxs');

-- ----------------------------
-- Table structure for song_ready
-- ----------------------------
DROP TABLE IF EXISTS `song_ready`;
CREATE TABLE `song_ready` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `songname` varchar(50) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `theme` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `ifsequence` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song_ready
-- ----------------------------
INSERT INTO `song_ready` VALUES ('1', '2', '5', null, '3', '1');
INSERT INTO `song_ready` VALUES ('2', '23', '4', null, '1998', '1');
INSERT INTO `song_ready` VALUES ('3', '324', '342', null, '1998', '1');
INSERT INTO `song_ready` VALUES ('4', '324', '34', null, '2006', '1');
INSERT INTO `song_ready` VALUES ('5', '34', '34', null, '2005', '1');
INSERT INTO `song_ready` VALUES ('6', '23', '23', null, '1991', '1');
INSERT INTO `song_ready` VALUES ('7', '34', '45', null, '1997', '0');
INSERT INTO `song_ready` VALUES ('8', '34', '45', null, '1997', '0');
INSERT INTO `song_ready` VALUES ('9', '12', '23', null, '2019年04月17日', '1');
INSERT INTO `song_ready` VALUES ('10', '饿', 'eq', null, '2019年04月09日', '1');
INSERT INTO `song_ready` VALUES ('11', '123', '213', '2', '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('12', '杀杀杀', '钱邱琦', '威威', '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('13', '杀杀杀', '钱邱琦', '威威', '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('14', '杀杀杀', '钱邱琦', '威威', '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('15', '34', '45', null, '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('16', '34', '45', null, '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('17', '34', '45', null, '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('18', '34', '45', null, '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('19', '213', '123123', '123', '2019年04月18日', '1');
INSERT INTO `song_ready` VALUES ('20', '1233', '123', '12', '2019年04月25日', '1');
INSERT INTO `song_ready` VALUES ('21', '67', '435', '35', '2019年04月26日', '0');
INSERT INTO `song_ready` VALUES ('22', '234', '435', '35', '2019年04月26日', '1');
INSERT INTO `song_ready` VALUES ('23', '5', '435', '35', '2019年04月26日', '1');
INSERT INTO `song_ready` VALUES ('24', '前稳', '阿瑟东', '阿瑟东', '2019年04月26日', '1');
INSERT INTO `song_ready` VALUES ('25', '', '', '', '单击选择日期', '0');
INSERT INTO `song_ready` VALUES ('26', '231', '123', '234', '2019年04月30日', '1');
INSERT INTO `song_ready` VALUES ('27', '321', '23', '324', '2019年04月30日', '0');
INSERT INTO `song_ready` VALUES ('28', '234', '234', '432', '2019年04月30日', '1');
INSERT INTO `song_ready` VALUES ('29', 'xsxs', 'xsxs', 'xsxs', '2019年04月30日', '1');

-- ----------------------------
-- Table structure for song_upload
-- ----------------------------
DROP TABLE IF EXISTS `song_upload`;
CREATE TABLE `song_upload` (
  `songname` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `theme` varchar(30) NOT NULL,
  `ifpass` int(2) unsigned zerofill DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song_upload
-- ----------------------------
INSERT INTO `song_upload` VALUES ('234', '345', '456', '00');
INSERT INTO `song_upload` VALUES ('435', '546', '567', '01');
INSERT INTO `song_upload` VALUES ('sss', 'sss', 'sss', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('3', '2345', '345', '345');
INSERT INTO `user` VALUES ('5', 'asd', 'asd', 'sdf');
INSERT INTO `user` VALUES ('8', 'ljt', '123456', 'linjiatao');
