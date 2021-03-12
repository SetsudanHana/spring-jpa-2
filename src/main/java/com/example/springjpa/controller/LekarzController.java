package com.example.springjpa.controller;

import com.example.springjpa.model.Gabinet;
import com.example.springjpa.model.Lekarz;
import com.example.springjpa.service.GabinetService;
import com.example.springjpa.service.LekarzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lekarz")
public class LekarzController {

    @Autowired
    private LekarzService service;

    @GetMapping
    public List<Lekarz> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Lekarz get(long id) {
        return service.get(id);
    }

    @PostMapping
    public Lekarz create(@RequestBody Lekarz lekarz) {
        return service.create(lekarz);
    }

    @PutMapping
    public Lekarz update(@RequestBody Lekarz lekarz) {
        return service.update(lekarz);
    }

    @DeleteMapping("/{id}")
    public void delete(long id) {
        service.delete(id);
    }

}
