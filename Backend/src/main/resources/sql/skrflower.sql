/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : skrflower

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-03-26 16:54:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `destination`
-- ----------------------------
DROP TABLE IF EXISTS `destination`;
CREATE TABLE `destination` (
  `dest_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dest_name` varchar(255) NOT NULL,
  `c_id` int(11) NOT NULL COMMENT '分类id',
  `region_num` int(11) NOT NULL,
  PRIMARY KEY (`dest_id`)
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
  `guideline_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `guideline_name` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `c_id` int(11) NOT NULL COMMENT '分类id',
  PRIMARY KEY (`guideline_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guideline
-- ----------------------------

-- ----------------------------
-- Table structure for `guideline_comment`
-- ----------------------------
DROP TABLE IF EXISTS `guideline_comment`;
CREATE TABLE `guideline_comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `guideline_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guideline_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel`
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `hotel_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  `region_num` int(11) NOT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel_comment`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_comment`;
CREATE TABLE `hotel_comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `hotel_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_comment
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
  `room_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `price` double NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `hotel_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------

-- ----------------------------
-- Table structure for `room_comment`
-- ----------------------------
DROP TABLE IF EXISTS `room_comment`;
CREATE TABLE `room_comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`)
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
  `label` varchar(255) DEFAULT NULL,
  `region_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`site_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site
-- ----------------------------

-- ----------------------------
-- Table structure for `site_comment`
-- ----------------------------
DROP TABLE IF EXISTS `site_comment`;
CREATE TABLE `site_comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `site_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`)
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES ('1', '免签');
INSERT INTO `tag` VALUES ('2', '人文历史');
INSERT INTO `tag` VALUES ('3', '拍片圣地');
INSERT INTO `tag` VALUES ('4', '购物');
INSERT INTO `tag` VALUES ('5', '美食');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `passwd` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `alive` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '阿才', '123456', '123456@qq.com', '22', '男', '');
INSERT INTO `user` VALUES ('2', '小李', '123', '123@qq.com', '24', '男', '');
