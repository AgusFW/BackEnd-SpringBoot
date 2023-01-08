package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia ();
    
    public Experiencia agregarExperiencia(Experiencia expe);
    
    public void borrarExperiencia(Long id);
    
    public void modificarExperiencia (Experiencia expe);
    
}
