package com.example.springjpa.service;

import com.example.springjpa.model.Pacjent;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PacjentService implements CrudService<Pacjent, Long> {

    @Override
    public List<Pacjent> list() {
        return Collections.emptyList();
    }

    @Override
    public Pacjent get(Long id) {
        return null;
    }

    @Override
    public Pacjent create(Pacjent pacjent) {
        return null;
    }

    @Override
    public Pacjent update(Pacjent pacjent) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
