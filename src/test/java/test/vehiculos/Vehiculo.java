package vehiculo;

import java.util.ArrayList;

public class Vehiculo {
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public float precio;
    public float peso;
    public String traccion;
    public String fabricante;
    private static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, String fabricante) {
        this.placa= placa;
        this.puertas= puertas;
        this.velocidadMaxima= velocidadMaxima;
        this.nombre= nombre;
        this.precio= precio;
        this.peso= peso;
        this.traccion= traccion;
        this.fabricante= fabricante;
        listado.add(this);
    }

    public Vehiculo() {
		listado.add(this);
	}

    public static int CantidadVehiculos() {
		return Vehiculo.listado.size();
    }
}