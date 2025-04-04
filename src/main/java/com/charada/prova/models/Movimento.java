package com.charada.prova.models;

import com.charada.prova.enums.Classificacao;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "movimentos")
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate dataMovimento;
    @Column(nullable = false)
    private double valor;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Classificacao classificacao;
    private String observacao;

    public Movimento() {

    }

    public Movimento(Long id, String observacao, Classificacao classificacao, double valor, LocalDate dataMovimento) {
        this.id = id;
        this.observacao = observacao;
        this.classificacao = classificacao;
        this.valor = valor;
        this.dataMovimento = dataMovimento;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Classificacao getClassificacao() {return classificacao;}

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
