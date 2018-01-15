package kataiceberg;

import Entidad.Iceberg;
import java.time.LocalDate;
import Eventos.PosicionIce;
import Eventos.VolumenIce;

public class KataIceberg {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Iceberg ice =  new Iceberg("Puck","Hielolandia",date);
        VolumenIce vol = new VolumenIce(date,ice,9000);
        PosicionIce pos = new PosicionIce(LocalDate.now(),ice,"50.15,120.62");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(1),ice,9100);
        pos = new PosicionIce(date.plusDays(1),ice,"52.24,117.61");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(2),ice,8840);
        pos = new PosicionIce(date.plusDays(2),ice,"54.84,115.16");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(3),ice,8210);
        pos = new PosicionIce(date.plusDays(3),ice,"57.23,114.67");
        ice.añade(pos,vol);
        ice.obtenerDatos();      
        Iceberg ice2 =  new Iceberg("Tusk","Arcadia",date);
        VolumenIce vol2 = new VolumenIce(LocalDate.now(),ice2,4000);
        PosicionIce pos2 = new PosicionIce(LocalDate.now(),ice2,"64.21,-100.41");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(1),ice2,3750);
        pos2 = new PosicionIce(date.plusDays(1),ice2,"65.02,-103.31");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(2),ice2,3675);
        pos2 = new PosicionIce(date.plusDays(2),ice2,"64.71,-105.30");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(3),ice2,3200);
        pos2 = new PosicionIce(date.plusDays(3),ice2,"66.55,-104.11");
        ice2.añade(pos2,vol2);
        ice2.obtenerDatos();
    }
    
}
