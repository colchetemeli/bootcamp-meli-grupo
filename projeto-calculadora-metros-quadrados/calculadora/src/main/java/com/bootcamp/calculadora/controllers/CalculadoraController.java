package com.bootcamp.calculadora.controllers;

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
import com.bootcamp.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {

    private CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/casa")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CasaInfo getCasaInfo(@RequestBody Casa casa) {
        return calculadoraService.getCasaInfo(casa);
    }


}
