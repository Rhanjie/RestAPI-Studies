CREATE TABLE `user` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `name` varchar(20) DEFAULT NULL,
    `surname` varchar(20) DEFAULT NULL,
    `pesel` int(11) DEFAULT NULL
);

CREATE TABLE `payment` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `id_user` INTEGER NOT NULL,
    `name` varchar(20) DEFAULT NULL,
    `borrowDate` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `expirationDate` DATETIME NOT NULL,
    FOREIGN KEY (id_user) REFERENCES user(id)
);

CREATE TABLE `type` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `name` varchar(10) DEFAULT NULL,
    `weight` decimal(3,2) DEFAULT NULL
);

CREATE TABLE `equipment` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `id_type` INTEGER NOT NULL,
    `model` varchar(7) DEFAULT NULL,
    `producer` varchar(9) DEFAULT NULL,
    `maximumLoad` smallint(6) DEFAULT NULL,
    `weight` decimal(3,2) DEFAULT NULL,
    `range` varchar(2) DEFAULT NULL,
    `batteryCapacity` varchar(3) DEFAULT NULL,
    FOREIGN KEY (id_type) REFERENCES type(id)
);