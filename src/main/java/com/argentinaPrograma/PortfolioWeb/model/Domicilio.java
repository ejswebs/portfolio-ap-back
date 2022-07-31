package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Domicilio {

    @Id
    private Long id;

    private String dirección;
    private Long persona_dni;
    private Long id_localidad;

    public Domicilio() {
    }

    public Domicilio(Long id,
            String dirección,
            Long persona_dni,
            Long id_localidad) {
        this.id = id;
        this.dirección = dirección;
        this.persona_dni = persona_dni;
        this.id_localidad = id_localidad;
    }
}
