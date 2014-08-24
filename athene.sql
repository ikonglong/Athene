--问题表
drop table if exists `athene`.`Question`;
CREATE TABLE `athene`.`Question` (
  `questionId` decimal(10,0) DEFAULT 1 NOT NULL, 
  `authorId` decimal(10,0) DEFAULT NULL,
  `questionTitleId` decimal(10,0) NOT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `categoryId` decimal(10,0) DEFAULT NULL,
  `noOfExposures` int(11) DEFAULT NULL,
  `tagId` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`questionId`),
  UNIQUE KEY `questionId_UNIQUE` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

--问题标签表
drop table if exists `athene`.`QuestionTag`;
CREATE TABLE `athene`.`QuestionTag` (
  `tagId` DECIMAL NOT NULL,
  `tagContent` VARCHAR(100) NULL,
  PRIMARY KEY (`tagId`));

--评论表
drop table if exists `athene`.`Comment`;
CREATE TABLE `athene`.`Comment` (
  `commentId` DECIMAL NOT NULL,
  `targetId` DECIMAL NULL,
  `content` VARCHAR(4000) NULL,
  PRIMARY KEY (`commentId`));

--答案表
drop table if exists `athene`.`Answer`;
CREATE TABLE `athene`.`Answer` (
  `answerId` DECIMAL NOT NULL,
  `author` DECIMAL NULL,
  `isAccepted` INT NULL,
  PRIMARY KEY (`answerId`));

--用户表
drop table if exists `athene`.`User`;
CREATE TABLE `athene`.`User` (
  `userId` DECIMAL NOT NULL,
  `username` VARCHAR(100) NULL,
  PRIMARY KEY (`userId`));

--问题标题表
drop table if exists `athene`.`QuestionTitle`;
CREATE TABLE `athene`.`QuestionTitle` (
  `questionTitleId` DECIMAL NOT NULL,
  `questionTitleContent` VARCHAR(1000) NULL,
  PRIMARY KEY (`questionTitleId`));



