package Org.Techquiero.Tarea2;

import java.util.Scanner;

public class Test {

	
	public static void main(String [] args) {
		
		Perro perro =new Perro();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es el nombre del perro?");
		perro.setNombre(scanner.next());
		
		System.out.println("Cual es su edad?");
		perro.setEdad(scanner.nextInt());
		
		System.out.println("Cual es la raza de tu perro?");
		perro.setRaza(scanner.next());
		
		System.out.println("Cual es su longitud?");
		perro.setLongitud(scanner.nextDouble());
		
		System.out.println("Cual es su genero? (Macho [M/m] o Hembra[H/h] )");
		perro.setGenero(scanner.next().toUpperCase());
		
		
		if( perro.getGenero().equals("H"))
			System.out.println("Perra: "+perro.toString());
		else
			System.out.println("perro: "+ perro.toString());
	}
	
}
