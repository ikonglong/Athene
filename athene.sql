--问题表
drop table if exists `athene`.`Question`;
CREATE TABLE `athene`.`Question` (
  `questionId` bigint NOT NULL AUTO_INCREMENT,
  `authorId` bigint DEFAULT NULL,
  `questionTitleId` bigint NOT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `categoryId` bigint DEFAULT NULL,
  `noOfExposures` bigint DEFAULT NULL,
  `tagId` bigint DEFAULT NULL,
  PRIMARY KEY (`questionId`),
  UNIQUE KEY `questionId_UNIQUE` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

--问题标签表
drop table if exists `athene`.`QuestionTag`;
CREATE TABLE `athene`.`QuestionTag` (
  `tagId` bigint NOT NULL,
  `tagContent` VARCHAR(100) NULL,
  PRIMARY KEY (`tagId`));

--评论表
drop table if exists `athene`.`Comment`;
CREATE TABLE `athene`.`Comment` (
  `commentId` bigint NOT NULL,
  `targetId` bigint NULL,
  `content` VARCHAR(4000) NULL,
  PRIMARY KEY (`commentId`));

--答案表
drop table if exists `athene`.`Answer`;
CREATE TABLE `athene`.`Answer` (
  `answerId` bigint NOT NULL,
  `author` bigint NULL,
  `isAccepted` INT NULL,
  PRIMARY KEY (`answerId`));

--用户表
drop table if exists `athene`.`User`;
CREATE TABLE `athene`.`User` (
  `userId` bigint NOT NULL,
  `username` VARCHAR(100) NULL,
  PRIMARY KEY (`userId`));

--问题标题表
drop table if exists `athene`.`QuestionTitle`;
CREATE TABLE `athene`.`QuestionTitle` (
  `questionTitleId` bigint NOT NULL,
  `questionTitleContent` VARCHAR(1000) NULL,
  PRIMARY KEY (`questionTitleId`));



