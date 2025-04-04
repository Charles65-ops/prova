package com.charada.prova.enums;

public enum Classificacao {
     SAIDA ("2563"),
    ENTRADA ("1258");;

    private final String codigo;

    Classificacao(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
