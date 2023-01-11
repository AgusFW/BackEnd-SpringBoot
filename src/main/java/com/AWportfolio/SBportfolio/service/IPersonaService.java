package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.model.Experiencia;
import com.AWportfolio.SBportfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    
    public Persona verPersona ( Long id);
    
    public void crearPersona(Persona per);
    
    public void modificarPersona(Persona per);
    
    public void borrarPersona (Long id);

    public void sumarEstudio(Estudio edu, Persona id);
    
    public void sumarExperiencia(Experiencia expe, Persona id);
    
    public Boolean login(String email, String password);
}
