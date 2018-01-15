package Eventos;

import Entidad.Iceberg;
import java.time.LocalDate;

public class VolumenIce {
    private final LocalDate date;
    private final Iceberg ice;
    private final double volumen;

    public VolumenIce(LocalDate date, Iceberg ice, double volumen) {
        this.date = date;
        this.ice = ice;
        this.volumen = volumen;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIce() {
        return ice;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return volumen+"";
    }
    
}
