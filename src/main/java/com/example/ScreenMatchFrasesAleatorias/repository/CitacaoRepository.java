package com.example.ScreenMatchFrasesAleatorias.repository;

import com.example.ScreenMatchFrasesAleatorias.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CitacaoRepository extends JpaRepository<Citacao, Long> {
    @Query("SELECT c FROM Citacao c ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Citacao buscaCitacaoAleatorio();
}
