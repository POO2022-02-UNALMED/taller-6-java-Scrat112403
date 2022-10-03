package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public static int cantidadAutomoviles;
	
	public Automovil() {}
	
	public Automovil (String placa, String nombre, int precio, 
			int peso, Fabricante fabricante, int puestos) {
		super();
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		this.puestos = puestos;
		puertas = 4;
		velocidadMaxima = 100;
		traccion = "FWD";
		cantidadAutomoviles++;
		fabricante.cantidadVehiculos++;
		fabricante.pais.cantidadVehiculos++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	

}