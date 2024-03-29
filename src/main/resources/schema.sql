CREATE TABLE `genre` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `name` varchar(25) DEFAULT NULL,
    `only_for_adults` BOOL DEFAULT FALSE
);

CREATE TABLE `book` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `id_genre` INTEGER NOT NULL,
    `title` varchar(50) DEFAULT NULL,
    `author` varchar(40) DEFAULT NULL,
    `publisher` varchar(40) DEFAULT NULL,
    `year` smallint(4) DEFAULT NULL,
    `condition` varchar(25) DEFAULT NULL,
    FOREIGN KEY (id_genre) REFERENCES genre(id)
);

CREATE TABLE `user` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `name` varchar(20) DEFAULT NULL,
    `surname` varchar(20) DEFAULT NULL,
    `pesel` int(11) DEFAULT NULL,
    `age` smallint(3) DEFAULT NULL
);

CREATE TABLE `payment` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `id_user` INTEGER NOT NULL,
    `id_book` INTEGER NOT NULL,
    `borrow_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `expiration_date` DATETIME NOT NULL,
    FOREIGN KEY (id_user) REFERENCES user(id),
    FOREIGN KEY (id_book) REFERENCES book(id)
);