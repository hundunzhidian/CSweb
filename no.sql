-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.3.7-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 l4d2 的数据库结构
CREATE DATABASE IF NOT EXISTS `l4d2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `l4d2`;

-- 导出  表 l4d2.player_data 结构
CREATE TABLE IF NOT EXISTS `player_data` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `steam_id` varchar(32) NOT NULL DEFAULT '',
  `player_id` varchar(128) DEFAULT NULL,
  `VIP` int(16) DEFAULT 0,
  `VIPTL` int(16) DEFAULT 0,
  `VIPYEAR` int(16) DEFAULT 0,
  `killplayer` int(16) DEFAULT 0,
  `deadplayer` int(16) DEFAULT 0,
  `assistplayer` int(16) DEFAULT 0,
  `currentpoints` int(16) DEFAULT 0,
  `allpoints` int(16) DEFAULT 0,
  `chenghao` int(16) DEFAULT 0,
  `chenghaoname` varchar(64) DEFAULT NULL,
  `number` int(16) DEFAULT 0,
  PRIMARY KEY (`uid`,`steam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1073 DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
