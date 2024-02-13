package com.nata.loja.lojaonline.dto;

import com.nata.loja.lojaonline.model.Loja;
import com.nata.loja.lojaonline.model.types.Categoria;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record LojaDto(

        @NotBlank
        String name,
        @NotNull
        BigDecimal price,
        @NotBlank
        String code,
        @Enumerated
        Categoria categoria,
        @NotNull
        int quantidade,
        @NotNull
        Boolean ativo
) {
    public LojaDto(Loja dados) {
        this(
                dados.getName(),
                dados.getPrice(),
                dados.getCode(),
                dados.getCategoria(),
                dados.getQuantidade(),
                dados.getAtivo()
                );

    }

}
