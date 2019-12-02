<changeSet id="1" author="Larin">
    <sqlFile dbms="hsqldb" path="src/main/resources/db/changelog/insertScript v1.sql" />
</changeSet>
INSERT INTO COLOR
VALUES (1, 'Green', 35000, 0), 
(1, 'Yellow', 35000, 0), 
(2, 'Black', 42000, 0), 
(3, 'Red', 42000, 0), 
(4, 'Orange', 45000, 0);

INSERT INTO Engine 
VALUES (1, '35 TFSI S tronic', 100000, 0, 190, 8,2), 
(2, '45 TFSI S tronic', 250000, 0, 249, 7,4), 
(3, '55 TFSI quattro tiptronic', 700000, 0, 333, 9,5), 
(4, '55 TFSI quattro tiptronic', 100000, 0, 340, 8,2), 
(5, 'Design 45 TFSI quattro S tronic', 655000, 0, 245, 6); 


INSERT INTO DictOrderStatus 
VALUES (1, 'in the process'), 
(2, 'confirmed'), 
(3, 'paid'), 
(4, 'delivered'); 


INSERT INTO DictCarcass 
VALUES (1, 'Sedan'), 
(2, 'Coupe'), 
(3, 'Sportback'), 
(4, 'SUV')