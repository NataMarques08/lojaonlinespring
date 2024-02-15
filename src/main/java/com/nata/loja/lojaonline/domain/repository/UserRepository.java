package com.nata.loja.lojaonline.domain.repository;

import com.nata.loja.lojaonline.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,String> {
    //Encontra o usuario pelo login, deve ser do tipo UserDetails para retornar o usuario
    UserDetails findByLogin(String login);
}
