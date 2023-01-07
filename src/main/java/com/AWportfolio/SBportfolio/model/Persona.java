package com.AWportfolio.SBportfolio.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;



@Getter 
@Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nombre;
    private String sobre_mi;
    private String motivo;
    
    @OneToMany (targetEntity = Estudios.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "per_fk", referencedColumnName = "id")
    private List <Estudios> listaEstudios;
    
    public Persona (){
    }

    public Persona(Long Id, String nombre, String sobre_mi, String motivo) {
        this.Id = Id;
        this.nombre = nombre;
        this.sobre_mi = sobre_mi;
        this.motivo = motivo;
    }
    
    
}
