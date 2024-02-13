package com.nata.loja.lojaonline.dto;

import com.nata.loja.lojaonline.model.Loja;
import com.nata.loja.lojaonline.model.types.Categoria;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record ListaLojaDto(UUID id, String productName, BigDecimal productPrice, String productCode,
                           Categoria categoria, int quantidade, Boolean ativo) {

    public ListaLojaDto(Loja loja) {
        this(loja.getId(), loja.getName(), loja.getPrice(),
                loja.getCode(), loja.getCategoria(), loja.getQuantidade(), loja.getAtivo());
    }

}
