# ************************************************************
# Sequel Pro SQL dump
# Version 3408
#
# http://www.sequelpro.com/
# http://code.google.com/p/sequel-pro/
#
# Host: 127.0.0.1 (MySQL 5.5.27)
# Database: blog
# Generation Time: 2012-12-30 00:39:49 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table TB_CLUBES
# ------------------------------------------------------------

DROP TABLE IF EXISTS `TB_CLUBES`;

CREATE TABLE `TB_CLUBES` (
  `ID_CLUBE` int(11) NOT NULL,
  `NOME` varchar(200) NOT NULL,
  `NOME_POP` varchar(100) DEFAULT NULL,
  `FUNDACAO` date DEFAULT NULL,
  PRIMARY KEY (`ID_CLUBE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `TB_CLUBES` WRITE;
/*!40000 ALTER TABLE `TB_CLUBES` DISABLE KEYS */;

INSERT INTO `TB_CLUBES` (`ID_CLUBE`, `NOME`, `NOME_POP`, `FUNDACAO`)
VALUES
	(1,'Sociedade Esportiva Palmeiras','Palmeiras','1914-08-26');

/*!40000 ALTER TABLE `TB_CLUBES` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
