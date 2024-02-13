package com.nata.loja.lojaonline.model;

import com.nata.loja.lojaonline.dto.ListaLojaDto;
import com.nata.loja.lojaonline.dto.LojaDto;
import com.nata.loja.lojaonline.dto.UpdateListaProdutosDto;
import com.nata.loja.lojaonline.model.types.Categoria;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "Loja")
@Table(name = "loja")
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private BigDecimal price;

    private String code;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private int quantidade;
    private Boolean ativo;

    public Loja(UUID id, String name, BigDecimal price, String code,
                Categoria categoria, int quantidade,Boolean ativo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.code = code;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.ativo = ativo;
    }

    public Loja(LojaDto dados) {
        this.name = dados.name();
        this.price = dados.price();
        this.code = dados.code();
        this.categoria = dados.categoria();
        this.quantidade = dados.quantidade();
        this.ativo = dados.ativo();
    }
    public void updateDados(UpdateListaProdutosDto dados){
        if (dados.name()!=null){
            this.name = dados.name();
        }
        if (dados.price()!=null){
            this.price = dados.price();
        }
        if(dados.code() != null){
            this.code = dados.code();;
        }
        if(dados.categoria() != null){
            this.categoria = dados.categoria();
        }
        if(dados.ativo() != null){
            this.ativo = dados.ativo();
        }
    }

    public Loja() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
