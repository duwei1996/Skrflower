/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : skrflower

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-03-28 10:15:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `destination`
-- ----------------------------
DROP TABLE IF EXISTS `destination`;
CREATE TABLE `destination` (
  `d_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `d_name` varchar(255) NOT NULL,
  `c_id` int(11) NOT NULL COMMENT '分类id',
  `region_num` int(11) NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of destination
-- ----------------------------
INSERT INTO `destination` VALUES ('1', '北京', '1', '1');
INSERT INTO `destination` VALUES ('2', '上海', '1', '1');
INSERT INTO `destination` VALUES ('3', '香港', '2', '1');
INSERT INTO `destination` VALUES ('4', '东京', '3', '2');

-- ----------------------------
-- Table structure for `dest_category`
-- ----------------------------
DROP TABLE IF EXISTS `dest_category`;
CREATE TABLE `dest_category` (
  `c_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dest_category
-- ----------------------------
INSERT INTO `dest_category` VALUES ('1', '国内');
INSERT INTO `dest_category` VALUES ('2', '港澳台');
INSERT INTO `dest_category` VALUES ('3', '日本');

-- ----------------------------
-- Table structure for `dest_tag`
-- ----------------------------
DROP TABLE IF EXISTS `dest_tag`;
CREATE TABLE `dest_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `t_id` int(11) NOT NULL COMMENT '标签id',
  `d_id` int(11) NOT NULL COMMENT '目的地id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dest_tag
-- ----------------------------
INSERT INTO `dest_tag` VALUES ('1', '4', '3');
INSERT INTO `dest_tag` VALUES ('2', '5', '3');
INSERT INTO `dest_tag` VALUES ('3', '4', '2');
INSERT INTO `dest_tag` VALUES ('4', '3', '3');

-- ----------------------------
-- Table structure for `guideline`
-- ----------------------------
DROP TABLE IF EXISTS `guideline`;
CREATE TABLE `guideline` (
  `g_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `g_name` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `c_id` int(11) NOT NULL COMMENT '分类id',
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guideline
-- ----------------------------
INSERT INTO `guideline` VALUES ('1', '1', '你好四川！', '第一个攻略', '2019-03-27 12:17:53', '1');
INSERT INTO `guideline` VALUES ('2', '1', '你好北京！', '第二个攻略', '2019-03-27 12:57:11', '1');

-- ----------------------------
-- Table structure for `guideline_comment`
-- ----------------------------
DROP TABLE IF EXISTS `guideline_comment`;
CREATE TABLE `guideline_comment` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `g_id` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guideline_comment
-- ----------------------------
INSERT INTO `guideline_comment` VALUES ('1', '2', '我也去过四川', '2019-03-27 18:50:37', '1');

-- ----------------------------
-- Table structure for `guid_category`
-- ----------------------------
DROP TABLE IF EXISTS `guid_category`;
CREATE TABLE `guid_category` (
  `c_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guid_category
-- ----------------------------
INSERT INTO `guid_category` VALUES ('1', '国内攻略');
INSERT INTO `guid_category` VALUES ('2', '国外攻略');
INSERT INTO `guid_category` VALUES ('3', ' 主题攻略');

-- ----------------------------
-- Table structure for `guid_tag`
-- ----------------------------
DROP TABLE IF EXISTS `guid_tag`;
CREATE TABLE `guid_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `t_id` int(11) NOT NULL COMMENT '标签id',
  `g_id` int(11) NOT NULL COMMENT '攻略id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guid_tag
-- ----------------------------
INSERT INTO `guid_tag` VALUES ('1', '6', '1');

-- ----------------------------
-- Table structure for `hotel`
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `h_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `h_name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(255) NOT NULL,
  `region_num` int(11) NOT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel_category`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_category`;
CREATE TABLE `hotel_category` (
  `c_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_category
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel_comment`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_comment`;
CREATE TABLE `hotel_comment` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `u_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `h_id` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel_tag`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_tag`;
CREATE TABLE `hotel_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `t_id` int(11) NOT NULL COMMENT '酒店标签id',
  `h_id` int(11) NOT NULL COMMENT '酒店id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_tag
-- ----------------------------

-- ----------------------------
-- Table structure for `region`
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `region_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `region_name` varchar(255) NOT NULL,
  `region_num` int(11) NOT NULL,
  `parent_region_num` int(11) NOT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------

-- ----------------------------
-- Table structure for `room`
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `r_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `price` double NOT NULL,
  `type` varchar(255) NOT NULL,
  `capacity` int(11) NOT NULL,
  `h_id` int(11) NOT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------

-- ----------------------------
-- Table structure for `room_comment`
-- ----------------------------
DROP TABLE IF EXISTS `room_comment`;
CREATE TABLE `room_comment` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `u_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `r_id` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `site`
-- ----------------------------
DROP TABLE IF EXISTS `site`;
CREATE TABLE `site` (
  `site_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `site_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `c_id` varchar(255) DEFAULT NULL COMMENT '分类',
  `d_id` int(11) DEFAULT NULL COMMENT '所在目的地id',
  PRIMARY KEY (`site_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site
-- ----------------------------

-- ----------------------------
-- Table structure for `site_category`
-- ----------------------------
DROP TABLE IF EXISTS `site_category`;
CREATE TABLE `site_category` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `site_id` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_category
-- ----------------------------

-- ----------------------------
-- Table structure for `site_comment`
-- ----------------------------
DROP TABLE IF EXISTS `site_comment`;
CREATE TABLE `site_comment` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `u_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `site_id` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `tag`
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `t_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES ('1', '免签');
INSERT INTO `tag` VALUES ('2', '人文历史');
INSERT INTO `tag` VALUES ('3', '拍片圣地');
INSERT INTO `tag` VALUES ('4', '购物');
INSERT INTO `tag` VALUES ('5', '美食');
INSERT INTO `tag` VALUES ('6', '四川');
INSERT INTO `tag` VALUES ('7', ' 云南');
INSERT INTO `tag` VALUES ('8', ' 江苏');
INSERT INTO `tag` VALUES ('9', ' 北京');
INSERT INTO `tag` VALUES ('10', ' 欧洲');
INSERT INTO `tag` VALUES ('11', '东南亚');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `alive` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '阿才', '123456', '123456@qq.com', '22', '男', '');
INSERT INTO `user` VALUES ('2', '小李', '123', '123@qq.com', '24', '男', '');
INSERT INTO `user` VALUES ('3', '柳齐', 'bbb', '123@qq.com', '24', '男', '');
INSERT INTO `user` VALUES ('4', '李桐岩', '123456', '123456@qq.com', '22', '男', '');
