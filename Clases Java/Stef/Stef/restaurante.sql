CREATE DATABASE  IF NOT EXISTS `restaurante` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `restaurante`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurante
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `Cedula` int(11) NOT NULL,
  `Nombre` char(40) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `IdReservaciones` int(11) NOT NULL,
  PRIMARY KEY (`Cedula`),
  KEY `IdReservaciones_idx` (`IdReservaciones`),
  CONSTRAINT `IdReservaciones` FOREIGN KEY (`IdReservaciones`) REFERENCES `reservaciones` (`IdReservaciones`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comandas`
--

DROP TABLE IF EXISTS `comandas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comandas` (
  `IdComandas` int(20) NOT NULL,
  `IdPlatillo` int(20) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `NumeroMesa` int(11) NOT NULL,
  PRIMARY KEY (`IdComandas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comandas`
--

LOCK TABLES `comandas` WRITE;
/*!40000 ALTER TABLE `comandas` DISABLE KEYS */;
/*!40000 ALTER TABLE `comandas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domicilios`
--

DROP TABLE IF EXISTS `domicilios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domicilios` (
  `IdDomicilios` int(20) NOT NULL,
  `Cedula` int(20) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` datetime NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  PRIMARY KEY (`IdDomicilios`),
  KEY `Cedula_idx` (`Cedula`),
  CONSTRAINT `Cedula` FOREIGN KEY (`Cedula`) REFERENCES `clientes` (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilios`
--

LOCK TABLES `domicilios` WRITE;
/*!40000 ALTER TABLE `domicilios` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `IdEmpleado` int(20) NOT NULL,
  `Nombre` char(45) NOT NULL,
  `Cargo` char(20) NOT NULL,
  `Sueldo` int(11) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`IdEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (8414512,'jesus','Administrador',54455121,554444,'sa@gmail.com','gds514','Yisus','8cb2237d0679ca88db6464eac60da96345513964'),(1007172988,'jesus','Mesero',95411,3007256,'mar@gmail.com','ds55sa','jeus','8cb2237d0679ca88db6464eac60da96345513964');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `Id_factura` int(20) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Platos` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` datetime NOT NULL,
  `Propina` int(20) NOT NULL,
  `Subtotal` double NOT NULL,
  `ImpoConsumo` double NOT NULL,
  `ValorPagar` double NOT NULL,
  `IdDomicilios` int(20) NOT NULL,
  `IdComandas` int(20) NOT NULL,
  `NumeroMesa` int(11) NOT NULL,
  `IdEmpleado` int(20) NOT NULL,
  `Cedula` int(11) NOT NULL,
  `NºPlatillo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id_factura`),
  KEY `IdDomicilios_idx` (`IdDomicilios`),
  KEY `IdComandas_idx` (`IdComandas`),
  KEY `Cedula_idx` (`Cedula`),
  KEY `IdEmpleado_idx` (`IdEmpleado`),
  KEY `NºPlatillo_idx` (`NºPlatillo`),
  CONSTRAINT `Cedulaf` FOREIGN KEY (`Cedula`) REFERENCES `clientes` (`Cedula`),
  CONSTRAINT `IdComandas` FOREIGN KEY (`IdComandas`) REFERENCES `comandas` (`IdComandas`),
  CONSTRAINT `IdDomicilios` FOREIGN KEY (`IdDomicilios`) REFERENCES `domicilios` (`IdDomicilios`),
  CONSTRAINT `IdEmpleado` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleados` (`IdEmpleado`),
  CONSTRAINT `NºPlatillof` FOREIGN KEY (`NºPlatillo`) REFERENCES `platillos` (`N°Platillo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `N°Inventario` int(11) NOT NULL AUTO_INCREMENT,
  `ReferenciaProducto` int(15) NOT NULL,
  `NombreIngrediente` char(40) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `ValorUnitario` int(20) NOT NULL,
  `IdProveedor` int(20) NOT NULL,
  PRIMARY KEY (`N°Inventario`),
  KEY `IdProveedor_idx` (`IdProveedor`),
  CONSTRAINT `IdProveedor` FOREIGN KEY (`IdProveedor`) REFERENCES `proveedores` (`IdProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `platillos`
--

DROP TABLE IF EXISTS `platillos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `platillos` (
  `N°Platillo` int(11) NOT NULL AUTO_INCREMENT,
  `NombrePlatillo` char(50) NOT NULL,
  `Porciones` int(11) NOT NULL,
  `Categoria` char(40) NOT NULL,
  `PrecioPlatillo` int(11) NOT NULL,
  PRIMARY KEY (`N°Platillo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `platillos`
--

LOCK TABLES `platillos` WRITE;
/*!40000 ALTER TABLE `platillos` DISABLE KEYS */;
/*!40000 ALTER TABLE `platillos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `IdProveedor` int(20) NOT NULL,
  `Nombre` char(40) NOT NULL,
  `ProductoVenta` char(50) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  PRIMARY KEY (`IdProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receta`
--

DROP TABLE IF EXISTS `receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receta` (
  `IdReceta` int(11) NOT NULL AUTO_INCREMENT,
  `ReferenciaProducto` int(15) NOT NULL,
  `Unidad` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `NºPlatillo` int(20) NOT NULL,
  PRIMARY KEY (`IdReceta`),
  KEY `ReferenciaProducto_idx` (`ReferenciaProducto`),
  KEY `NºPlatillo_idx` (`NºPlatillo`),
  CONSTRAINT `NºPlatillo` FOREIGN KEY (`NºPlatillo`) REFERENCES `platillos` (`N°Platillo`),
  CONSTRAINT `ReferenciaProducto` FOREIGN KEY (`ReferenciaProducto`) REFERENCES `inventario` (`N°Inventario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receta`
--

LOCK TABLES `receta` WRITE;
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
/*!40000 ALTER TABLE `receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservaciones`
--

DROP TABLE IF EXISTS `reservaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservaciones` (
  `IdReservaciones` int(11) NOT NULL,
  `Nombre` char(40) NOT NULL,
  `Hora` datetime NOT NULL,
  `Fecha` date NOT NULL,
  `NumeroMesa` int(11) NOT NULL,
  `Cedula1` int(20) NOT NULL,
  PRIMARY KEY (`IdReservaciones`),
  KEY `NombreCliente_idx` (`Nombre`),
  KEY `Cedula_idx` (`Cedula1`),
  CONSTRAINT `Cedula1` FOREIGN KEY (`Cedula1`) REFERENCES `clientes` (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservaciones`
--

LOCK TABLES `reservaciones` WRITE;
/*!40000 ALTER TABLE `reservaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservaciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-08 11:16:29
