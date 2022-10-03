package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	public static int cantidadCamionetas;
	
	public Camioneta() {}
	
	public Camioneta (String placa, int puertas, String nombre, int precio, 
			int peso, Fabricante fabricante, boolean volco) {
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
	}

	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	
	
}