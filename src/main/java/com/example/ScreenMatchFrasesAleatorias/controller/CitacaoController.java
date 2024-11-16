package com.example.ScreenMatchFrasesAleatorias.controller;

import com.example.ScreenMatchFrasesAleatorias.dto.CitacaoDTO;
import com.example.ScreenMatchFrasesAleatorias.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class CitacaoController {

    @Autowired
    private CitacaoService citacaoService;
    @GetMapping("/frases")
    private CitacaoDTO frases() {
        return citacaoService.getFraseAleatoria();
    }
}
