package com.teste.pratico.beans;

import com.teste.pratico.dto.SolicitanteDTO;
import com.teste.pratico.service.SolicitanteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class SolicitanteBean {

    private SolicitanteService solicitanteService;

    private List<SolicitanteDTO> solicitantes;

    public SolicitanteBean(SolicitanteService solicitanteService) {
        this.solicitanteService = solicitanteService;
    }

    public void listarSolicitantes() {
        this.solicitantes = solicitanteService.listarSolicitantesComEstatisticas();
    }

    public List<SolicitanteDTO> getSolicitantes() {
        return solicitantes;
    }
}
