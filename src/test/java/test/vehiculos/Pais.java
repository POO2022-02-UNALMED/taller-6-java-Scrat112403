package vehiculos;

import java.util.ArrayList;

public class Pais {
    public String nombre;
    public int cantidadVehiculos;
    private ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais() {}

    public Pais(String nombre) {
        this.nombre= nombre;
        pais.add(this);
    }

    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public static Pais paisMasVendedor() {
        Pais pais = new Pais();
        Pais p = pais;
        for (Pais pais: paises) {
            if (pais.cantidadVehiculos > a.cantidadVehiculos) {
                p= pais;
            }
        }

        return p;
    }
}