package com.nata.loja.lojaonline.controller;

import com.nata.loja.lojaonline.dto.ListaLojaDto;
import com.nata.loja.lojaonline.dto.ListaProductUpdate;
import com.nata.loja.lojaonline.dto.LojaDto;
import com.nata.loja.lojaonline.dto.UpdateListaProdutosDto;
import com.nata.loja.lojaonline.model.Loja;
import com.nata.loja.lojaonline.repository.LojaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("lojaonline")
public class LojaController {

    @Autowired
    private LojaRepository lojaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<LojaDto> cadastro(@RequestBody @Valid LojaDto dados, UriComponentsBuilder uriBuilder){
        var loja = new Loja(dados);
        lojaRepository.save(loja);
        var uri = uriBuilder.path("/lojaonline/{id}").buildAndExpand(loja.getId()).toUri();
        return ResponseEntity.created(uri).body(new LojaDto(loja));
    }

    @GetMapping
    public ResponseEntity<List<ListaLojaDto>> getAllProduct(){
        var dados = lojaRepository.findAll().stream().map(ListaLojaDto::new).toList();
        return ResponseEntity.ok(dados);
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<ListaProductUpdate> updateProduct(
            @PathVariable(value = "id") UUID id,
            @RequestBody @Valid UpdateListaProdutosDto dados
    ){
        var info = lojaRepository.getReferenceById(id);
        info.updateDados(dados);
        return ResponseEntity.ok(new ListaProductUpdate(info));
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity<Object> deleteAllProduct(){
        lojaRepository.deleteAll();
        return ResponseEntity.status(HttpStatus.OK).body("Base de dados excluida");
    }

}
