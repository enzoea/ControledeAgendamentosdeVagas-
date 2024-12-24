package com.teste.pratico.dto;

public class AgendamentoEstatisticasDTO {

    private String solicitante;
    private long totalAgendamentos;
    private int totalVagas;
    private double percentualOcupacao;

    public AgendamentoEstatisticasDTO() {
    }

    public AgendamentoEstatisticasDTO(String solicitante, long totalAgendamentos, int totalVagas, double percentualOcupacao) {
        this.solicitante = solicitante;
        this.totalAgendamentos = totalAgendamentos;
        this.totalVagas = totalVagas;
        this.percentualOcupacao = percentualOcupacao;
    }

    // Getters e Setters
    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public long getTotalAgendamentos() {
        return totalAgendamentos;
    }

    public void setTotalAgendamentos(long totalAgendamentos) {
        this.totalAgendamentos = totalAgendamentos;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public double getPercentualOcupacao() {
        return percentualOcupacao;
    }

    public void setPercentualOcupacao(double percentualOcupacao) {
        this.percentualOcupacao = percentualOcupacao;
    }
}