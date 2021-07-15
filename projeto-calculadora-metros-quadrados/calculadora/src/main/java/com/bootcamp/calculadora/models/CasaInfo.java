package com.bootcamp.calculadora.models;

import java.util.Map;

/*

Desenvolva uma API que receba uma Casa com seu "nome", "endereço" e seus
"cômodos", estes contêm um "nome", "largura" e "comprimento".

Como requisito funcional é solicitado que a API:
a) Informe o número total de metros quadrados da casa.
b) Indique o valor da casa tendo em consideração R$ 800 por metro quadrado.
c) Informe o maior cômodo.
d) Retorne a quantidade de metros quadrados por cômodo.

*/

public class CasaInfo {

    private double metrosQuadrados;
    private double valor;
    private Comodo maiorComodo;
    private Map<String, Double> areaPorComodo;

    public CasaInfo(double metrosQuadrados, double valor, Comodo maiorComodo, Map<String, Double> areaPorComodo) {
        this.metrosQuadrados = metrosQuadrados;
        this.valor = valor;
        this.maiorComodo = maiorComodo;
        this.areaPorComodo = areaPorComodo;
    }

    public double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Comodo getMaiorComodo() {
        return maiorComodo;
    }

    public void setMaiorComodo(Comodo maiorComodo) {
        this.maiorComodo = maiorComodo;
    }

    public Map<String, Double> getAreaPorComodo() {
        return areaPorComodo;
    }

    public void setAreaPorComodo(Map<String, Double> areaPorComodo) {
        this.areaPorComodo = areaPorComodo;
    }
}
