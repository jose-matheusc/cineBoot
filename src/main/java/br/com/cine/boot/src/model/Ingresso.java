package br.com.cine.boot.src.model;

public class Ingresso {
    private Pessoa pessoa;
    private Sessao sessao;
    private String assento;
    private double precoFinal;

    public Ingresso(Pessoa pessoa, Sessao sessao, String assento, double precoFinal) {
        this.pessoa = pessoa;
        this.sessao = sessao;
        this.assento = assento;
        this.precoFinal = precoFinal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }


    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
