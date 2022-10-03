package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    public static int cantidadCamiones;

    public Camion() {}

    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante, int ejes) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.ejes= ejes;
    }

    public Camion crearCamion(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante, int ejes) {
		Camion camion = new Camion(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
		cantidadCamiones++;
        fabricante.cantidadVehiculos++;
        fabricante.pais.cantidadVehiculos++;
        return camion;
	}

    public void setEjes(int ejes) {
		this.ejes = ejes;
	}

    public int getEjes() {
		return ejes;
	}
}