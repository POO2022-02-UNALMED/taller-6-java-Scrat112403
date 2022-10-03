package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	public String nombre;
	public int cantidadVehiculos;
	
	public static List<Pais> paises = new ArrayList<Pais>();
	
	Pais(){
	}
	
	public Pais(String nombre){
		this.nombre = nombre;
		paises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais p = new Pais();
		Pais c = p;
		for (Pais pais : paises) {
			if (pais.cantidadVehiculos > c.cantidadVehiculos) {
				c = pais;
			}
		}
		return c;
	}
}