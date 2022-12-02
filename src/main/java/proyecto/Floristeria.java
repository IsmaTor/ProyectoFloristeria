package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {
	static Scanner entrada = new Scanner(System.in);
	
	private static List<Arbol> arboles = new ArrayList();
	private static List<Decoracion> decoraciones = new ArrayList();
	private static List<Flor> flores = new ArrayList();
	
	
	private String nombre;
	
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	//método ver árboles
	public static void mostrarArboles() {
		
		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
			} else {
				System.out.println("ERROR: No hay árboles en el inventario.");
			}
	}
	
	//método ver flores
	public static void mostrarFlores() {
		
		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
			} else {
				System.out.println("ERROR: No hay flores en el inventario.");
			}
	}
	
	//método ver decoraciones
	public static void mostrarDecoraciones() {
		
		if (decoraciones.size() > 0)
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
			} else {
				System.out.println("ERROR: No hay decoraciones en el inventario.");
			}
	}
	
	//método ver stock
	public static void mostrarStock() {
		int opcion = 0;
		
		try { 
			
			do {
				System.out.println("Escoge una opción: \n"
						+ "1. Mostrar árboles \n"
						+ "2. Mostrar flores \n"
						+ "3. Mostrar decoraciones \n"
						+ "4. Mostrar todos los productos \n"
						+ "0. Salir.");
				
				opcion = entrada.nextInt();
				
				switch (opcion) {
				
				case 1:
					System.out.println("INVENTARIO DE ÁRBOLES");
					mostrarArboles();
					break;
					
				case 2:
					System.out.println("INVENTARIO DE FLORES");
					mostrarFlores();
					break;
					
				case 3:
					System.out.println("INVENTARIO DE DECORACIONES");
					mostrarDecoraciones();
					break;
					
				case 4:
					System.out.println("INVENTARIO DE ÁRBOLES");
					mostrarArboles();
					System.out.println("INVENTARIO DE FLORES");
					mostrarFlores();
					System.out.println("INVENTARIO DE DECORACIONES");
					mostrarDecoraciones();
					break;
					
				case 0: 
					System.out.println("Adios.");
					break;
					
				default:
					System.out.println("ERROR opción no aceptada.");
					break;
					
				}
				
			} while (opcion != 0);
			
		} catch (Exception ex) {
			System.out.println("ERROR solo introducir números.");
		}
	}
}
