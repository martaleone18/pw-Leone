/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  marta
 * Created: 11 mag 2020
 */

CREATE TABLE user (id BIGINT AUTO_INCREMENT NOT NULL, birth_date DATE, created_by VARCHAR(255), created_on DATETIME(3), deleted TINYINT(1) default 0, fname VARCHAR(255) NOT NULL, lname VARCHAR(255) NOT NULL, modified_by VARCHAR(255), modified_on DATETIME(3), pwd VARCHAR(255) NOT NULL, usr VARCHAR(255) NOT NULL UNIQUE, version BIGINT, PRIMARY KEY (id));
