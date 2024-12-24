package com.teste.pratico.beans;

import com.teste.pratico.dto.AgendamentoDTO;
import com.teste.pratico.service.AgendamentoService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.time.LocalDateTime;
import java.util.List;

@Named
@RequestScoped
public class AgendamentoBean {

    @Inject
    private AgendamentoService agendamentoService;

    private List<AgendamentoDTO> agendamentos;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String nomeSolicitante;

    public void listarAgendamentos() {
        this.agendamentos = agendamentoService.listarAgendamentos(dataInicio, dataFim, nomeSolicitante);
    }

    public List<AgendamentoDTO> getAgendamentos() {
        return agendamentos;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }
}