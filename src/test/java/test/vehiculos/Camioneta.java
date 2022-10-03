package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public static int cantidadCamionetas;

    public Camioneta(){}

    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante, boolean volco) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco= volco;
    }

    public static Camioneta crearCamioneta(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
		Camioneta camioneta = new Camioneta(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante, ejes);
		cantidadCamionetas++;
        fabricante.cantidadVehiculos++;
        fabricante.pais.cantidadVehiculos++;
        return camioneta;
	}

    public static void setVolco(boolean volco) {
		this.volco = volco;
	}

    public static int getVolco() {
		return volco;
	}
}