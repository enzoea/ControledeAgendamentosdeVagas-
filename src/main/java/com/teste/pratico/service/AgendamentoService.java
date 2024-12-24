package com.teste.pratico.service;

import com.teste.pratico.dto.AgendamentoDTO;
import com.teste.pratico.model.Agendamento;
import com.teste.pratico.model.Solicitante;
import com.teste.pratico.repository.AgendamentoRepository;
import com.teste.pratico.repository.SolicitanteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final SolicitanteRepository solicitanteRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository, SolicitanteRepository solicitanteRepository) {
        this.agendamentoRepository = agendamentoRepository;
        this.solicitanteRepository = solicitanteRepository;
    }

    public List<AgendamentoDTO> listarAgendamentos(LocalDateTime inicio, LocalDateTime fim, String nomeSolicitante) {
        Solicitante solicitante = solicitanteRepository.findByNome(nomeSolicitante);
        if (solicitante == null) {
            throw new IllegalArgumentException("Solicitante com o nome '" + nomeSolicitante + "' não foi encontrado.");
        }
        return agendamentoRepository
                .findByDataBetweenAndSolicitante(inicio, fim, solicitante)
                .stream()
                .map(agendamento -> new AgendamentoDTO(
                        agendamento.getId(),
                        agendamento.getData(),
                        agendamento.getNumero(),
                        agendamento.getMotivo(),
                        agendamento.getSolicitante().getId()))
                .collect(Collectors.toList());
    }

    public Agendamento salvarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }
}
