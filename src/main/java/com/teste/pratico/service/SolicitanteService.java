package com.teste.pratico.service;

import com.teste.pratico.dto.SolicitanteDTO;
import com.teste.pratico.model.Solicitante;
import com.teste.pratico.repository.SolicitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SolicitanteService {

    private final SolicitanteRepository solicitanteRepository;

    public SolicitanteService(SolicitanteRepository solicitanteRepository) {
        this.solicitanteRepository = solicitanteRepository;
    }

    public Solicitante transformarParaEntidade(SolicitanteDTO solicitanteDTO) {
        return new Solicitante(
                solicitanteDTO.getId(),
                solicitanteDTO.getNome()
        );
    }

    public List<SolicitanteDTO> listarSolicitantesComEstatisticas() {
        return solicitanteRepository.findAll()
                .stream()
                .map(solicitante -> new SolicitanteDTO(
                        solicitante.getId(),
                        solicitante.getNome()))
                .collect(Collectors.toList());
    }

    public List<Solicitante> listarSolicitantes() {
        return solicitanteRepository.findAll();
    }    

    public Solicitante salvarSolicitante(Solicitante solicitante) {
        return solicitanteRepository.save(solicitante);
    }
    
}
