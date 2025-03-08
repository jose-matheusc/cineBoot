package br.com.cine.boot.src.model;

import jakarta.persistence.*;

@Entity
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private int numeroDaSala;
    private int Capacidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sala(int numeroDaSala, int Capacidade) {
        this.numeroDaSala = numeroDaSala;
        this.Capacidade = Capacidade;
    }

    public Sala() {

    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }
}
