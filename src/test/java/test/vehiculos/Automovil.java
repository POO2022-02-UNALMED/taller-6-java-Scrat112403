package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    public static int cantidadAutomoviles;

    public Automovil() {}

    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante, int puestos) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.puestos= puestos;
    }

    public static Automovil crearAuto(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
		Automovil auto = new Automovil(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
		cantidadAutomoviles++;
        fabricante.cantidadVehiculos++;
        fabricante.pais.cantidadVehiculos++;
        return auto;
	}

    public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

    public int getPuestos() {
		return puestos;
	}
}
