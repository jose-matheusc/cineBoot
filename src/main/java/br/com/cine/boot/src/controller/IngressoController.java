package br.com.cine.boot.src.controller;

import br.com.cine.boot.src.dao.IngressoDAO;
import br.com.cine.boot.src.service.IngressosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingresso")
public class IngressoController {

    @Autowired
    private IngressosService ingressosService;

    @PostMapping("/adicionar")
    public void adicionarIngresso(@RequestBody IngressoDAO ingressoDAO) {
        try {
            ingressosService.adicionarIngressoNoBanco(ingressoDAO);
        }catch (Exception e) {
            System.out.println("Erro ao adicionar ingresso: " + e.getMessage());
        }
    }

}
