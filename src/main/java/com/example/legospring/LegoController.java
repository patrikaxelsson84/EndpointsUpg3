package com.example.legospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
public class LegoController {
    @Autowired
    private LegoService legoService;

    @GetMapping("/searchId/{id}")
    public Collection<Lego> search(@PathVariable("id") String id){
        return legoService.getSingleTheme(id);
    }

    @GetMapping("/getAll")
    public Collection<Lego> getAll(){
        return legoService.getAllLego();
    }

}
