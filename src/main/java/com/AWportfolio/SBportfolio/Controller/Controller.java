package com.AWportfolio.SBportfolio.Controller;

import com.AWportfolio.SBportfolio.model.Estudio;
import com.AWportfolio.SBportfolio.model.Experiencia;
import com.AWportfolio.SBportfolio.model.Persona;
import com.AWportfolio.SBportfolio.service.IEstudiosService;
import com.AWportfolio.SBportfolio.service.IExperienciaService;
import com.AWportfolio.SBportfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private IPersonaService persoServ;
    
    @Autowired
    private IEstudiosService estudiosServ;
    
    @Autowired
    private IExperienciaService experienciaServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
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

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List <Experiencia> verExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    @PutMapping("/change/xperiencia")
    public void modificarExperiencia(@RequestBody Experiencia expe){
        experienciaServ.modificarExperiencia(expe);
    }

}
