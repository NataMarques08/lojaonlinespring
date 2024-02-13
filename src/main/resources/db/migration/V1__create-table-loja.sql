CREATE TABLE loja (
    id BINARY(16) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(19,2) NOT NULL,
    code VARCHAR(255) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    quantidade INT NOT NULL,
    ativo BOOLEAN NOT NULL
);
