package com.teste.pratico.dto;

public class SolicitanteDTO {
    private Long id;
    private String nome;

    public SolicitanteDTO() {}

    public SolicitanteDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
