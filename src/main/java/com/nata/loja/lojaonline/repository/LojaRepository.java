package com.nata.loja.lojaonline.repository;

import com.nata.loja.lojaonline.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LojaRepository extends JpaRepository<Loja, UUID> {
}
