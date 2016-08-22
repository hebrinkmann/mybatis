CREATE TABLE `channel` (
  `idchannel` int(11) NOT NULL,
  `displayname` varchar(100) NOT NULL,
  `url` varchar(1000) NOT NULL,
  `iconurl` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`idchannel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `title` (
  `idtitle` int(11) NOT NULL,
  `value` varchar(256) NOT NULL,
  `lang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtitle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `category` (
  `idcategory` int(11) NOT NULL,
  `value` varchar(100) NOT NULL,
  `lang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `description` (
  `iddescription` int(11) NOT NULL,
  `value` varchar(1000) NOT NULL,
  `lang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddescription`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `programme` (
  `idprogramme` int(11) NOT NULL,
  `start` datetime NOT NULL,
  `stop` datetime NOT NULL,
  `idchannel` int(11) NOT NULL,
  `idtitle` int(11) NOT NULL,
  `idcategrory` int(11) DEFAULT NULL,
  `iddescription` int(11) DEFAULT NULL,
  PRIMARY KEY (`idprogramme`),
  KEY `fk_prg_channel_idx` (`idchannel`),
  KEY `fk_prg_title_idx` (`idtitle`),
  KEY `fk_prg_category_idx` (`idcategrory`),
  KEY `fk_prg_desc_idx` (`iddescription`),
  CONSTRAINT `fk_prg_category` FOREIGN KEY (`idcategrory`) REFERENCES `category` (`idcategory`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_prg_channel` FOREIGN KEY (`idchannel`) REFERENCES `channel` (`idchannel`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_prg_desc` FOREIGN KEY (`iddescription`) REFERENCES `description` (`iddescription`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_prg_title` FOREIGN KEY (`idtitle`) REFERENCES `title` (`idtitle`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
