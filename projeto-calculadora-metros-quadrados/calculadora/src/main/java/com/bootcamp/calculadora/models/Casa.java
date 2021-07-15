package com.bootcamp.calculadora.models;

import java.util.List;

public class Casa {

    private String nome;
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String nome, String endereco, List<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }
}
