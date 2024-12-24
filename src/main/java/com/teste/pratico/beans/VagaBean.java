package com.teste.pratico.beans;

import com.teste.pratico.dto.VagaDTO;
import com.teste.pratico.service.VagaService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class VagaBean {

    private VagaService vagaService;

    private List<VagaDTO> vagas;

    public VagaBean(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    public void listarVagas() {
        this.vagas = vagaService.listarVagasDTO();
    }

    public List<VagaDTO> getVagas() {
        return vagas;
    }
}