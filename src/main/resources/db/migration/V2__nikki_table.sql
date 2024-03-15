CREATE TABLE `nikki` (
    `nikkiid` SERIAL NOT NULL,
    `day` VARCHAR(12) NOT NULL,
    `title` VARCHAR(32) NOT NULL,
    `content` VARCHAR(1024) NOT NULL,
    PRIMARY KEY (`nikkiid`)
) ENGINE=InnoDB;
