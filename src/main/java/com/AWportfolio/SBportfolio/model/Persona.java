package com.AWportfolio.SBportfolio.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String img_persona;
    
    @OneToMany
    List <Estudio> listaEstudios;
    
    @OneToMany
    List <Experiencia> listaExperiencia;
    
    public Persona (){
    }

    public Persona(Long Id, String nombre, String sobre_mi, String motivo, String img_persona) {
        this.Id = Id;
        this.nombre = nombre;
        this.sobre_mi = sobre_mi;
        this.motivo = motivo;
        this.img_persona = img_persona;
        this.listaEstudios = new ArrayList<>();
        this.listaExperiencia = new ArrayList<>();
    }

    public void addEstudio(Estudio edu){
        this.listaEstudios.add(edu);
    }
    
    public void addExperiencia(Experiencia expe){
        this.listaExperiencia.add(expe);
    }
    
}
