package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void modificarPersona(Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id); 
    
}
