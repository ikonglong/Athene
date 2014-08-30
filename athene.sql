
drop table if exists `athene`.`Question`;
drop table if exists `athene`.`Answer`;
drop table if exists `athene`.`QuestionTag`;
drop table if exists `athene`.`Comment`;
drop table if exists `athene`.`User`;
drop table if exists `athene`.`QuestionTitle`;
drop table if exists `athene`.`UserVotes`;

CREATE TABLE `athene`.`Question` (
  `questionId` bigint NOT NULL AUTO_INCREMENT,
  `authorId` bigint DEFAULT NULL,
  `questionTitleId` bigint NOT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `categoryId` bigint DEFAULT NULL,
  `numOfExposures` bigint DEFAULT NULL,
  `tagId` bigint DEFAULT NULL,
  `numOfAnswers` INT DEFAULT 0,
  `numOfComments` INT DEFAULT 0,
  PRIMARY KEY (`questionId`),
  UNIQUE KEY `questionId_UNIQUE` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;



CREATE TABLE `athene`.`QuestionTag` (
  `tagId` bigint NOT NULL AUTO_INCREMENT,
  `tagContent` VARCHAR(100) NULL,
  PRIMARY KEY (`tagId`));



CREATE TABLE `athene`.`Comment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `targetId` bigint NULL,
  `content` VARCHAR(4000) NULL,
  `numOfComments` INT DEFAULT 0,
  `targetType` INT DEFAULT 0,
  PRIMARY KEY (`id`));



CREATE TABLE `athene`.`Answer` (
  `answerId` bigint NOT NULL AUTO_INCREMENT,
  `authorId` bigint NULL,
  `isAccepted` INT NULL,
  `questionId` bigint NULL,
  `numOfComments` INT DEFAULT 0,
   `answerContent` VARCHAR(4000) NULL,
    `numOfVotes` INT DEFAULT 0,
  PRIMARY KEY (`answerId`));



CREATE TABLE `athene`.`User` (
  `userId` bigint NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NULL,
  PRIMARY KEY (`userId`));



CREATE TABLE `athene`.`QuestionTitle` (
  `questionTitleId` bigint NOT NULL AUTO_INCREMENT,
  `questionTitleContent` VARCHAR(1000) NULL,
   `questionId` bigint NULL,
  PRIMARY KEY (`questionTitleId`));

  CREATE TABLE `athene`.`UserVotes` (
  `voteId` bigint NOT NULL AUTO_INCREMENT,
  `voterId`bigint NOT NULL,
  `voteTargetId`bigint NOT NULL,
  PRIMARY KEY (`voteId`));