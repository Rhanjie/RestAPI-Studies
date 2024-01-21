INSERT INTO `genre` (`name`, `only_for_adults`) VALUES
    ('Romanse', False),
    ('Historyczne', False),
    ('Horror', True),
    ('Biografia', False),
    ('Mlodziezowe', False),
    ('Dzieciece', False),
    ('Kucharskie', False),
    ('Poradniki', False),
    ('Fantasy', False);

INSERT INTO `user` (`name`, `surname`, `pesel`, `age`) VALUES
    ('Andrew', 'Golota', 123456789, 44),
    ('Narcin', 'Majman', 987654321, 40),
    ('Jan', 'Kowalski', 123987456, 22),
    ('Anna', 'Janak', 98765432, 16),
    ('Harry', 'Potter', 934934934, 17),
    ('Mateusz', 'Kopytko', 93215623, 21),
    ('Krzysztof', 'Jarzyna', 123456789, 13),
    ('Hugh', 'Jackman', 628496496, 23);

INSERT INTO `book` (`id_genre`, `title`, `author`, `publisher`, `year`, `condition`) VALUES
    (9, 'Venom. W otchłani chaosu. Tom 2', 'Aleksandra Kondraciuk', 'NieZwykłe', 2024, 'nowa'),
    (5, 'Harry Potter i Kamień Filozoficzny', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (5, 'Harry Potter i Komnata Tajemnic', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (5, 'Harry Potter i więzień Azkabanu', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (5, 'Harry Potter i Czara Ognia', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (5, 'Harry Potter i Zakon Feniksa', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (5, 'Harry Potter i Książę Półkrwi', 'J.K. Rowling', 'Media Rodzina', 2016, 'nowa'),
    (6, 'Dzieci z Bullerbyn', 'Astrid Lindgren', 'Nasza Księgarnia', 2016, 'DOBRY'),
    (1, 'Cztery pory roku', 'Stephen King', 'Albatros', 2023, 'DOBRY'),
    (3, 'Smętarz dla zwierzaków', 'Stephen King', 'Prószyński i S-ka', 2019, 'DOSTATECZNY'),
    (8, 'Chłopki. Opowiesc o naszych babkach', 'Joanna Kuciel-Frydryszak', 'Marginesy', 2023,'DOBRY'),
    (1, 'I Wanna Fall. Bright Side', 'Aleksandra Nill', 'Mag', 2023,'DOBRY'),
    (8, 'Glukozowa rewolucja', 'Jessie Inchauspe', 'Marginesy', 2023,'DOBRY'),
    (9, 'Operacja Mir', 'Remigiusz Mroz', 'Filia', 2024,'IDEALNY'),
    (9, 'Eragon', 'Christopher Paolini', 'Mag', 2019,'DOSTATECZNY');

INSERT INTO `payment` ( `id_user`, `id_book`, `borrow_date`, `expiration_date`) VALUES
    (4, 4, '2023-10-02 12:32:00', '2023-11-04 00:00:00'),
    (4, 15, '2023-10-02 12:32:00', '2023-11-04 00:00:00'),
    (2, 13, '2024-02-02 12:32:00', '2024-05-25 00:00:00'),
    (1, 12, '2024-03-02 04:10:40', '2024-03-03 00:00:00'),
    (2, 11, '2024-01-04 01:05:12', '2024-02-05 00:00:00'),
    (7, 14, '2024-05-20 00:32:24', '2024-06-26 00:00:00'),
    (6, 2, '2024-02-24 04:51:00', '2024-04-25 00:00:00'),
    (6, 3, '2024-03-03 00:12:00', '2024-03-04 00:00:00'),
    (3, 1, '2024-03-04 05:00:00', '2024-03-04 00:00:00'),
    (2, 15, '2024-04-05 00:32:00', '2024-04-06 00:00:00'),
    (1, 9, '2024-04-12 11:12:00', '2024-04-14 00:00:00'),
    (5, 15, '2024-04-06 00:43:00', '2024-04-07 00:00:00'),
    (4, 10, '2024-04-07 22:50:00', '2024-04-08 00:00:00'),
    (1, 7, '2024-05-03 04:00:05', '2024-05-04 00:00:00'),
    (1, 8, '2024-05-20 12:00:02', '2024-05-21 00:00:00'),
    (5, 1, '2024-06-01 11:05:45', '2024-06-01 00:00:00');


