package br.com.cine.boot.src.model;

import br.com.cine.boot.src.model.Pessoa;

public class Filme {
    private Long id;
    private Pessoa pessoa;
    private String titulo;
    private String genero;
    private int classificacaoIndicativa;
    private int duracao;
    private String sinopse;

    public Filme(br.com.cine.boot.src.model.Pessoa pessoa, String titulo, String genero, String sinopse, int classificacaoIndicativa, int duracao) {
        this.pessoa = pessoa;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.duracao = duracao;
        this.sinopse = sinopse;
    }

    public br.com.cine.boot.src.model.Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
