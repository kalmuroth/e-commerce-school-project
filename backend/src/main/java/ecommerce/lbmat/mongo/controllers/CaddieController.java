package ecommerce.lbmat.mongo.controllers;

import ecommerce.lbmat.mongo.entities.Caddie;
import ecommerce.lbmat.mongo.services.CaddieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/caddies")
@Slf4j
@AllArgsConstructor
public class CaddieController {
    private CaddieService service;

    @GetMapping({"/","/all"})
    public List<Caddie> getAllCaddie(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Caddie getCaddie(@PathVariable String id){
        return service.read(id);
    }
    @RequestMapping(value = "/add", method=POST)
    public Caddie postCaddie(Caddie caddie){
        return service.create(caddie);
    }
    @RequestMapping(value = "/update/{id}", method=RequestMethod.PUT)
    public Caddie updateCaddie(Caddie caddie, @PathVariable String id){
        var idCaddie = service.read(id);
        if ( idCaddie == null  )
            return null;
        else {
            return service.update(caddie);
        }
    }
}