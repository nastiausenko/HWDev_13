INSERT INTO client (name) VALUES
('John'),
('Sam'),
('Anne'),
('Kate'),
('Alex'),
('Bob'),
('Mary'),
('Luke'),
('Emily'),
('James');

INSERT INTO planet (id, name) VALUES
('MARS', 'Mars'),
('SAT', 'Saturn'),
('JUP', 'Jupiter'),
('URAN', 'Uranus'),
('EAR', 'Earth');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
(1, 'MARS', 'JUP'),
(2, 'SAT', 'EAR'),
(3, 'JUP', 'URAN'),
(4, 'URAN', 'MARS'),
(5, 'EAR', 'SAT'),
(6, 'MARS', 'EAR'),
(7, 'SAT', 'JUP'),
(8, 'JUP', 'MARS'),
(9, 'URAN', 'SAT'),
(10, 'EAR', 'URAN');