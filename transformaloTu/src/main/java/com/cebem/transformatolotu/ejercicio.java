package com.cebem.transformatolotu;

import java.text.MessageFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicio {

    @Controller 
public class HomeContoller {
    @RequestMapping("/")
    public String index() {
        return "matematicas.html";
    }
}


   @GetMapping("/areacirculo")
   public String areacirculo(@RequestParam int radio,@RequestParam int altura){
    
       Object params[] = {radio, altura};
       double area = 2*Math.PI*radio*(radio+altura);
       return ("Area del CIRCULO= "  + area);
       
   
   }
   @GetMapping("/arearombo")
   public String Arearombo(@RequestParam int diagonal1,@RequestParam int diagonal2){
     
       Object params[] = {diagonal1, diagonal2};
       double area = (diagonal1*diagonal2)/2;
       return ("Area del ROMBO= "  + area);
       
   
   }

}

