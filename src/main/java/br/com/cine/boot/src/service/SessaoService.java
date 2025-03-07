package br.com.cine.boot.src.service;

import br.com.cine.boot.src.model.Sessao;
import br.com.cine.boot.src.model.Filme;
import br.com.cine.boot.src.model.Sala;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SessaoService {
    private List<Sessao> sessoes = new ArrayList<>();
    private Long idCounter = 1L; // Para gerar IDs únicos

    // Criar uma nova sessão
    public void adicionarSessao(Sessao sessao) {
        sessao.setId(idCounter++);
        sessoes.add(sessao);
        System.out.println("Sessão adicionada com sucesso para o filme: " + sessao.getFilme().getTitulo());
    }

    // Remover sessão pelo ID
    public boolean removerSessao(Long id) {
        return sessoes.removeIf(sessao -> sessao.getId().equals(id));
    }

    // Buscar sessões por filme
    public List<Sessao> buscarSessoesPorFilme(Filme filme) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getFilme().equals(filme)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }

    // Buscar sessões por sala
    public List<Sessao> buscarSessoesPorSala(Sala sala) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getSala().equals(sala)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }

    // Buscar sessões por horário
    public List<Sessao> buscarSessoesPorHorario(LocalTime horario) {
        List<Sessao> resultado = new ArrayList<>();
        for (Sessao sessao : sessoes) {
            if (sessao.getHorario().equals(horario)) {
                resultado.add(sessao);
            }
        }
        return resultado;
    }

    // Atualizar sessão (horário, preço, lugares disponíveis)
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

    // Listar todas as sessões
    public List<Sessao> listarSessoes() {
        return sessoes;
    }

    // Reduzir lugares disponíveis ao vender ingresso
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
