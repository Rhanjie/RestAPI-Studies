INSERT INTO `type` (`name`, `weight`) VALUES
    ('Rower', '5.00'),
    ('Hulajnoga', '2.00'),
    ('HulajnogaE', '4.00'),
    ('Deskorolka', '0.50');

INSERT INTO `user` (`name`, `surname`, `pesel`) VALUES
    ('Andrew', 'Golota', 123456789),
    ('Narcin', 'Majman', 987654321),
    ('Jan', 'Kowalski', 123987456),
    ('Anna', 'Janak', 98765432),
    ('Harry', 'Potter', 934934934),
    ('Kamil', 'Ślimak', 12343210),
    ('Edyta', 'Kopacz', 321578932),
    ('Stefan', 'Praca', 93215623),
    ('Krzysztof', 'Jarzyna', 123456789),
    ('Hugh', 'Jackman', 628496496);

INSERT INTO `payment` ( `id_user`, `name`, `borrowDate`, `expirationDate`) VALUES
    (1, 'PRower', '2020-02-02 12:32:00', '2020-02-04 00:00:00'),
    (2, 'PHulajnoga', '2020-03-02 04:10:40', '2020-03-03 00:00:00'),
    (1, 'PRower', '2020-02-04 01:05:12', '2020-02-05 00:00:00'),
    (3, 'PDeskorolka', '2020-02-20 00:32:24', '2020-02-26 00:00:00'),
    (3, 'PHulajnoga', '2020-02-24 04:51:00', '2020-02-25 00:00:00'),
    (2, 'PHulajnogaE', '2020-03-03 00:12:00', '2020-03-04 00:00:00'),
    (1, 'PHulajnoga', '2020-03-04 05:00:00', '2020-03-04 23:59:59'),
    (4, 'PRower', '2020-04-05 00:32:00', '2020-04-06 00:00:00'),
    (4, 'PRower', '2020-04-05 11:12:00', '2020-04-05 00:00:00'),
    (5, 'PRower', '2020-04-06 00:43:00', '2020-04-07 00:00:00'),
    (6, 'PRower', '2020-04-07 22:50:00', '2020-04-08 00:00:00'),
    (7, 'PHulajnoga', '2020-04-07 15:50:20', '2020-04-08 00:00:00'),
    (8, 'PHulajnogaE', '2020-05-03 04:00:05', '2020-05-04 00:00:00'),
    (9, 'PDeskorolka', '2020-05-20 12:00:02', '2020-05-21 00:00:00'),
    (10, 'PRower', '2020-06-01 11:05:45', '2020-06-01 23:59:59');

INSERT INTO `equipment` (`id_type`, `model`, `producer`, `maximumLoad`, `weight`, `range`, `batteryCapacity`) VALUES
    (1, 'Wigry', 'Romet', 90, '5.00', null, null),
    (1, 'Art', 'Romet', 90, '5.00', null, null),
    (4, 'Classic', 'Enuff', 80, '0.50', null, null),
    (4, 'Stage', 'Birdhouse', 80, '0.50', null, null),
    (3, 'Stout', 'Frugal', 100, '4.00', '25', '250'),
    (2, 'Town 7', 'Oxelo', 100, '2.00', null, null),
    (2, 'Town 9', 'Oxelo', 100, '2.00', null, null);
