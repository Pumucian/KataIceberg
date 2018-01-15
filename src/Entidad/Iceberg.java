package Entidad;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import Eventos.PosicionIce;
import Eventos.VolumenIce;

public class Iceberg {
    private final String origen;
    private final String nombre;
    private final LocalDate created;
    private final Map<PosicionIce,VolumenIce> ice;
    public Iceberg(String nombre,String origen, LocalDate created) {
        this.origen = origen;
        this.nombre = nombre;
        this.created = created;
        this.ice = new HashMap<>();
    }


    public Map<PosicionIce, VolumenIce> getIce() {
        return ice;
    }

    
    public void añade(PosicionIce pos, VolumenIce vol){
        ice.put(pos,vol);
    }
    
    @Override
    public String toString() {
        return "Iceberg " +nombre+ ", creado en: "+"'"+origen +"'"+", en la fecha: " + created;
    }
    public void obtenerDatos(){
        System.out.println(this.toString());
        System.out.println("Este iceberg  presenta los siguientes datos: \n");
        ice.forEach((k,v) -> printData(k, v));
        System.out.println("\n");
    }
    public void printData(PosicionIce k, VolumenIce v){
        String coordV = "N", coordH = "E";
        String aux = k.getCoordenadas();
        float[] coords = new float[2];
        coords[0] = Float.parseFloat(aux.split(",")[0]);
        coords[1] = Float.parseFloat(aux.split(",")[1]);
        if (coords[0] < 0) {
            coordV = "S";
            coords[0] *= -1;
        }
        if (coords[1] < 0) {
            coordH = "O";
            coords[1] *= -1;
        }
        System.out.println(k + "" + coords[0] + coordV + ", " + coords[1] + coordH + " y tiene un volumen: " + v);
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDate getCreated() {
        return created;
    }
    

}
