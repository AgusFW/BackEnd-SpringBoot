package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{

    @Autowired
    public EstudiosRepository estuRepo;
    
    @Override
    public List<Estudio> verEstudios() {
        return estuRepo.findAll(); 
    }

    @Override
    public Estudio agregarEstudio(Estudio edu) {
    return estuRepo.save(edu); 
    }
    
    @Override
    public Estudio buscarEstudio(Long id){
    return estuRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarEstudio(Long id) {
        estuRepo.deleteById(id); 
    }

    @Override
    public void modificarEstudio(Estudio edu) {
        estuRepo.save(edu);
    }
    
}
