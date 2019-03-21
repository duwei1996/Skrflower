/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : skrflower

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-03-21 14:45:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `destination`
-- ----------------------------
DROP TABLE IF EXISTS `destination`;
CREATE TABLE `destination` (
  `dest_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dest_name` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  `region_num` int(11) NOT NULL,
  PRIMARY KEY (`dest_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of destination
-- ----------------------------

-- ----------------------------
-- Table structure for `guideline`
-- ----------------------------
DROP TABLE IF EXISTS `guideline`;
CREATE TABLE `guideline` (
  `guideline_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `guideline_name` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `type` varchar(255) NOT NULL,
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
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_comment
-- ----------------------------

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
  `alive` bit(1) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
