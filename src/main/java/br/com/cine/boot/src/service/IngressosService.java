package br.com.cine.boot.src.service;

import br.com.cine.boot.src.dao.IngressoDAO;
import br.com.cine.boot.src.model.Ingresso;
import br.com.cine.boot.src.repository.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngressosService {

    @Autowired
    private IngressoRepository ingressoRepository;

    public void adicionarIngressoNoBanco(IngressoDAO ingressoDAO) {
        try {
            Ingresso ingresso = new Ingresso();
            ingresso.setAssento(ingressoDAO.getAssento());
            ingresso.setPrecoFinal(ingressoDAO.getPrecoFinal());
            ingresso.setClienteId(ingressoDAO.getClienteId());
            ingresso.setPessoaId(ingressoDAO.getPessoaId());
            ingresso.setSessaoId(ingressoDAO.getSessaoId());

            ingressoRepository.save(ingresso);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar ingresso: " + e.getMessage());
        }
    }

}
