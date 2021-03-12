package com.example.springjpa.controller;

import com.example.springjpa.model.Gabinet;
import com.example.springjpa.service.GabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gabinet")
public class GabinetController {

    @Autowired
    private GabinetService service;

    @GetMapping
    public List<Gabinet> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Gabinet get(long id) {
        return service.get(id);
    }

    @PostMapping
    public Gabinet create(@RequestBody Gabinet gabinet) {
        return service.create(gabinet);
    }

    @PutMapping
    public Gabinet update(@RequestBody Gabinet gabinet) {
        return service.update(gabinet);
    }

    @DeleteMapping("/{id}")
    public void delete(long id) {
        service.delete(id);
    }

}
