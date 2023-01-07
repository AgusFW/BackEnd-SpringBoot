package com.AWportfolio.SBportfolio.service;
import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.model.Persona;
import com.AWportfolio.SBportfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Autowired
     public EstudiosService estudiosServ; 
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id); 
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null); 
    }
    
    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void sumarEstudio(Estudio edu, Persona per) {
        Estudio edu_id = estudiosServ.agregarEstudio(edu);
        per.addEducacion(edu_id);
        persoRepo.save(per);
    }
    
}
