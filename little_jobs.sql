-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema little_jobs
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema little_jobs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `little_jobs` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `little_jobs` ;

-- -----------------------------------------------------
-- Table `little_jobs`.`job_categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`job_categories` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `name` VARCHAR(128) NOT NULL COMMENT 'nombre de la categoria',
  `icon` VARCHAR(128) NOT NULL COMMENT 'icono de la categoria',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`departments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`departments` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `name` VARCHAR(64) NOT NULL COMMENT 'nombre del departamento del pais',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`gig_workers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`gig_workers` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `first_name` VARCHAR(64) NOT NULL COMMENT 'Nombres del trabajador',
  `last_name` VARCHAR(64) NOT NULL COMMENT 'apellidos del trabajador',
  `gender` ENUM('MEN', 'WOMEN') NOT NULL COMMENT 'genero',
  `date_of_birth` DATE NOT NULL COMMENT 'fecha de nacimiento',
  `department_id` INT NOT NULL COMMENT 'id del departamento al que pertenece',
  `address` VARCHAR(1024) NOT NULL COMMENT 'direccion del trabajador',
  `state` ENUM('ACTIVE', 'PENDING', 'LOCKED') NOT NULL DEFAULT 'PENDING' COMMENT 'Estado del trabajador',
  `email` VARCHAR(128) NOT NULL COMMENT 'correo para inicio de session',
  `password` VARCHAR(1024) NOT NULL COMMENT 'contraseña',
  `photo` VARCHAR(128) NULL COMMENT 'fotografia del trabajador',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`),
  INDEX `fk_gig_worker_department_id_idx` (`department_id` ASC),
  CONSTRAINT `fk_gig_worker_department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `little_jobs`.`departments` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`documents`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`documents` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `image` VARCHAR(128) NOT NULL COMMENT 'imagen del documento',
  `path` VARCHAR(128) NOT NULL COMMENT 'direccion donde se almacena el documento',
  `type` ENUM('DUI', 'NIT') NOT NULL COMMENT 'tipo de documento',
  `value` VARCHAR(32) NOT NULL COMMENT 'valor del documento',
  `gig_worker_id` INT NOT NULL COMMENT 'id del trabajador',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`),
  INDEX `fk_document_gig_worker_id_idx` (`gig_worker_id` ASC),
  CONSTRAINT `fk_document_gig_worker_id`
    FOREIGN KEY (`gig_worker_id`)
    REFERENCES `little_jobs`.`gig_workers` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`gig_worker_job_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`gig_worker_job_category` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `gig_worker_id` INT NOT NULL COMMENT 'id del trabajador',
  `job_category_id` INT NOT NULL COMMENT 'id de la categoria de trabajo',
  `price_hour` DECIMAL(12,2) NOT NULL COMMENT 'precio por hora sobre la categoria',
  PRIMARY KEY (`id`),
  INDEX `gig_worker_job_category_gig_worker_id_idx` (`gig_worker_id` ASC),
  INDEX `gig_worker_job_category_job_category_id_idx` (`job_category_id` ASC),
  CONSTRAINT `gig_worker_job_category_gig_worker_id`
    FOREIGN KEY (`gig_worker_id`)
    REFERENCES `little_jobs`.`gig_workers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `gig_worker_job_category_job_category_id`
    FOREIGN KEY (`job_category_id`)
    REFERENCES `little_jobs`.`job_categories` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`gig_worker_phones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`gig_worker_phones` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `type` ENUM('MOBILE', 'LANDLINE') NOT NULL COMMENT 'tipo de telefono',
  `value` VARCHAR(32) NOT NULL,
  `gig_worker_id` INT NOT NULL COMMENT 'id del trabajador',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`),
  INDEX `fk_gig_worker_phone_gig_worker_id_idx` (`gig_worker_id` ASC),
  CONSTRAINT `fk_gig_worker_phone_gig_worker_id`
    FOREIGN KEY (`gig_worker_id`)
    REFERENCES `little_jobs`.`gig_workers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `first_name` VARCHAR(128) NOT NULL COMMENT 'Nombres de cliente',
  `last_name` VARCHAR(128) NOT NULL COMMENT 'apellidos de cliente',
  `gender` ENUM('MEN', 'WOMAN') NOT NULL COMMENT 'genero del cliente',
  `department_id` INT NOT NULL COMMENT 'id del departamento',
  `address` VARCHAR(1024) NULL COMMENT 'direccion del cliente',
  `phone` VARCHAR(16) NULL COMMENT 'telefono del cliente',
  `photo` VARCHAR(128) NULL COMMENT 'fotografia del cliente',
  `email` VARCHAR(128) NOT NULL COMMENT 'correo para inicio de session',
  `password` VARCHAR(1024) NOT NULL COMMENT 'contraseña',
  PRIMARY KEY (`id`),
  INDEX `fk_customer_department_id_idx` (`department_id` ASC),
  CONSTRAINT `fk_customer_department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `little_jobs`.`departments` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'clave primaria',
  `title` VARCHAR(64) NOT NULL COMMENT 'Titulo del rol',
  `description` VARCHAR(1024) NULL COMMENT 'descripcion',
  `erased` TINYINT NOT NULL COMMENT 'Valor en true al ser eliminado',
  `erased_by` INT NULL COMMENT 'id de usuario que realizo el borrado',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `name` VARCHAR(64) NOT NULL COMMENT 'nombre de usuario',
  `email` VARCHAR(128) NOT NULL COMMENT 'Correo para inicio de session',
  `password` VARCHAR(1024) NOT NULL COMMENT 'contraseña',
  `role_id` INT NOT NULL COMMENT 'id del rol',
  `erased` INT NOT NULL COMMENT 'Valor en true al ser eliminado',
  `erased_by` INT NULL COMMENT 'Id del usuario que realizo el borrado',
  PRIMARY KEY (`id`),
  INDEX `user_role_id_idx` (`role_id` ASC),
  CONSTRAINT `user_role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `little_jobs`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`components`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`components` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `title` VARCHAR(64) NOT NULL COMMENT 'Titulo del componente a mostrar en el sistema',
  `name` VARCHAR(128) NOT NULL COMMENT 'nombre del componente en el sistema para identificarlo',
  `description` VARCHAR(512) NOT NULL COMMENT 'descripcion brebe sobre la funcionalidad del componente',
  `erased` TINYINT NOT NULL DEFAULT 0 COMMENT 'Valor en true al ser eliminado',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`permissions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`permissions` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `type` ENUM('VIEW', 'WRITE', 'MANAGE') NOT NULL COMMENT 'tipo de permiso',
  `role_id` INT NOT NULL COMMENT 'id del Rol',
  `component_id` INT NOT NULL COMMENT 'id del componente',
  PRIMARY KEY (`id`),
  INDEX `fk_permision_role_id_idx` (`role_id` ASC),
  INDEX `fk_permision_component_id_idx` (`component_id` ASC),
  CONSTRAINT `fk_permision_role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `little_jobs`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_permision_component_id`
    FOREIGN KEY (`component_id`)
    REFERENCES `little_jobs`.`components` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`agreements`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`agreements` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `customer_id` INT NOT NULL COMMENT 'id de cliente',
  `gig_worker_id` INT NOT NULL COMMENT 'id de Trabajador',
  `date` DATETIME NOT NULL COMMENT 'Fecha del acuerdo',
  `state` ENUM('PENDING', 'FINISHED', 'CANCELLED') NOT NULL DEFAULT 'PENDING' COMMENT 'Estado del acuerdo',
  PRIMARY KEY (`id`),
  INDEX `fk_review_customer_id_idx` (`customer_id` ASC),
  INDEX `fk_review_gig_worker_id_idx` (`gig_worker_id` ASC),
  CONSTRAINT `fk_agreement_customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `little_jobs`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_agreement_gig_worker_id`
    FOREIGN KEY (`gig_worker_id`)
    REFERENCES `little_jobs`.`gig_workers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`messages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`messages` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `content` INT NOT NULL COMMENT 'contenido del mensaje',
  `date` DATETIME NOT NULL COMMENT 'fecha del mensaje',
  `customer_id` INT NOT NULL COMMENT 'id del cliente',
  `gig_worker_id` INT NOT NULL COMMENT 'id del trabajador',
  `type` ENUM('TEXT', 'IMAGE', 'MAP', 'LINK') NOT NULL COMMENT 'tipo de mensaje',
  `TRANSMITTER` ENUM('WORKER', 'CUSTOMER') NOT NULL COMMENT 'identificador del emisor del msj',
  `viewed` DATETIME NULL COMMENT 'fecha de visualizacion del mensaje',
  PRIMARY KEY (`id`),
  INDEX `fk_review_customer_id_idx` (`customer_id` ASC),
  INDEX `fk_review_gig_worker_id_idx` (`gig_worker_id` ASC),
  CONSTRAINT `fk_complaint_customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `little_jobs`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_complaint_gig_worker_id`
    FOREIGN KEY (`gig_worker_id`)
    REFERENCES `little_jobs`.`gig_workers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`reviews`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`reviews` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `score` INT NOT NULL COMMENT 'valoracion',
  `comment` VARCHAR(512) NULL COMMENT 'comentario',
  `date` DATETIME NOT NULL COMMENT 'fecha',
  `agreement_id` INT NOT NULL COMMENT 'id del acuerdo',
  PRIMARY KEY (`id`),
  INDEX `fk_review_agreement_id_idx` (`agreement_id` ASC),
  CONSTRAINT `fk_review_agreement_id`
    FOREIGN KEY (`agreement_id`)
    REFERENCES `little_jobs`.`agreements` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `little_jobs`.`complaints`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `little_jobs`.`complaints` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria',
  `agreement_id` INT NOT NULL COMMENT 'id de acuerdo sobre el que se posee una queja',
  `date` DATETIME NOT NULL COMMENT 'fecha de registro',
  `comment` VARCHAR(2048) NOT NULL COMMENT 'comentarios',
  `viewed` DATETIME NULL COMMENT 'fecha de visualizacion de la queja',
  PRIMARY KEY (`id`),
  INDEX `fk_complaint_agreement_id_idx` (`agreement_id` ASC),
  CONSTRAINT `fk_complaint_agreement_id`
    FOREIGN KEY (`agreement_id`)
    REFERENCES `little_jobs`.`agreements` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
