package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Estudios;
import java.util.List;

public interface IEstudiosService {
    
    public List <Estudios> verEstudios();
    
    public void agregarEstudio (Estudios edu);
    
    public void eliminarEstudio (Long id);
    
    public void modificarEstudio (Estudios edu);
            
}
