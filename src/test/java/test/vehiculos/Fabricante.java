package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    public String nombre;
    public Pais pais;
    public int cantidadVehiculos;
    private ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();

    public Fabricante() {}

    public Fabricante(String nombre, Pais pais) {
        this.nombre= nombre;
        this.pais= pais;
        fabricas.add(this);
    }

    public String setNombre(String nombre) {
        this.nombre= nombre;
    }

    public getNombre(){
        return nombre;
    }

    public String setPais(Pais pais) {
        this.pais= pais;
    }

    public getPais(){
        return pais;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante fab = new Fabricante();
        Fabricante f = fab;
        for (Fabricante fabrica: fabricas) {
            if (fabrica.cantidadVehiculos > f.cantidadVehiculos) {
                f= fabrica;
            }
        }

        return f;
    }
}
