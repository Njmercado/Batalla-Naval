CREATE DATABASE Battle_ship;
USE Battle_ship;

CREATE TABLE user (

  c_nick_name VARCHAR(50) NOT NULL,
  c_password VARCHAR(20) NOT NULL,
  c_level INT(2) UNSIGNED DEFAULT 1,
  c_money INT(6) UNSIGNED DEFAULT 100,
  c_points INT(3) UNSIGNED DEFAULT 0,
  c_image_profile LONGBLOB,
  c_question VARCHAR(100) NOT NULL,
  c_answer VARCHAR(50) NOT NULL,
  PRIMARY KEY(c_nick_name)
) ENGINE = InnoDB;

CREATE TABLE userBomb(
  
  c_nick_name VARCHAR(50) NOT NULL,
  c_bomb_name VARCHAR(50) NOT NULL
);

CREATE TABLE userShip(

  c_ship_name VARCHAR(50) NOT NULL,
  c_nick_name VARCHAR(50) NOT NULL
);

CREATE TABLE bomb(

  c_bomb_name VARCHAR(50) NOT NULL,
  c_description TEXT,
  c_power INT(2) UNSIGNED DEFAULT 1,
  c_price INT(2) UNSIGNED,
  c_imagen LONGBLOB, 
  PRIMARY KEY(c_bomb_name)
) ENGINE = InnoDB;

CREATE TABLE ship (
  c_ship_name VARCHAR(50) NOT NULL,
  c_description TEXT,
  c_hardness INT(1) UNSIGNED DEFAULT 1,
  c_price INT(2) UNSIGNED,
  c_imagen LONGBLOB,
  PRIMARY KEY(c_ship_name)
) ENGINE = InnoDB;


#Inserting ships and bombs data. This is for the store.

#INSERT INTO bomb VALUES()opt