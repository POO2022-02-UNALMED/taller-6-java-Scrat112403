package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static int cantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa= placa;
        this.puertas= puertas;
        this.velocidadMaxima= velocidadMaxima;
        this.nombre= nombre;
        this.precio= precio;
        this.peso= peso;
        this.traccion= traccion;
        this.fabricante= fabricante;
    }

    public Vehiculo() {
		cantidadVehiculos++;
	}

    public static void setPlaca(String placa) {
		this.placa = placa;
	}

    public static String getPlaca() {
		return placa;
	}

    public static void setPuertas(int puertas) {
		this.puertas = puertas;
	}

    public static int getPuertas() {
		return puertas;
	}

    public static void setVelocidadMaxima(int velocidad) {
		this.velocidadMaxima = velocidad;
	}

    public static int getVelocidadMaxima() {
		return velocidad;
	}

    public static void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public static String getNombre() {
		return nombre;
	}

    public static void setPrecio(int precio) {
		this.precio = precio;
	}

    public static int getPrecio() {
		return precio;
	}

    public static void setPeso(int peso) {
		this.peso = peso;
	}

    public static int getPeso() {
		return peso;
	}

    public static void setTraccion(String traccion) {
		this.traccion = traccion;
	}

    public static String getTraccion() {
		return traccion;
	}

    public static void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

    public static Fabricante getFabricante() {
		return fabricante;
	}

    public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

    public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidadAutomoviles + 
				"/nCamionetas" + Camioneta.cantidadCamionetas +
				"/nCamiones: " + Camion.cantidadCamiones;
				
	}
}