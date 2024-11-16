package com.example.ScreenMatchFrasesAleatorias.service;

import com.example.ScreenMatchFrasesAleatorias.dto.CitacaoDTO;
import com.example.ScreenMatchFrasesAleatorias.model.Citacao;
import com.example.ScreenMatchFrasesAleatorias.repository.CitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CitacaoService {
    @Autowired
    private CitacaoRepository citacaoRepository;

    public CitacaoDTO getFraseAleatoria() {
        Citacao citacao = citacaoRepository.buscaCitacaoAleatorio();
        return new CitacaoDTO(
                citacao.getTitulo(),
                citacao.getFrase(),
                citacao.getPersonagem(),
                citacao.getPoster()
        );
    }
}
