package com.teste.pratico.repository;

import com.teste.pratico.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    long countByInicioLessThanEqualAndFimGreaterThanEqual(LocalDateTime inicio, LocalDateTime fim);
}
