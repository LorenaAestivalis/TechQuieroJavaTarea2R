package Org.Techquiero.Tarea2;

public class Perro extends Animal {
	private String raza;
	private Double  longitud;
	private  String genero;
	private int edad;
	
	
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return " [nombre="+this.getNombre()+ ", edad=" +edad+ ", raza=" +raza+", longitd=" +longitud+"]";
		
		
	}
	
	
	
}
