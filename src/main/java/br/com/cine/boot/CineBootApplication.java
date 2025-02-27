package br.com.cine.boot;

import br.com.cine.boot.src.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineBootApplication {

	public static void main(String[] args) {
		Pessoa teste = new Pessoa("aecio", 21, "71361411414", "aeciojunior45@gmail.com");
		SpringApplication.run(CineBootApplication.class, args);
		System.out.println(teste);
	}

}
