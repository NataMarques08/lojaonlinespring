package com.nata.loja.lojaonline.domain.dto;

import com.nata.loja.lojaonline.domain.user.model.types.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
