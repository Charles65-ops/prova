package com.charada.prova.dtos;

import com.charada.prova.enums.Classificacao;
import java.time.LocalDate;

public class MovimentoDTO {

    private Long id;
    private LocalDate dataMovimento;
    private double valor;
    private Classificacao classificacao;
    private String observacao;

    public MovimentoDTO() {
    }

    public LocalDate getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDate dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public MovimentoDTO(Long id,LocalDate dataMovimento, double valor, Classificacao classificacao, String observacao) {
        this.id = id;
        this.dataMovimento = dataMovimento;
        this.valor = valor;
        this.classificacao = classificacao;
        this.observacao = observacao;
    }


}
