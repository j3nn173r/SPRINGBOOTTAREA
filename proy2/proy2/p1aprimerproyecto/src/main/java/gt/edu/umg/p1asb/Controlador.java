/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1asb;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author STEFANNIE FLANDEZ
 */
@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    public String inicio (Model model){
        log.info("Entrando al controlador inicio de MVC");
        var msg ="BIENVENIDOS AL SPRINGBOOT";
        var person = new person();
        person.setNombre("Francis");
        person.setApellido("Perez");
        person.setEner("500");
        person.setFebrer("600");
        person.setMarz("700");
        
        var Persona2 = new person();
        Persona2.setNombre("Yahiline");
        Persona2.setApellido("Chavez");
        Persona2.setEner("100");
        Persona2.setFebrer("200");
        Persona2.setMarz("300");
        
        var Personas = Arrays.asList(person,Persona2);
        
        model.addAttribute("msg", msg);
        model.addAttribute("Personas", Personas);
        
        return "index";
        
    }
    
    
}
