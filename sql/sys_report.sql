/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : report-data

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 30/10/2021 17:30:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_report
-- ----------------------------
DROP TABLE IF EXISTS `sys_report`;
CREATE TABLE `sys_report` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `browser` varchar(255) DEFAULT NULL,
  `browser_version` varchar(255) DEFAULT NULL,
  `current_domain` varchar(255) DEFAULT NULL,
  `current_url` varchar(255) DEFAULT NULL,
  `data_type` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  `device_os` varchar(255) DEFAULT NULL,
  `device_os_version` varchar(255) DEFAULT NULL,
  `device_platform` varchar(255) DEFAULT NULL,
  `entry_time` datetime DEFAULT NULL,
  `event_name` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `page_open_scene` varchar(255) DEFAULT NULL,
  `parent_url` varchar(255) DEFAULT NULL,
  `persisted_time` datetime DEFAULT NULL,
  `previous_stay_time` int(11) DEFAULT NULL,
  `referrer` varchar(255) DEFAULT NULL,
  `referring_domain` varchar(255) DEFAULT NULL,
  `route_rule` varchar(255) DEFAULT NULL,
  `screen_width` int(11) DEFAULT NULL,
  `screen_height` int(11) DEFAULT NULL,
  `sdk_type` varchar(255) DEFAULT NULL,
  `sdk_version` varchar(255) DEFAULT NULL,
  `session_uuid` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  `url_path` varchar(255) DEFAULT NULL,
  `ext` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
