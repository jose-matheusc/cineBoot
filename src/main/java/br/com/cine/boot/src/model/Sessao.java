package br.com.cine.boot.src.model;

import java.time.LocalTime;

public class Sessao {
    Filme filme;
    int sala;
    LocalTime horario;
    double preco;
    int lugaresDisponiveis;

    public Sessao(Filme filme, int Sala, LocalTime horario, double preco, int lugaresDisponiveis) {
        this.filme = filme;
        this.sala = Sala;
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

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
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
