package com.AWportfolio.SBportfolio.service;
import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.model.Experiencia;
import com.AWportfolio.SBportfolio.model.Persona;
import com.AWportfolio.SBportfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Autowired
     public EstudiosService estudiosServ; 
    
    @Autowired
    public ExperienciaService experienciaServ;
    
   @Override
   public Boolean login(String email, String password){
       return persoRepo.existsByEmailAndPassword(email, password);
   }
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }
    
    @Override
    public Persona verPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
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
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void sumarEstudio(Estudio edu, Persona per) {
        Estudio edu_id = estudiosServ.agregarEstudio(edu);
        per.addEstudio(edu_id);
        persoRepo.save(per);
    }
    @Override
    public void sumarExperiencia(Experiencia expe, Persona per) {
        Experiencia expe_id = experienciaServ.agregarExperiencia(expe);
        per.addExperiencia(expe_id);
        persoRepo.save(per);
    }
    
}
