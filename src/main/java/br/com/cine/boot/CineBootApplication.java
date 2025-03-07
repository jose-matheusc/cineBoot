package br.com.cine.boot;

import br.com.cine.boot.src.model.Filme;
import br.com.cine.boot.src.service.FilmeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CineBootApplication.class, args);
		FilmeService filmeService = new FilmeService();

		// Criando alguns filmes
		Filme filme1 = new Filme(null, "Matrix", "Ficção Científica", "Um hacker descobre a verdade sobre a realidade", 14, 136);
		Filme filme2 = new Filme(null, "Vingadores", "Ação", "Heróis se unem para salvar o mundo", 12, 143);

		// Adicionando filmes
		filmeService.adicionarFilme(filme1);
		filmeService.adicionarFilme(filme2);

		// Listando filmes
		System.out.println("Lista de filmes:");
		for (Filme f : filmeService.listarFilmes()) {
			System.out.println(f.getTitulo());
		}

		// Editando um filme
		Filme novoFilme = new Filme(null, "Matrix Reloaded", "Ficção Científica", "Continuação de Matrix", 14, 138);
		filmeService.editarFilme(1L, novoFilme);

		// Removendo um filme
		filmeService.removerFilme(2L);
	}

}
