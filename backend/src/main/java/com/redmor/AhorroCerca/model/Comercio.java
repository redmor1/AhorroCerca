package com.redmor.AhorroCerca.model;

import java.lang.annotation.Inherited;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Builder
@Table(name = "comercio")

public class Comercio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idBandera;
    private String nombre;
    private String cuit;
    private String razonSocial;
    private String banderaNombre;
    private String banderaUrl;
    private OffsetDateTime ultimaActualizacion;
    private String versionSepa;

}
