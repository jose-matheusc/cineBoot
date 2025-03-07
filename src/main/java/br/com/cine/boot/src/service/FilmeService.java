package br.com.cine.boot.src.service;

import br.com.cine.boot.src.model.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();
    private Long idCounter = 1L; // Para gerar IDs únicos

    //Adicionar um filme
    public void adicionarFilme(Filme filme) {
        filme.setId(idCounter++); // Definir um ID único para cada filme
        filmes.add(filme);
        System.out.println("Filme adicionado com sucesso: " + filme.getTitulo());
    }

    //remover um filme
    public boolean removerFilme(Long id) {
        return filmes.removeIf(filme -> filme.getId().equals(id));
    }

    //Editar um filme
    public boolean editarFilme(Long id, Filme novoFilme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getId().equals(id)) {
                filmes.set(i, novoFilme);
                novoFilme.setId(id); // Mantém o mesmo ID
                System.out.println("Filme atualizado: " + novoFilme.getTitulo());
                return true;
            }
        }
        return false;
    }

    // Listar os filmes
    public List<Filme> listarFilmes() {
        return filmes;
    }

    // Buscar um filme pelo ID
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
