package com.AWportfolio.SBportfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Credenciales {
    private String password;
    private String email;

    public Credenciales(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public Credenciales() {
    }    
    
}
