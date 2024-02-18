package com.nata.loja.lojaonline.security.domain.user.dto;

import com.nata.loja.lojaonline.security.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
