package com.meli.seguros.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewSiniestroDto {
    @JsonProperty("fecha_de_siniestro")
    LocalDate fechaDeSiniestro;
    @JsonProperty("perdida_economica")
    Double perdidaEconomica;
    @JsonProperty("vehiculo_id")
    Long vehiculoId;
}
