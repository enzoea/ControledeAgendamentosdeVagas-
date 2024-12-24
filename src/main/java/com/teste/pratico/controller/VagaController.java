package com.teste.pratico.controller;

import com.teste.pratico.dto.VagaDTO;
import com.teste.pratico.model.Vaga;
import com.teste.pratico.service.VagaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private final VagaService vagaService;

    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @PostMapping
    public ResponseEntity<Vaga> criarVaga(@RequestBody VagaDTO vagaDTO) {
        Vaga vaga = vagaService.transformarParaEntidade(vagaDTO);
        return ResponseEntity.ok(vagaService.salvarVaga(vaga));
    }

    @GetMapping
    public ResponseEntity<List<VagaDTO>> listarVagas() {
        return ResponseEntity.ok(vagaService.listarVagasDTO());
    }
}
