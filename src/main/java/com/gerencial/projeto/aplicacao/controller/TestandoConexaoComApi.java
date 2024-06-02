package com.gerencial.projeto.aplicacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste-conexao")
public class TestandoConexaoComApi {

    private record RetornoServicoBase(String tipo, String dsc){}

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity consultarSeConexaoEstaEmPe() {
        return ResponseEntity.status(HttpStatus.CREATED).body(new RetornoServicoBase("Teste de conexao subindo uma atualizacao", "Conectando normalmente"));
    }

}
