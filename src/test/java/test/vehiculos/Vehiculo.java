package vehiculos;


public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected float precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static int cantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float precio, int peso, String traccion, Fabricante fabricante) {
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

    public void setPlaca(String placa) {
      this.placa = placa;
	}

    public String getPlaca() {
      return placa;
	}

    public void setPuertas(int puertas) {
      this.puertas = puertas;
	}

    public int getPuertas() {
      return puertas;
	}

    public void setVelocidadMaxima(int velocidad) {
      this.velocidadMaxima = velocidad;
	}

    public int getVelocidadMaxima() {
      return velocidad;
	}

    public void setNombre(String nombre) {
      this.nombre = nombre;
	}

    public String getNombre() {
      return nombre;
	}

    public void setPrecio(float precio) {
      this.precio = precio;
	}

    public float getPrecio() {
      return precio;
	}

    public void setPeso(int peso) {
      this.peso = peso;
	}

    public int getPeso() {
      return peso;
	}

    public void setTraccion(String traccion) {
      this.traccion = traccion;
	}

    public String getTraccion() {
      return traccion;
	}

    public void setFabricante(Fabricante fabricante) {
      this.fabricante = fabricante;
	}

    public Fabricante getFabricante() {
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