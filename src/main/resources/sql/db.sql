CREATE DATABASE userdb;
USE userdb;

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       google_id VARCHAR(255) UNIQUE,
                       first_name VARCHAR(50),
                       last_name VARCHAR(50),
                       password VARCHAR(100)
);