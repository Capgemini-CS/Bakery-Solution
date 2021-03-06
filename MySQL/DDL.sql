CREATE TABLE IF NOT EXISTS Areas (
area_id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
code VARCHAR(10) NOT NULL,
name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Regions (
region_id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
code VARCHAR(10) NOT NULL,
name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Shops (
shop_id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
division VARCHAR(10) NOT NULL,
area VARCHAR(50) NOT NULL,
region VARCHAR(50) NOT NULL,
CHECK ((division='Hyper') OR (division='Super'))
);

