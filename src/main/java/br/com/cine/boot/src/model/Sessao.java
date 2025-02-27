package br.com.cine.boot.src.model;

import java.time.LocalTime;

public class Sessao {
    private Long id;
    private Filme filme;
    private Sala sala;
    private LocalTime horario;
    private double preco;
    private int lugaresDisponiveis;

    public Sessao(Filme filme, Sala sala, LocalTime horario, double preco, int lugaresDisponiveis) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.preco = preco;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void setLugaresDisponiveis(int lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }
}
