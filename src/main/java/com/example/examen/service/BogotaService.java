package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Bogota;

public interface BogotaService {

    List<Bogota> findAll();
    Bogota findById(String id);
    Bogota save(Bogota bogota);
    void deleteById(String id);
    List<Bogota> findByTipoDePaIn(List<String> tiposDePa);
    List<Bogota> findByNombreRegex(String regex);
}
