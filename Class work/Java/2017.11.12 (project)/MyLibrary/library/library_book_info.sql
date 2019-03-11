CREATE DATABASE  IF NOT EXISTS `library` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `library`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_info`
--

DROP TABLE IF EXISTS `book_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_info` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(45) DEFAULT NULL,
  `Subject` varchar(45) DEFAULT NULL,
  `Edition` varchar(45) DEFAULT NULL,
  `Version` varchar(45) DEFAULT NULL,
  `book_type` varchar(45) DEFAULT NULL,
  `shelf_no` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `book_price` float DEFAULT NULL,
  `purchase_date` date DEFAULT NULL,
  `purchase_source` varchar(45) DEFAULT NULL,
  `confidential_copies` int(11) DEFAULT NULL,
  `general_copies` int(11) DEFAULT NULL,
  `Issued_fee` float DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_info`
--

LOCK TABLES `book_info` WRITE;
/*!40000 ALTER TABLE `book_info` DISABLE KEYS */;
INSERT INTO `book_info` VALUES (101,'Advanced Java','CSE','2nd','English','Text Book','E-23','AZ Production',234,'2007-03-15','Direct ',34,45,23),(102,'HTML','Web publishing','3rd','English','Text Book','E-56','PI production',456,'2007-03-14','Online',12,45,68),(103,'Electronics','Physics','4th','English','Text Book','W-34','Springer',340,'2017-11-09','Amazon',12,45,67),(104,'Core Java','CSE','7th','English','Text Book','E-45','AZ production',345,'2017-11-08','Direct',12,46,45),(105,'CSS','CSE','4th','English','Text Book','E-34','AZ Production',450,'2017-11-14','Online',24,126,30),(106,'Compitative English','English','4th','English','Text Book','N-34','Chowdury And Hossian',350,'2017-11-27','Direct',4,14,10),(107,'Quantum Mechanics','Physics','5th','Bangla','Text Book','N-23','NZ Production',452,'2017-11-23','Direct',5,16,40);
/*!40000 ALTER TABLE `book_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2007-03-07 18:38:09
