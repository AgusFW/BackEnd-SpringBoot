package com.AWportfolio.SBportfolio.Controller;

import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.model.Experiencia;
import com.AWportfolio.SBportfolio.model.Persona;
import com.AWportfolio.SBportfolio.service.IEstudiosService;
import com.AWportfolio.SBportfolio.service.IExperienciaService;
import com.AWportfolio.SBportfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    public IPersonaService persoServ;
    
    @Autowired
    public IEstudiosService estudiosServ;
    
    @Autowired
    public IExperienciaService experienciaServ;
    
    @PostMapping("/login")
    public Boolean login(@RequestBody String password, String email) {
        return persoServ.login(email, password);
    }
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/ver/persona/{id}")
       @ResponseBody
       public Persona verPersona(@PathVariable long id){
       return persoServ.verPersona(id);    
    }
    
    @DeleteMapping ("/delete/Persona/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("/change/persona")
    public void modificarPersona(@RequestBody Persona pers){
       persoServ.modificarPersona(pers);
    }
    
    @PostMapping("/new/estudio/{id}")
    public void agregarEstudio(@RequestBody Estudio edu,@PathVariable Persona id){
        persoServ.sumarEstudio(edu, id);
    } 
    
    @GetMapping("/ver/estudios")
    @ResponseBody
    public List <Estudio> verEstudios(){
        return estudiosServ.verEstudios();
    }
    
    @DeleteMapping("/delete/estudio/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estudiosServ.borrarEstudio(id);
    }
    
    @PutMapping("/change/estudio")
    public void modificarEstudio(@RequestBody Estudio edu){
        estudiosServ.modificarEstudio(edu);
    }

    @PostMapping("/new/experiencia/{id}")
    public void agregarExperiencia(@RequestBody Experiencia expe,@PathVariable Persona id){
        persoServ.sumarExperiencia(expe, id);
    } 
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List <Experiencia> verExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    @PutMapping("/change/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia expe){
        experienciaServ.modificarExperiencia(expe);
    }

}
