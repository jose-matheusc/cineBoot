CREATE TABLE Filme (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pessoa_id BIGINT,
    titulo VARCHAR(255) NOT NULL,
    genero VARCHAR(50),
    classificacao_indicativa INT,
    duracao INT,
    sinopse TEXT
);
