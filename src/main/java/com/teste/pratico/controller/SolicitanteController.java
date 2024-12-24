package com.teste.pratico.controller;

import com.teste.pratico.dto.SolicitanteDTO;
import com.teste.pratico.model.Solicitante;
import com.teste.pratico.service.SolicitanteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitantes")
public class SolicitanteController {

    private final SolicitanteService solicitanteService;

    public SolicitanteController(SolicitanteService solicitanteService) {
        this.solicitanteService = solicitanteService;
    }

    @PostMapping
    public ResponseEntity<Solicitante> criarSolicitante(@RequestBody SolicitanteDTO solicitanteDTO) {
        Solicitante solicitante = solicitanteService.transformarParaEntidade(solicitanteDTO);
        return ResponseEntity.ok(solicitanteService.salvarSolicitante(solicitante));
    }


    @GetMapping
    public ResponseEntity<List<SolicitanteDTO>> listarSolicitantesComEstatisticas() {
        return ResponseEntity.ok(solicitanteService.listarSolicitantesComEstatisticas());
    }
}