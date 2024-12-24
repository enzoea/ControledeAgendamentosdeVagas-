package com.teste.pratico.service;

import com.teste.pratico.dto.VagaDTO;
import com.teste.pratico.model.Vaga;
import com.teste.pratico.repository.VagaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Vaga transformarParaEntidade(VagaDTO vagaDTO) {
        return new Vaga(
                vagaDTO.getId(),
                vagaDTO.getInicio(),
                vagaDTO.getFim(),
                vagaDTO.getQuantidade()
        );
    }

    public List<VagaDTO> listarVagasDTO() {
        return vagaRepository.findAll()
                .stream()
                .map(vaga -> new VagaDTO(
                        vaga.getId(),
                        vaga.getInicio(),
                        vaga.getFim(),
                        vaga.getQuantidade()))
                .collect(Collectors.toList());
    }

    public List<Vaga> listarVagas() {
        return vagaRepository.findAll();
    }    

    public Vaga salvarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }
    
}
