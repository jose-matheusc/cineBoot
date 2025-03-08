package br.com.cine.boot.src.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalTime;

@Entity
public class Sessao {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;
    @ManyToOne
    @JoinColumn(name = "sala_id")
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

    public Sessao() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
