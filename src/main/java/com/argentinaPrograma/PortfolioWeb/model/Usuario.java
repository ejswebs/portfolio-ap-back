package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    private String user_name;

    private String password;
    
    private Long persona_dni;

    public Usuario() {
    }

    public Usuario(String user_name,
            String password,
            Long persona_dni) {
        this.user_name = user_name;
        this.password = password;
        this.persona_dni = persona_dni;
    }
}
