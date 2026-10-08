package com.koussay.airline.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "numeroVol", types = { Vol.class })
public interface VolProjection {
    public String getNumero();
}
