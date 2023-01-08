package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Experiencia;
import com.AWportfolio.SBportfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencia (){
        return expeRepo.findAll();
    }
    
    @Override
    public Experiencia agregarExperiencia(Experiencia expe){
        return expeRepo.save(expe);
    }
    
    @Override
    public void borrarExperiencia(Long id){
        expeRepo.deleteById(id);
    }
    
    @Override
    public void modificarExperiencia (Experiencia expe){
         expeRepo.save(expe);
     }
    
}
