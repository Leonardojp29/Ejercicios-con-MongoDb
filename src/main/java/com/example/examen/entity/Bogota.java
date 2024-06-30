package com.example.examen.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "bogota")
public class Bogota {
    @Id
    private String _id;
    private int OBJECTID;
    private String CODIGO;
    private String NOMBRE;
    private String DIRECCION;
    private String TIPO_DE_PA;
    private String ICONOGRAFI;
    private String NOMBRE_PRO;
    private String DIRECCIO_1;
    private String CORREO_PRO;
    private double LATITUD;
    private double LONGITUD;
    private int ID;
    private String TELEFONO;
    private Geometry geometry;

    @Getter
    @Setter
    public static class Geometry {
        private String type;
        private double[] coordinates;
    }
}
