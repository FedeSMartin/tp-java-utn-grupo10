-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: prode
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partidos` (
  `id_Partido` int NOT NULL AUTO_INCREMENT,
  `Ronda` int DEFAULT NULL,
  `Equipo_1` varchar(45) DEFAULT NULL,
  `Goles_Equipo_1` int DEFAULT NULL,
  `Goles_Equipo_2` int DEFAULT NULL,
  `Equipo_2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_Partido`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidos`
--

LOCK TABLES `partidos` WRITE;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` VALUES (1,1,'Argentina',1,2,'Arabia Saudita'),(2,1,'Polonia',0,0,'México'),(3,1,'Argentina',2,0,'México'),(4,1,'Arabia Saudita',0,2,'Polonia'),(5,2,'Ecuador',0,3,'Chile'),(6,2,'Francia',2,0,'Portugal'),(7,2,'Portugal',2,0,'Ecuador'),(8,2,'Francia',0,2,'Chile'),(9,3,'Bolivia',0,3,'Alemania'),(10,3,'Italia',2,0,'Peru'),(11,3,'Peru',2,0,'Bolivia'),(12,3,'Italia',0,2,'Alemania'),(13,4,'Uruguay',1,2,'Brazil'),(14,4,'Colombia',1,1,'Paraguay'),(15,4,'Uruguay',2,0,'Paraguay'),(16,4,'Colombia',0,2,'Brazil');
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pronosticos`
--

DROP TABLE IF EXISTS `pronosticos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pronosticos` (
  `id_Pronostico` int NOT NULL AUTO_INCREMENT,
  `Ronda` int DEFAULT NULL,
  `Participante` varchar(45) DEFAULT NULL,
  `Equipo_1` varchar(45) DEFAULT NULL,
  `Gana_Equipo_1` char(1) DEFAULT NULL,
  `Empate` char(1) DEFAULT NULL,
  `Gana_Equipo_2` char(1) DEFAULT NULL,
  `Equipo_2` varchar(45) DEFAULT NULL,
  `id_Partido_FK` int DEFAULT NULL,
  PRIMARY KEY (`id_Pronostico`),
  KEY `id_Partido_FK` (`id_Partido_FK`),
  CONSTRAINT `pronosticos_ibfk_1` FOREIGN KEY (`id_Partido_FK`) REFERENCES `partidos` (`id_Partido`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pronosticos`
--

LOCK TABLES `pronosticos` WRITE;
/*!40000 ALTER TABLE `pronosticos` DISABLE KEYS */;
INSERT INTO `pronosticos` VALUES (1,1,'Mariana','Argentina','X','','','Arabia Saudita',1),(2,1,'Mariana','Polonia','','X','','México',2),(3,1,'Mariana','Argentina','X','','','México',3),(4,1,'Mariana','Arabia Saudita','','','X','Plonia',4),(5,2,'Mariana','Ecuador','X','','','Chile',5),(6,2,'Mariana','Francia','','X','','Portugal',6),(7,2,'Mariana','Portugal','','','X','Ecuador',7),(8,2,'Mariana','Francia','','X','','Chile',8),(9,3,'Mariana','Bolivia','X','','','Alemania',9),(10,3,'Mariana','Italia','','X','','Peru',10),(11,3,'Mariana','Peru','','','X','Bolivia',11),(12,3,'Mariana','Italia','','X','','Alemania',12),(13,4,'Mariana','Uruguay','X','','','Brazil',13),(14,4,'Mariana','Colombia','','X','','Paraguay',14),(15,4,'Mariana','Uruguay','','','X','Paraguay',15),(16,4,'Mariana','Colombia','X','','','Brazil',16),(17,1,'Pedro','Argentina','X','','','Arabia Saudita',1),(18,1,'Pedro','Polonia','','','X','México',2),(19,1,'Pedro','Argentina','X','','','México',3),(20,1,'Pedro','Arabia Saudita','','X','','Plonia',4),(21,2,'Pedro','Ecuador','','X','','Chile',5),(22,2,'Pedro','Francia','','','X','Portugal',6),(23,2,'Pedro','Portugal','X','','','Ecuador',7),(24,2,'Pedro','Francia','X','','','Chile',8),(25,3,'Pedro','Bolivia','','','X','Alemania',9),(26,3,'Pedro','Italia','X','','','Peru',10),(27,3,'Pedro','Peru','','X','','Bolivia',11),(28,3,'Pedro','Italia','','','X','Alemania',12),(29,4,'Pedro','Uruguay','','','X','Brazil',13),(30,4,'Pedro','Colombia','X','','','Paraguay',14),(31,4,'Pedro','Uruguay','X','','','Paraguay',15),(32,4,'Pedro','Colombia','','','X','Brazil',16),(33,1,'Andrea','Argentina','','X','','Arabia Saudita',1),(34,1,'Andrea','Polonia','','X','','México',2),(35,1,'Andrea','Argentina','','X','','México',3),(36,1,'Andrea','Arabia Saudita','','','X','Plonia',4),(37,2,'Andrea','Ecuador','X','','','Chile',5),(38,2,'Andrea','Francia','','','X','Portugal',6),(39,2,'Andrea','Portugal','X','','','Ecuador',7),(40,2,'Andrea','Francia','','','X','Chile',8),(41,3,'Andrea','Bolivia','X','','','Alemania',9),(42,3,'Andrea','Italia','','','X','Peru',10),(43,3,'Andrea','Peru','X','','','Bolivia',11),(44,3,'Andrea','Italia','','','X','Alemania',12),(45,4,'Andrea','Uruguay','X','','','Brazil',13),(46,4,'Andrea','Colombia','','X','','Paraguay',14),(47,4,'Andrea','Uruguay','','X','','Paraguay',15),(48,4,'Andrea','Colombia','','X','','Brazil',16),(49,1,'Marcos','Argentina','X','','','Arabia Saudita',1),(50,1,'Marcos','Polonia','','','X','México',2),(51,1,'Marcos','Argentina','X','','','México',3),(52,1,'Marcos','Arabia Saudita','','','X','Plonia',4),(53,2,'Marcos','Ecuador','','X','','Chile',5),(54,2,'Marcos','Francia','X','','','Portugal',6),(55,2,'Marcos','Portugal','X','','','Ecuador',7),(56,2,'Marcos','Francia','X','','','Chile',8),(57,3,'Marcos','Bolivia','','','X','Alemania',9),(58,3,'Marcos','Italia','X','','','Peru',10),(59,3,'Marcos','Peru','X','','','Bolivia',11),(60,3,'Marcos','Italia','','','X','Alemania',12),(61,4,'Marcos','Uruguay','','','X','Brazil',13),(62,4,'Marcos','Colombia','','X','','Paraguay',14),(63,4,'Marcos','Uruguay','X','','','Paraguay',15),(64,4,'Marcos','Colombia','','','X','Brazil',16);
/*!40000 ALTER TABLE `pronosticos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-03 13:42:46
