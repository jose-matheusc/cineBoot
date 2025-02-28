CREATE TABLE Ingresso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pessoa_id BIGINT NOT NULL,
    sessao_id BIGINT NOT NULL,
    assento VARCHAR(10) NOT NULL,
    preco_final DOUBLE NOT NULL,
    FOREIGN KEY (pessoa_id) REFERENCES Pessoa(id),
    FOREIGN KEY (sessao_id) REFERENCES Sessao(id)
);
