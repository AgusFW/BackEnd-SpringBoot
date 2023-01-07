package com.AWportfolio.SBportfolio.Controller;

import com.AWportfolio.SBportfolio.model.Estudios;
import com.AWportfolio.SBportfolio.service.IEstudiosService;
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
public class EduController {
    
    @Autowired
    private IEstudiosService estudiosServ;
    
    @PostMapping ("/new/estudio")
    public void agregarEstudio(@RequestBody Estudios edu){
       estudiosServ.agregarEstudio(edu);
    }
    
    @GetMapping("/ver/estudios")
    @ResponseBody
    public List <Estudios> verEstudios(){
        return estudiosServ.verEstudios();
    }
    
    @DeleteMapping("/eliminar/estudio/{id}")
    public void eliminarEstudio(@PathVariable Long id){
        estudiosServ.eliminarEstudio(id);
    }
    
    @PutMapping("/change/estudio")
    public void modificarEstudio(@RequestBody Estudios edu){
        estudiosServ.modificarEstudio(edu);
    }
    
}
