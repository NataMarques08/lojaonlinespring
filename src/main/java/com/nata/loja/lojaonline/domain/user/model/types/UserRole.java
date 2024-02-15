package com.nata.loja.lojaonline.domain.user.model.types;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

     UserRole(String role){
        this.role = role;
    }

    public String getRole(){
         return role;
    }

}
