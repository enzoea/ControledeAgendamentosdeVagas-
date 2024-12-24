package com.teste.pratico.dto;

import java.time.LocalDateTime;

public class VagaDTO {
    private Long id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Integer quantidade;

    public VagaDTO() {
    }

    public VagaDTO(Long id, LocalDateTime inicio, LocalDateTime fim, Integer quantidade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
