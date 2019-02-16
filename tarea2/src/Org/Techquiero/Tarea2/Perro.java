package Org.Techquiero.Tarea2;

public class Perro extends Animal {
	private String raza;
	private Double  longitud;
	private  boolean genero;
	private int edad;
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Perro[nombre="+this.getNombre()+ ", edad=" +edad+ ", raza" +raza+"longitd" +longitud+"]";
		
		
	}
	
	
	
}
