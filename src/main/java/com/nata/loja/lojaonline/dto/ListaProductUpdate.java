package com.nata.loja.lojaonline.dto;

import com.nata.loja.lojaonline.model.Loja;
import com.nata.loja.lojaonline.model.types.Categoria;

import java.math.BigDecimal;
import java.util.UUID;

public record ListaProductUpdate(
        UUID id, String productName, BigDecimal productPrice, String productCode,
        Categoria categoria, int quantidade, Boolean ativo) {

    public ListaProductUpdate(Loja dados) {
        this(
                dados.getId(),
                dados.getName(),
                dados.getPrice(),
                dados.getCode(),
                dados.getCategoria(),
                dados.getQuantidade(),
                dados.getAtivo()
        );
    }
}
