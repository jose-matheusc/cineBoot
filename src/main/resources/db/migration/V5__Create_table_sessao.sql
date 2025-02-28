CREATE TABLE Sessao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    filme_id BIGINT NOT NULL,
    sala_id BIGINT NOT NULL,
    horario TIME NOT NULL,
    preco DOUBLE NOT NULL,
    lugares_disponiveis INT NOT NULL,
    FOREIGN KEY (filme_id) REFERENCES Filme(id),
    FOREIGN KEY (sala_id) REFERENCES Sala(id)
);
