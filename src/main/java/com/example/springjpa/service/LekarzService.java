package com.example.springjpa.service;

import com.example.springjpa.model.Lekarz;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LekarzService implements CrudService<Lekarz, Long> {

    @Override
    public List<Lekarz> list() {
        return Collections.emptyList();
    }

    @Override
    public Lekarz get(Long id) {
        return null;
    }

    @Override
    public Lekarz create(Lekarz lekarz) {
        return null;
    }

    @Override
    public Lekarz update(Lekarz lekarz) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
