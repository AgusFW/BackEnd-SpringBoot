package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Estudio;
import java.util.List;

public interface IEstudiosService {
    
    public List <Estudio> verEstudios();
    
    public Estudio agregarEstudio (Estudio edu);
    
    public void borrarEstudio (Long id);
    
    public void modificarEstudio (Estudio edu);
            
}
