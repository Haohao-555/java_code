/*
Navicat MySQL Data Transfer

Source Server         : Mysql.1
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : qjxt

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2020-02-11 13:01:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL auto_increment,
  `Adminname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '小熊', '666');

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `id` int(11) NOT NULL auto_increment,
  `ctime` timestamp NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `title` varchar(20) NOT NULL,
  `detail` text NOT NULL,
  `publishername` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('1', '2019-06-21 13:15:50', '考试时间', '星期三12-13', '老师');
INSERT INTO `announcement` VALUES ('2', '2019-06-21 13:16:28', '放假时间', '7月10号', '老师');
INSERT INTO `announcement` VALUES ('3', '2019-06-23 16:29:15', '哈哈', '呵呵', '粑粑');
INSERT INTO `announcement` VALUES ('4', '2019-06-23 16:39:53', '你说啥', '呵呵', '老师');
INSERT INTO `announcement` VALUES ('5', '2019-06-23 16:42:47', '你是谁', '你爸', '管理员');
INSERT INTO `announcement` VALUES ('6', '2019-06-23 18:29:54', '放假啦', '不可能', '老师');
INSERT INTO `announcement` VALUES ('7', '2019-06-23 18:30:37', '测试', '还行', '老师');
INSERT INTO `announcement` VALUES ('8', '2019-06-23 18:40:07', '成绩', '小明  100\n小花  50\n小绿  80', '老师');
INSERT INTO `announcement` VALUES ('9', '2019-06-24 14:08:20', '几号', '27号', '管理员1');
INSERT INTO `announcement` VALUES ('10', '2019-06-24 14:09:38', '哈哈', '呵呵呵', '老师1');
INSERT INTO `announcement` VALUES ('11', '2019-06-24 14:19:34', '哈哈好', '女孩', '管理员2');
INSERT INTO `announcement` VALUES ('12', '2019-06-24 23:19:32', '小黄', '小小', '小熊');
INSERT INTO `announcement` VALUES ('13', '2019-06-26 11:18:21', '我是谁', '你爸', '哈哈');
INSERT INTO `announcement` VALUES ('14', '2019-06-26 11:30:50', '哈哈哈和', '123', '123');
INSERT INTO `announcement` VALUES ('15', '2019-06-26 11:34:34', '你你你', '呜呜呜', '问问');
INSERT INTO `announcement` VALUES ('16', '2019-06-26 11:46:06', '小小花请假', '哈哈哈哈', '管理员6666');
INSERT INTO `announcement` VALUES ('17', '2019-06-26 11:50:53', '半半', '爸爸', '哈哈');
INSERT INTO `announcement` VALUES ('18', '2019-06-26 15:08:25', '很好奇', '好奇', '花花');
INSERT INTO `announcement` VALUES ('19', '2019-06-27 10:51:58', '123', '123', '123');
INSERT INTO `announcement` VALUES ('20', '2019-07-11 21:09:44', '社会主义核心价值观', '我爱中国', '黄佳曼');
INSERT INTO `announcement` VALUES ('21', '2019-10-08 12:56:38', '123', '123', '123');
INSERT INTO `announcement` VALUES ('22', '2019-10-08 12:57:04', '345', '345', '345');

-- ----------------------------
-- Table structure for request
-- ----------------------------
DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `id` int(11) NOT NULL auto_increment,
  `ctime` timestamp NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `studentname` varchar(20) NOT NULL,
  `teachername` varchar(20) NOT NULL,
  `coursename` varchar(20) NOT NULL,
  `coursetime` varchar(30) NOT NULL,
  `requestbecause` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of request
-- ----------------------------
INSERT INTO `request` VALUES ('1', '2019-06-23 17:50:33', '小明', '小陈', 'Java', '星期三12-13', '生病');
INSERT INTO `request` VALUES ('2', '2019-06-23 18:33:46', '小花', '小黄', '体育', '星期五1-2', '受伤');
INSERT INTO `request` VALUES ('3', '2019-06-23 18:38:15', '小明', '小陈', 'Java', '星期三12-13', '有事');
INSERT INTO `request` VALUES ('4', '2019-06-24 14:04:30', '哈哈', '小陈', 'Java', '星期三12-13', '你猜');
INSERT INTO `request` VALUES ('5', '2019-06-24 14:07:41', '哈哈', '小陈', 'Java', '星期三12-13', '哈哈');
INSERT INTO `request` VALUES ('6', '2019-06-24 14:15:27', '小歌', '小陈', 'Java', '星期三12-13', 'hh');
INSERT INTO `request` VALUES ('7', '2019-06-24 14:18:40', '小黄黄', '小陈', 'Java', '星期三12-13', 'kk');
INSERT INTO `request` VALUES ('8', '2019-06-24 23:17:00', '小明', '小陈', 'Java', '星期三12-13', '哈哈哈哈哈哈');
INSERT INTO `request` VALUES ('9', '2019-06-26 11:14:29', '小小明', '小陈', 'Java', '星期三12-13', '哈哈哈');
INSERT INTO `request` VALUES ('10', '2019-06-26 11:32:34', '你是谁', '小陈', 'Java', '星期三12-13', '视频');
INSERT INTO `request` VALUES ('11', '2019-06-26 11:32:48', '你是谁', '小陈', 'Java', '星期三12-13', '视频');
INSERT INTO `request` VALUES ('12', '2019-06-26 11:35:49', '小黄', '小陈', 'Java', '星期三12-13', '生病');
INSERT INTO `request` VALUES ('13', '2019-06-26 11:36:10', '小黄', '小陈', 'Java', '星期三12-13', '生病');
INSERT INTO `request` VALUES ('14', '2019-06-26 11:45:18', '小小花', '小陈', 'Java', '星期三12-13', '哈哈哈哈哈哈哈哈哈哈或或或或');
INSERT INTO `request` VALUES ('15', '2019-06-26 11:50:09', '小明', '小陈', 'Java', '星期三12-13', '生病啦');
INSERT INTO `request` VALUES ('16', '2019-06-26 15:03:46', '小明', '小陈', 'Java', '星期三12-13', '生病');
INSERT INTO `request` VALUES ('17', '2019-06-27 10:51:32', '小小', '小陈', 'Java', '星期三12-13', '生病生病');
INSERT INTO `request` VALUES ('18', '2019-07-11 21:07:06', '黄佳曼', '小陈', 'Java', '星期三12-13', '生病身边');
INSERT INTO `request` VALUES ('19', '2019-09-28 19:28:12', '小小', '小陈', 'Java', '星期三12-13', '哈哈哈哈哈哈哈哈爱好哈哈啊好啊');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL auto_increment,
  `number` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`,`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '555555', '小明', '123');
INSERT INTO `student` VALUES ('2', '34567', '小红', '145');
INSERT INTO `student` VALUES ('3', '12467', '小吕', '456');
INSERT INTO `student` VALUES ('4', '14576', '小绿', '567');
INSERT INTO `student` VALUES ('5', '12356', '小橙', '908');
INSERT INTO `student` VALUES ('6', '1235', '小兰', '789');
INSERT INTO `student` VALUES ('7', '13467', '哈哈', '654');
INSERT INTO `student` VALUES ('8', '12389', '小花', '123');
INSERT INTO `student` VALUES ('9', '4890', '小黄', '678');
INSERT INTO `student` VALUES ('10', '1256', '花花', '345');
INSERT INTO `student` VALUES ('11', '123', '小小', '123');
INSERT INTO `student` VALUES ('12', '156', '小歌', '123');
INSERT INTO `student` VALUES ('13', '123', '小黄黄', '124');
INSERT INTO `student` VALUES ('14', '134', '小明明', '345');
INSERT INTO `student` VALUES ('15', '123', '小黄黄', '456');
INSERT INTO `student` VALUES ('16', '123', '小黄下', '123');
INSERT INTO `student` VALUES ('17', '123', '小小小', '123');
INSERT INTO `student` VALUES ('18', '123', '小小花', '124');
INSERT INTO `student` VALUES ('19', '123', '小明', '123');
INSERT INTO `student` VALUES ('20', '145', '小黄', '345');
INSERT INTO `student` VALUES ('21', '444', '小小', '567');
INSERT INTO `student` VALUES ('22', '123', '小小', '123');
INSERT INTO `student` VALUES ('23', '123', '小小', '123');
INSERT INTO `student` VALUES ('24', '0814', '黄小伟', '010616');
INSERT INTO `student` VALUES ('25', '182017433', '小小', '123');
INSERT INTO `student` VALUES ('26', '123', '123', '123');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL auto_increment,
  `teachername` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `course` varchar(20) NOT NULL,
  `coursetime` varchar(20) NOT NULL,
  `coursesite` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '小陈', '123', 'java', '星期三12-13', '2实206');
INSERT INTO `teacher` VALUES ('2', '小黄', '456', '体育', '星期五1-2', '东区体育场');
