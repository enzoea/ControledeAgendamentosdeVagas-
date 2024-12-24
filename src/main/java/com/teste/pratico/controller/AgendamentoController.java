package com.teste.pratico.controller;

import com.teste.pratico.dto.AgendamentoDTO;
import com.teste.pratico.service.AgendamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoDTO>> listarAgendamentos(
            @RequestParam String inicio,
            @RequestParam String fim,
            @RequestParam String solicitante) {
        return ResponseEntity.ok(agendamentoService.listarAgendamentos(
                LocalDateTime.parse(inicio),
                LocalDateTime.parse(fim),
                solicitante
        ));
    }
}
