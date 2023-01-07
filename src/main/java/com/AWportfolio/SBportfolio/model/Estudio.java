package com.AWportfolio.SBportfolio.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;   
    private String titulo;
    private String subtitulo;
    private String descripcion;

    public Estudio() {
    }

    public Estudio(long id, String titulo, String subtitulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
    }
        
}
