package com.redmor.AhorroCerca.model;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
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
    private int id;
    private int idBandera;
    private String cuit;
    private String razonSocial;
    private String banderaNombre;
    private String banderaUrl;
    private OffsetDateTime ultimaActualizacion;
    private String versionSepa;

}
