package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public static int cantidadCamionetas;

    public Camioneta() {}

    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco= volco;
    }

    public Camioneta crearCamioneta(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		Camioneta camioneta = new Camioneta(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante, volco);
		cantidadCamionetas++;
        fabricante.cantidadVehiculos++;
        fabricante.pais.cantidadVehiculos++;
        return camioneta;
	}

    public void setVolco(boolean volco) {
		this.volco = volco;
	}

    public boolean getVolco() {
		return volco;
	}
}