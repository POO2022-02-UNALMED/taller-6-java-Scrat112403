package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public static int cantidadCamionetas;

    public Camioneta() {}

    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
        super();
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		this.volco = volco;
		velocidadMaxima = 90;
		traccion = "4X4";
		cantidadCamionetas++;
		fabricante.cantidadVehiculos++;
		fabricante.pais.cantidadVehiculos++;

    public void setVolco(boolean volco) {
		this.volco = volco;
	}

    public boolean isVolco() {
		return volco;
	}
}