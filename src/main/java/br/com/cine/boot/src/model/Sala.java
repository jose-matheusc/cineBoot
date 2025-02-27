package br.com.cine.boot.src.model;

public class Sala {
    private Long id;
    private int numeroDaSala;
    private int Capacidade;

    public Sala(int numeroDaSala, int Capacidade) {
        this.numeroDaSala = numeroDaSala;
        this.Capacidade = Capacidade;
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
