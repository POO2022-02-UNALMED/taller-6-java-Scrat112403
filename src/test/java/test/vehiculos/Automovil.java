package vehiculos;

public class Automovil extends Vehiculo {
    public int puestos;
    public static int cantidadAutomoviles;

    public Automovil() {}

    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
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

    public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

    public int getPuestos() {
		return puestos;
	}
}
