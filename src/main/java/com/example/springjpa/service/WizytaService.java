package com.example.springjpa.service;

import com.example.springjpa.model.Wizyta;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class WizytaService implements CrudService<Wizyta, Long> {

    @Override
    public List<Wizyta> list() {
        return Collections.emptyList();
    }

    @Override
    public Wizyta get(Long id) {
        return null;
    }

    @Override
    public Wizyta create(Wizyta wizyta) {
        return null;
    }

    @Override
    public Wizyta update(Wizyta wizyta) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
