package com.AWportfolio.SBportfolio.service;

import com.AWportfolio.SBportfolio.model.Estudios;
import com.AWportfolio.SBportfolio.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{

    @Autowired
    public EstudiosRepository estuRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return estuRepo.findAll(); 
    }

    @Override
    public void agregarEstudio(Estudios edu) {
        estuRepo.save(edu); 
    }

    @Override
    public void eliminarEstudio(Long id) {
        estuRepo.deleteById(id); 
    }

    @Override
    public void modificarEstudio(Estudios edu) {
        estuRepo.save(edu);
    }
    
}
