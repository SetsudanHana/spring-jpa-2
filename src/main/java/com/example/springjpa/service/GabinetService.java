package com.example.springjpa.service;

import com.example.springjpa.model.Gabinet;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GabinetService implements CrudService<Gabinet, Long> {

    @Override
    public List<Gabinet> list() {
        return Collections.emptyList();
    }

    @Override
    public Gabinet get(Long id) {
        return null;
    }

    @Override
    public Gabinet create(Gabinet gabinet) {
        return null;
    }

    @Override
    public Gabinet update(Gabinet gabinet) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
