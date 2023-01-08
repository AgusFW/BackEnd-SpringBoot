package com.AWportfolio.SBportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long Id;
    private String titulo;
    private String puesto;
    private String tarea_puesto;
    private String herramientas;
    private String logo_puesto;

    public Experiencia() {
    }

    public Experiencia(Long Id, String titulo, String puesto, String tarea_puesto, String herramientas, String logo_puesto) {
        this.Id = Id;
        this.titulo = titulo;
        this.puesto = puesto;
        this.tarea_puesto = tarea_puesto;
        this.herramientas = herramientas;
        this.logo_puesto = logo_puesto;
    }
        
}
