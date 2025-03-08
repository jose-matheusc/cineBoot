package br.com.cine.boot.src.repository;

import br.com.cine.boot.src.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
}
