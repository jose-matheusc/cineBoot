package br.com.cine.boot.src.service;

import br.com.cine.boot.src.model.Cliente;
import br.com.cine.boot.src.model.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();
    private Long idCounter = 1L;


    public void adicionarFilme(Filme filme) {
        filme.setId(idCounter++);
        filmes.add(filme);
        System.out.println("Filme adicionado com sucesso: " + filme.getTitulo());
    }

    public boolean removerFilme(Long id) {
        return filmes.removeIf(filme -> filme.getId().equals(id));
    }


    public boolean editarFilme(Long id, Filme novoFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getId().equals(id)) {
                filmes.set(i, novoFilme);
                novoFilme.setId(id);
                System.out.println("Filme atualizado: " + novoFilme.getTitulo());
                return true;
            }
        }
        return false;
    }


    public List<Filme> listarFilmes() {
        return filmes;
    }


    public Filme buscarFilmePorId(Long id) {
        for (Filme filme : filmes) {
            if (filme.getId().equals(id)) {
                return filme;
            }
        }
        return null;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Long getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(Long idCounter) {
        this.idCounter = idCounter;
    }
}
