package com.example.springjpa.controller;

import com.example.springjpa.model.Lekarz;
import com.example.springjpa.model.Pacjent;
import com.example.springjpa.service.PacjentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacjent")
public class PacjentController {

    @Autowired
    private PacjentService service;

    @GetMapping
    public List<Pacjent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Pacjent get(long id) {
        return service.get(id);
    }

    @PostMapping
    public Pacjent create(@RequestBody Pacjent pacjent) {
        return service.create(pacjent);
    }

    @PutMapping
    public Pacjent update(@RequestBody Pacjent pacjent) {
        return service.update(pacjent);
    }

    @DeleteMapping("/{id}")
    public void delete(long id) {
        service.delete(id);
    }

}
