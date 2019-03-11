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
INSERT INTO `product_table` VALUES (1,'Onion','2014-12-12',10,160,'Local','Canada','USA','UK','‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0Äé…c\0\0\0sRGB\0®Îé\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0Ä\0\0Ä•+\0\0úIDATHK…–[lUU†ÿsoéýb‘´i„6˜Ø–­¦B£Á€Æ„\"V­hÂ“Džx!!¾˜ðh˜(014Ær‘›ˆAKJL¬U4Š€¤´´çÒ³ýfïsNJ{ +™³÷^kÖü3óÏšuäÌ2ö>ì´wv:•uuNU(ä<-9•<+kkåëÖ9»šÍ„£GitlÜèƒï\"ç‘ÂDFâ¼ÿ€¬GLoõ†\róÙ\nJ™q¡¯OÍú™w¼©°Bòò–>i„ÄÏ)z—gTÚÃòÇÈùÞ^5/Z4Õ¤Ùsð º::ô*ó‹…R0C1)N(‰¤\'“iÁ=^päšt÷´‚ïO÷íÓ{k×f€2 ßœ:¥mm:ÊRsƒTZ.³9Ž!w\rk£|Äý¬…<@Ëcr’5æÆˆläºôŸÝ\'Oºöld@|>Ÿö3±ºý\0FØçéÿGŠàexü¡¸ãéV©t“TúŒ$J°ïúUì°žd‚ì\Z¾Ô´|¹>0€f”ÍK<KçÜsÒœßQÀ¢™.!tjp¢aÀ·tôÄ“r9]Œ]7’ÑhÔÉD48_ª®– <yÏû¼²yÜH¯›§Ô„.R ÿqÊ¸\Z%mØ‹Åm«9vLo7á	ž%\0	ôz„ºµ™ElÍ×Ò¢ÜÁA…¶mS² @==ª‚³A\n%Æ¦`I\n¡¿¨X¾gZÛœ½W¾S=‘Œ’Àä\0ìQÃ\0ÂííÊÃ¨\rsÂò~N-¢üœ¥hB¤|„òþä…åìíScUŠ‡TÍÃ²	•¬ÀªU.€aŠX3¿l=/òùˆò,%ªk}—)¤±;0ì…˜¸‘`#ÜŒ„Ö¬Qá‘#W€÷6þlªrçLÏŠp.?1™¨âwnË_D½›Û“hÅ *[ÓÕ¥âýûg\0üº°\\‘KC.€íµhòx18¶BHš3©“l¤O/Só,óf•îÚ5àRM¡rû‡gìñá°Þ¼LèW1,Y$†Ìá›\Z‰”lÙ¢²;g\0\\¨ÈQÁß÷3\0S÷Ñ(<&ƒ%%ô½ºz\rSjÖ\Z’p“ŽÄË·nUùŽXîOàÛ¿Q75Ó#7°»pá\02ÂÇ¼†Fù_{e…Ðo‚Ö‡Š½œº½\n©Ø¾Ý%6M²ÍúT:ê¸…­ßC€P>Ëû«Ø÷Ý›ˆ:Õ9]­§ÜÐûÅ³kFž›rø·TS¥GaÖ‘¢WßSLeDÑIØvâý…‘°æ=¿L\'(ß ‘Dk1\0;XGŸÕÍßúõÇ‰ãê€®!K£fC¾¯a¢ø\0ë]sB!¯›gŒÕJ7øçPÆ†= ÛÍV4ÚÇF`\'á/6˜¾HnL÷°Úp»°ý|}ü¤ž¢›ÎeÞ_ÀEg”!yˆjÎL•tK±4\r”¤\0zÎœÉ¤Ô±±rY›v~¾WUW8xä\"Âµ§eÇ¨¸´#¦l‚=qÆÜž5ÌÄeÂ˜\01À[Ì}Æ\rÛÞÚš™qÇŸû©W­Kë#T^‡2§16\'v/¦Ô1‚ñcU!ÌnÞ ù°¤ž*š22‘¤çZ–4¹¹Xÿ¾–Þâ¾Fnß£½a,ˆû>v…¦BöY±9¼i“»o:€kw¶?M»|é¼¼ö\r§zÁ§<r Ê)ãYS[ç¬|³Óù‚ÿe³ÿ\ZøXVô	’\0\0\0\0IEND®B`‚'),(2,'Mango','2012-02-01',15,300,'Local','Garmany','USA',NULL,'‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0Äé…c\0\0\0sRGB\0®Îé\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0Ä\0\0Ä•+\0\0:IDATHK5–[lg†ß9ÏÎžâÝµ¯«Ä±ëºNlœÔ¤Š¡BªÔCQ!µ½(ôªªB¢T ªTˆDªT‰+¢VªTˆ+ÒŽ;q’–$Mê*ŽíÐ8Æg{½Þóï?†½H<ÿü‡ïûÞç¿‘ÆÆÆ]Ó…’ˆ(Š‚ÏHbÈ²‚ŸCˆyïAæû˜s.øVSÿ7\'ŠÓµqrœû¨* ÉUÖmuµŒ¥†E–qÒvÓ…—«bqËƒ¡«à0Ö¶m„ù.¬íxÐ¸NQw8VÖ\Z2Ž>Ö›!ê•‡±±ãóÀr‡0öö Ú×Ç¾ñu¸®ž‚rßAìÝßáÇÃnÚuÏð0¦ívôŒç»é!=C#˜oµã‘ÃCˆ™­øí;zOýù,*Ã_M³’%¦SlkÃÏÎãÊ‚Š–Ï2ñà|±Œo½y+(Áñ‚4“|±‚×ß™Ãœ]*±T3reüéã5ÌºeVð R`þòW˜·-®ã¼Ë—Æ“Ï6UÜ(ž@¸8ƒWö=@¢è¸¼¢ànû	àþgx©{±¤bj3‹{]Cÿò¾Ó¹‚„c“µfJÇP]»§;ÖÒRŸ·÷ã~Çº¾¼†ÓÕ¤ñññÄÔ$¬nÙ¨äUF\"DM`ª–·\Z¨¶ea\"j‰cÀJÍáXN$¥™ ô±eûh/ˆ$=…A—b,ÖšØWÊ¡Å\nJ‰Ø@cª.Kåz>LÓLk+˜‰øìÖZüLAˆxÅ±øÐ$AÊ%7ä^µeŠˆ$4‘à9f×\\4]?Å”ŠÂs],4b´Ü€ˆªÐ4•ïTÌí “)’Êq5Pp»>#T **Yˆ©¡¥–Ì@¨)”ŽUÁÀàQ8¹\\œ9FTîFþ¡ÇÐÞ?˜R¤ó.Ü·u¼|ê	8Ùn.Œ`Æ:~€·Œâ\'Òï`†\Z’(€ÞÕ½{A.ïçR¤(ºª]¸·n#±ª¨7Š ³£/ÿâC¬:Yâ\Z¦(š™\n^zã#ÜyÀË&ÊÁ„ð½™cÈÕHÜKM6öà»¿™‚£T s„J$ÿd\\®âÜl3-ËÕ™œ|î)ümÞG)§Á÷<¬†ü¡XÍ˜mÄìtÜnÎâ·ò_Ñ\n¡LÞÑ+w×Ñuäk¸6¿\nS7 ]¼x1Qc·6–…Ô2ü €EfvTôï¡¸BX ³Ž×WB—)º¬Qø–dàvã.E« —q¿e ?ïÃO˜¡ð.C×ùï‚ÂèQ|äD6â¤€ºY–E7pIRŒ fY„Ñ¥?¬šÒ%ËrJ“B\0Ày”+Ò%Lîß›LWàÆ‰\"\Z…¿µØ„Ó²I‡\nx6ÜTÌt¸(æ‹UÚŽ¨Aº6†ÇŒí¹yDff—.!Õ’+ãÉgŸÁ-Dcª\"Ýa¯¾x\n;Å^ÚEæ¥«+EXŽc),A¡ðÄ²\\Â+/<Å(Ÿê$íÉ£øúO1rîC˜?‹^Äñ€L<Ú‡wÎ^ÁàÐ06j¤ŒÞup }¯Žc=jgÊÌ›õ8øÂú&ÌÒ>Dt[Af_ïÃøþÇØ”béhõÔtîÖ\r,üè5Ì]¸@	hõ\n]íê\r¸½‡ñöÄ­EKm|rf§Ÿ?‰©%^P¸È˜\Z~?:‹÷î0¾#oPY‡KsÛxæ…\'ðÅŠ…™„¤Pª ÿ+ÃÈf³©iJçGGÞ \\®—1”ÙDGÞ@Àºô“+›)ÔPÌðf«\ZšÔçÚN‡3ëh+äà³	.×ò8Qj\"KR„Éõ„gÎ zógÐ2æ.Â¢+ªÂ‘4#íd¾ï3’BñeElÎÞÁŸ°œŒ.£ÞhA§¨ÂE£2X¶ˆ„	â!yÐ™EÜr?÷¨RA¸¡è½Ñ.r¤D\0ê\':;Ý®ÿä²9n\Z¡Öp`e­ô\0±Ve`\r×Lƒù¿A*Ü8n4S·Ô þóŸ†\n«÷(>YRPÈš4ÌÖ|9ÅÂºQiˆÏ3SzR]\"1Ì\\cfŸ~:“ß|7o^ç³Îx4Ô–â*¶9_d*û^J¶‚óc÷°¥ìÇÖvV.î=è>óz§oÂá…drõNT‹M3-C.[À¥©sxÿý{ý;t¾ÎP©öâü?æÑsðPÚÊåLÆ‚Q*cÁ¦MwWY_~}pÃ™US¥Cø ÷YäåYSÇØç˜rÛñ‡ÖPÈX¯µðî[íø×ïþ8~pm’ÚQæÐ þrÛã·{K“âdÖ§©”‡î¥	\nšM{z‰=â£o¿†o\ZŽ85ãó;³øÁñ;­€wÂÁ¥ùÓPË]_yŽÚPt™åëh6köoB·ò&\'\'“–m£èº~”\")„ßY{,>Ûl@6\Z‘Êq]fS\"$Bha5:]V¥Ê~#:EËáøÄ™èÿ\'!‰ L,«\0\0\0\0IEND®B`‚');
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
