package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Bogota;
import com.example.examen.repository.BogotaRepository;

@Service
public class BogotaServiceImpl implements BogotaService {

    @Autowired
    private BogotaRepository repository;

    @Override
    public List<Bogota> findAll() {
        return repository.findAll();
    }

    @Override
    public Bogota findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Bogota save(Bogota bogota) {
        return repository.save(bogota);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Bogota> findByTipoDePaIn(List<String> tiposDePa) {
        return repository.findByTipoDePaIn(tiposDePa);
    }

    @Override
    public List<Bogota> findByNombreRegex(String regex) {
        return repository.findByNombreRegex(regex);
    }
}
