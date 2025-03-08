CREATE TABLE Ingresso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT,
    pessoa_id BIGINT NOT NULL,
    sessao_id BIGINT NOT NULL,
    assento VARCHAR(10) NOT NULL,
    preco_final DOUBLE NOT NULL
);
