CREATE DATABASE  IF NOT EXISTS `examevidance` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `examevidance`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: examevidance
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `product_table`
--

DROP TABLE IF EXISTS `product_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_table` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(45) DEFAULT NULL,
  `purshase_date` date DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `product_unit` int(11) DEFAULT NULL,
  `product_catagory` varchar(45) DEFAULT NULL,
  `manu_country` varchar(45) DEFAULT NULL,
  `country1` varchar(45) DEFAULT NULL,
  `country2` varchar(45) DEFAULT NULL,
  `picture` longblob,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_table`
--

LOCK TABLES `product_table` WRITE;
/*!40000 ALTER TABLE `product_table` DISABLE KEYS */;
INSERT INTO `product_table` VALUES (1,'Onion','2014-12-12',10,160,'Local','Canada','USA','UK','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0��c\0\0\0sRGB\0���\0\0\0gAMA\0\0���a\0\0\0	pHYs\0\0�\0\0��+\0\0�IDATHK��[lUU��so��b��i��6�ؖ���B���Ƅ\"V�hD�x!!���h�(014�r���AKJL�U4������ҳ�f�sNJ{�+���^k��3�Ϛu��2�>�wv:�uuNU(�<-9�<+kk����9��̈́�Gitl����\"��DF����GLo��\r���\nJ�q��O͍����w����B���>i���)z�gT�������^5/Z4դ�s�::�*󋐅R0C1)N(��\'�i�=^p�t�����O���{k�f�2 ߜ:�mm:�Rs�TZ.��9�!w\rk�|����<@�cr�5�ƈl����\'O��ld@|>��3���\0F����G��ex�����V�t�T��$J���U찞d��\Z�Դ|�>0�f��K<K���sҜ�Q���.!tjp�a��t�ēr9]�]7��h�ɏD48_����<y����y�H���Ԅ.R �qʸ\Z%m���m�9vLo7�	�%\0	�z����El��Ң��A��mS��@==���A\n%Ʀ`I\n���X�gZۜ�W�S=�����\0�Q�\0����è\rs��~N-����hB�|�������ScU��T�Ý�	����U.�a�X3�l=/����,%�k}�)��;0션���`#܌�֬Q�#W��6�l�r�Lϊp.?1���wn�_D��ۓh� *[��ե���g\0���\\�KC.��h�x1�8�BH�3��l�O/S�,�f���5�RM�r��g�����L�W1,Y$���\Z��l٢��;g\0\\��Q���3\0S��(<&�%%���z\rSj�\Z�p���˷nU��X�O�ۿQ75�#7��p�\02�Ǽ�F�_{e��o�և�����\n�ؾ�%6M���T:긅���C�P>�����ݛ�:�9]�����ųkF��r��TS�Ga֑�W�SLeD�I�v������=�L\'(ߠ�Dk1\0;XG������ǉ����!K�fC��a��\0�]sB!��g��J7��PƆ=���V4��F`\'�/6��HnL���p���|}������e�_�Eg�!y�j�L�tK�4\r���\0zΜɤ���rY�v~�WUW8x�\"µ�eǨ��#�l�=q�ܞ5��e\01�[�}�\r��ښ�qǟ��W�K�#T^�2�16\'v/�ԝ1��cU!�n� �����*�22���Z�4��X�����Fnߣ�a,��>v��B�Y�9�i��o:�kw�?M�|鼼�\r�z��<r��)�YS[�|�����e���\Z�XV�	�\0\0\0\0IEND�B`�'),(2,'Mango','2012-02-01',15,300,'Local','Garmany','USA',NULL,'�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0��c\0\0\0sRGB\0���\0\0\0gAMA\0\0���a\0\0\0	pHYs\0\0�\0\0��+\0\0:IDATHK5�[lg��9�Ξ�ݵ��ı�Nl�Ԥ��B��CQ!��(���B�T��T�D�T�+�V�T�+��;q��$M�*���8�g{�ޝ���?��H<������������]����(����HbȲ��C�y��A���s.��VS�7\'�ӵqr���* ɐU�mu����E�q�vӅ��bq˃���0ֶm��.��xиNQw8V�\Z2�>֛!ꕇ�����r�0����׏Ǿ�u����r�A��ߏ�Ǐ�nڐu��0��v����!=C#�o���C�����;zO��,*�_M��%�Slk����ʂ���2��|��o�y+(��4�|���ߙÜ]�*�T3re���5̺eV��R`��W��-��˗Ɠ�6U�(�@�8�W�=@�踼��n�	��gx�{��bj3�{]�C���ӹ��c��fJ�P]���;��R����~�������������$�n٨�UF\"DM`���\Z��ea\"j�c�J��XN$�� ��e�h/�$=�A�b,֚�Wʡ�\nJ��@c�.K�z>L�Lk+�����Z�L�A���xű��$A�%7�^�e��$4��9f�\\4]?Ŕ��s],4b�܀���4��T�� �)��q5Pp�>#T�**Y�������@�)��U���Q8�\\�9FT�F�����?�R��.ܷu�|�	8�n.�`�:~�����\'��`�\Z�(��Տ�{A.��R�(��]��n#���7����/��C�:Y�\Z�(��\n^z�#�y��&�����c��H�KM6�໿���T s�J$�d\\���l�3-�ՙ�|�)�m�G)���<����X��m��t�n���_�\n�L��+w��u�k�6�\nS7 ]�x1Qc�6���2� �EfvT�BX����WB�)��Q��d�v�.E� �q�e�?��O���.C�����Q|�D6⤀�Y�E7pIR� fY�ѥ?����%�rJ�B\0�y�+��%L�ߛLW�Ɖ\"\Z���؄ӲI��\nx6�T�t��(�Uڎ�A�6�ǌ�yDff�.!Ւ+��g��-Dc�\"�a��x\n;�^�E楫+EX�c),A��Ĳ\\�+/<��(��$�ɣ��O1r�C�?�^��L<ڇw�^���06j���up�}��c=jg�̛�8���&��>Dt[Af_�����ؔb�h��t��\r,��5�]�@	h�\n]��\r�������EKm|rf��?��%^P�Ș\Z~?:���0�#oPY�Ks�x�\'�Ŋ����P���+��f��iJ�GG� \\��1��DG�@����+�)�P��f�\Z����N�3�h+�ು	.��8Qj\"KR����g� z�g�2�.¢+�4#�d��3�B�eEl�������.��hA���E�2X���	�!yЙE�r?��RA����.r�D\0�\':;ݮ��9n\Z��p`e��\0�Ve`\r�L���A*�8n4S�� ��\n��(>YRPȚ4��|9�ºQ�i��3SzR]\"1�\\cf�~:���|7o^��x4���*�9_d*�^J���c������vV.��=�>�z�o��dr�NT�M3-C.[���sx��{�;t��P����?��s�P���LƂQ*c��MwWY_~}pÙUS�C���Y��YS����r���P�X����[�����8~�pm��Q�� �r��{K��d֧����	\n�M{z�=�o��o\Z�85��;����;��w�����P�]_y��Pt���h6k�oB��&\'\'��m���~�\")��Y{,>�l@6\Z��q]fS\"$Bha5:]V��~#�:E�ː��ę��\'!� L,�\0\0\0\0IEND�B`�');
/*!40000 ALTER TABLE `product_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-03 15:52:43
