package com.bootcamp.calculadora.services;

/*

Desenvolva uma API que receba uma Casa com seu "nome", "endereço" e seus
"cômodos", estes contêm um "nome", "largura" e "comprimento".

Como requisito funcional é solicitado que a API:
a) Informe o número total de metros quadrados da casa.
b) Indique o valor da casa tendo em consideração R$ 800 por metro quadrado.
c) Informe o maior cômodo.
d) Retorne a quantidade de metros quadrados por cômodo.

*/

import com.bootcamp.calculadora.models.Casa;
import com.bootcamp.calculadora.models.CasaInfo;
import com.bootcamp.calculadora.models.Comodo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CalculadoraService {

    public CasaInfo getCasaInfo(Casa casa) {

        double somaMetrosQuadrados = 0;
        Comodo maiorComodo = casa.getComodos().get(0);
        Map<String, Double> areaPorComodo = new HashMap<>();

        casa.getComodos().stream().collect(Collectors.toList()).;

        for (Comodo c : casa.getComodos()) {
            if (maiorComodo.getArea() < c.getArea()) {
                maiorComodo = c;
            }
            somaMetrosQuadrados += c.getArea();
            areaPorComodo.put(c.getNome(), c.getArea());
        }


        double valorCasa = somaMetrosQuadrados * 800;

        return new CasaInfo(somaMetrosQuadrados, valorCasa, maiorComodo, areaPorComodo);

    }

}
