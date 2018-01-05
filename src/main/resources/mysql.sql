
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `system_db_bak`
-- ----------------------------
DROP TABLE IF EXISTS `system_db_bak`;
CREATE TABLE `system_db_bak` (
  `bak_id` int(11) NOT NULL AUTO_INCREMENT,
  `db_name` varchar(100) DEFAULT NULL,
  `db_bak_name` varchar(100) DEFAULT NULL,
  `db_size` int(11) DEFAULT NULL,
  `db_bak_type` int(11) DEFAULT NULL,
  `db_bak_time` datetime DEFAULT NULL,
  `db_bak_user` varchar(50) DEFAULT NULL,
  `db_bak_note` varchar(100) DEFAULT NULL,
  `db_bak_path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bak_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;