
drop table if exists `athene`.`Question`;
drop table if exists `athene`.`Answer`;
drop table if exists `athene`.`QuestionTag`;
drop table if exists `athene`.`Comment`;
drop table if exists `athene`.`User`;
drop table if exists `athene`.`QuestionTitle`;
drop table if exists `athene`.`UserVotes`;

CREATE TABLE `athene`.`Question` (
  `question_id` bigint NOT NULL AUTO_INCREMENT,
  `author_id` bigint DEFAULT NULL,
  `question_title` varchar(4000) DEFAULT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  `num_Of_exposures` bigint DEFAULT NULL,
  `tag_id` bigint DEFAULT NULL,
  `num_of_answers` INT DEFAULT 0,
  `num_of_comments` INT DEFAULT 0,
  `is_deleted` CHAR DEFAULT 'Y',
  `creator_id` bigint DEFAULT NULL,
  `created_time` DATETIME,
  `modifier_id` bigint DEFAULT NULL,
  `modified_time` DATETIME,
  PRIMARY KEY (`question_id`),
  UNIQUE KEY `question_id_UNIQUE` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;



CREATE TABLE `athene`.`QuestionTag` (
  `tag_id` bigint NOT NULL AUTO_INCREMENT,
  `tag_content` VARCHAR(100) NULL,
  PRIMARY KEY (`tag_id`));



CREATE TABLE `athene`.`Comment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `object_id` bigint NULL,
  `content` VARCHAR(4000) NULL,
  `num_of_comments` INT DEFAULT 0,
  `object_type` INT DEFAULT 0,
  PRIMARY KEY (`id`));



CREATE TABLE `athene`.`Answer` (
  `answer_id` bigint NOT NULL AUTO_INCREMENT,
  `author_id` bigint NULL,
  `is_accepted` INT NULL,
  `question_id` bigint NULL,
  `num_of_comments` INT DEFAULT 0,
   `answer_content` VARCHAR(4000) NULL,
    `num_of_votes` INT DEFAULT 0,
  PRIMARY KEY (`answer_id`));



CREATE TABLE `athene`.`User` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NULL,
  PRIMARY KEY (`user_id`));



CREATE TABLE `athene`.`QuestionTitle` (
  `question_title_id` bigint NOT NULL AUTO_INCREMENT,
  `question_title_content` VARCHAR(1000) NULL,
   `question_id` bigint NULL,
  PRIMARY KEY (`question_title_id`));

  CREATE TABLE `athene`.`UserVotes` (
  `vote_id` bigint NOT NULL AUTO_INCREMENT,
  `voter_id`bigint NOT NULL,
  `vote_object_id`bigint NOT NULL,
  PRIMARY KEY (`vote_id`));