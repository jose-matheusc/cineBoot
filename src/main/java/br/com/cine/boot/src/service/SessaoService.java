package br.com.cine.boot.src.service;

import br.com.cine.boot.src.model.Sessao;
import br.com.cine.boot.src.model.Filme;
import br.com.cine.boot.src.model.Sala;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SessaoService {
    private List<Sessao> sessoes = new ArrayList<>();
    private Long idCounter = 1L;


    public void adicionarSessao(Sessao sessao) {
        sessao.setId(idCounter++);
        sessoes.add(sessao);
        System.out.println("Sessão adicionada com sucesso para o filme: " + sessao.getFilme().getTitulo());
    }


    public boolean removerSessao(Long id) {
        return sessoes.removeIf(sessao -> sessao.getId().equals(id));
    }


    public List<Sessao> buscarSessoesPorFilme(Filme filme) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getFilme().equals(filme)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }


    public List<Sessao> buscarSessoesPorSala(Sala sala) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getSala().equals(sala)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }


    public List<Sessao> buscarSessoesPorHorario(LocalTime horario) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getHorario().equals(horario)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }


    public boolean atualizarSessao(Long id, LocalTime novoHorario, double novoPreco, int novosLugares) {
        for (Sessao sessao : sessoes) {
            if (sessao.getId().equals(id)) {
                sessao.setHorario(novoHorario);
                sessao.setPreco(novoPreco);
                sessao.setLugaresDisponiveis(novosLugares);
                System.out.println("Sessão atualizada com sucesso!");
                return true;
            }
        }
        return false;
    }


    public List<Sessao> listarSessoes() {
        return sessoes;
    }


    public boolean venderIngresso(Long sessaoId) {
        for (Sessao sessao : sessoes) {
            if (sessao.getId().equals(sessaoId) && sessao.getLugaresDisponiveis() > 0) {
                sessao.setLugaresDisponiveis(sessao.getLugaresDisponiveis() - 1);
                System.out.println("Ingresso vendido para a sessão do filme: " + sessao.getFilme().getTitulo());
                return true;
            }
        }
        System.out.println("Não há mais lugares disponíveis para essa sessão.");
        return false;
    }
}
