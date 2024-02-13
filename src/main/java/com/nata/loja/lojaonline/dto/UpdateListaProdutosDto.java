package com.nata.loja.lojaonline.dto;

import com.nata.loja.lojaonline.model.Loja;
import com.nata.loja.lojaonline.model.types.Categoria;

import java.math.BigDecimal;

public record UpdateListaProdutosDto(
        String name,
        BigDecimal price,
        String code,
        Categoria categoria,
        int quantidade,
        Boolean ativo

) {
    public UpdateListaProdutosDto (Loja loja){
        this(
                loja.getName(),
                loja.getPrice(),
                loja.getCode(),
                loja.getCategoria(),
                loja.getQuantidade(),
                loja.getAtivo()
        );
    }
}
