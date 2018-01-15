package Eventos;

import Entidad.Iceberg;
import java.time.LocalDate;

public class PosicionIce{
    private final LocalDate date;
    private final Iceberg ice;
    private final String coordenadas;

    public PosicionIce(LocalDate date, Iceberg ice, String coordenadas) {
        this.date = date;
        this.ice = ice;
        this.coordenadas = coordenadas;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "En la fecha: " + date + " se encuentra en las coordenadas: ";
    }
 
   public Iceberg getIce() {
        return ice;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

}
