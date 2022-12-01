package proyecto;

import java.util.Scanner;

public class Floristeria {

	public void anadirArbol() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre del árbol: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio del árbol: ");
		double precio = entrada.nextDouble();
		System.out.println("Altura del árbol: ");
		double altura = entrada.nextDouble();
		
		//Arbol arbol = new Arbol(nombre,precio, altura);
		//arboles.add(arbol);
	}
	
	public void anadirFlor() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre de la flor: ");
		String nombre = entrada.nextLine();
		System.out.println("Color de la flor: ");
		String color = entrada.nextLine();
		System.out.println("Precio de la flor: ");
		double precio = entrada.nextDouble();
		
		//Flor flor = new Flor(nombre,precio, color);
		//flores.add(flor);
	}
	
	public void anadirDecoracion() {
		Scanner entrada = new Scanner(System.in);
		
		boolean elegido = false;
		System.out.println("Nombre de la decoración: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio de la decoración: ");
		double precio = entrada.nextDouble();
		
		int material;
		do {
			System.out.println("Elija material (0-Madera, 1-Plástico) ");
			material = entrada.nextInt();
			if(material == 0 || material == 1) {
				elegido = true;
			}else {
				System.out.println("opcion no correcta");
			}
		}while(!elegido);
		
//		Decoracion decoracion = new Decoracion(nombre,precio,material);
//		decoraciones.add(decoracion);
	}
	
	
}
