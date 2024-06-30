package com.example.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.examen.entity.Bogota;

public interface BogotaRepository extends MongoRepository<Bogota, String> {

    @Query("{ 'TIPO_DE_PA': { $in: ?0 } }")
    List<Bogota> findByTipoDePaIn(List<String> tiposDePa);

    @Query("{ 'NOMBRE': { $regex: ?0, $options: 'i' } }")
    List<Bogota> findByNombreRegex(String regex);
}
