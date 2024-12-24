package com.teste.pratico.dto;

import java.time.LocalDateTime;

public class AgendamentoDTO {
    private Long id;
    private LocalDateTime data;
    private String numero;
    private String motivo;
    private Long solicitanteId;
    private Long vagaId;

    public AgendamentoDTO() {}

    public AgendamentoDTO(Long id, LocalDateTime data, String numero, String motivo, Long solicitanteId) {
        this.id = id;
        this.data = data;
        this.numero = numero;
        this.motivo = motivo;
        this.solicitanteId = solicitanteId;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Long getSolicitanteId() {
        return solicitanteId;
    }

    public void setSolicitanteId(Long solicitanteId) {
        this.solicitanteId = solicitanteId;
    }

    public Long getVagaId() {
        return vagaId;
    }

    public void setVagaId(Long vagaId) {
        this.vagaId = vagaId;
    }
}
