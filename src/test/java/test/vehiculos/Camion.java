package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    public static int cantidadCamiones;

    public Camion() {}

    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
        super();
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
		this.ejes = ejes;
		puertas = 2;
		velocidadMaxima = 80;
		traccion = "4X2";
		cantidadCamiones++;
		fabricante.cantidadVehiculos++;
		fabricante.pais.cantidadVehiculos++;
	}


    public void setEjes(int ejes) {
		this.ejes = ejes;
	}

    public int getEjes() {
		return ejes;
	}
}