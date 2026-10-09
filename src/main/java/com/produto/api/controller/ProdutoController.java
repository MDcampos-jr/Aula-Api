package com.produto.api.controller;

import com.produto.api.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public String produto() {
        return "Api Funcionando";
    }

    @PostMapping("/produto")
    public Produto cadastrar(@RequestBody Produto produto) {
        return produto;
    }
}