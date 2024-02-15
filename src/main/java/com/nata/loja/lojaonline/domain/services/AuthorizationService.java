package com.nata.loja.lojaonline.domain.services;

import com.nata.loja.lojaonline.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//Essa classe deve implementar a interface UserDetailsService
//Os médotos da interface são implementados para manipular a autorização dos usuarios
@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    private UserRepository repository;


    //Este médodo da interface UserDetailsService faz a consulta de usuario no banco de dados
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
