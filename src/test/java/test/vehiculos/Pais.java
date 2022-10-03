package vehiculos;

import java.util.ArrayList:

public class Pais {
    String nombre;
    public int cantidadVehiculos;
    private ArrayList<Pais> pais = new ArrayList<Pais>();

    public Pais() {}

    public Pais(String nombre) {
        this.nombre= nombre;
        pais.add(this);
    }

    public String setNombre(String nombre) {
        this.nombre= nombre;
    }

    public getNombre(){
        return nombre;
    }

    public static Pais paisMasVendedor() {
        Pais pais = new Pais();
        Pais a = pais;
        for (Pais pais: pais) {
            if (pais.cantidadVehiculos > a.cantidadVehiculos) {
                a= pais;
            }
        }

        return a;
    }
}