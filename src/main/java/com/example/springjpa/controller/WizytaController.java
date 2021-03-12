package com.example.springjpa.controller;

import com.example.springjpa.model.Pacjent;
import com.example.springjpa.model.Wizyta;
import com.example.springjpa.service.PacjentService;
import com.example.springjpa.service.WizytaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wizyta")
public class WizytaController {

    @Autowired
    private WizytaService service;

    @GetMapping
    public List<Wizyta> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Wizyta get(long id) {
        return service.get(id);
    }

    @PostMapping
    public Wizyta create(@RequestBody Wizyta wizyta) {
        return service.create(wizyta);
    }

    @PutMapping
    public Wizyta update(@RequestBody Wizyta wizyta) {
        return service.update(wizyta);
    }

    @DeleteMapping("/{id}")
    public void delete(long id) {
        service.delete(id);
    }

}
