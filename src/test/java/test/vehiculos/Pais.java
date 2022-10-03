package vehiculos;

import java.util.ArrayList;

public class Pais {
    public String nombre;
    public int cantidadVehiculos;
    private ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais() {}

    public Pais(String nombre) {
        this.nombre= nombre;
        paises.add(this);
    }

    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public Pais paisMasVendedor() {
        Pais country = new Pais();
        Pais p = country;
        for (Pais pais: paises) {
            if (pais.cantidadVehiculos > p.cantidadVehiculos) {
                p= pais;
            }
        }

        return p;
    }
}