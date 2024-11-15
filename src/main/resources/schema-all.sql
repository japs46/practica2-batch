DROP TABLE persona IF EXISTS;

CREATE TABLE persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20),
    apellido VARCHAR(20),
    telefono VARCHAR(10)
);