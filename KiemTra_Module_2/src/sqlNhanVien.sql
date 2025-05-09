create database employee;

use employee;

CREATE TABLE Table_employee (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(50),
                          age INT,
                          salary DOUBLE,
                          type VARCHAR(20)
);
CREATE TABLE Manager (
                         id INT PRIMARY KEY,
                         department VARCHAR(100),
                         FOREIGN KEY (id) REFERENCES table_employee(id)
);