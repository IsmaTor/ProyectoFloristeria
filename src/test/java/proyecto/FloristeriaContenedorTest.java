package proyecto;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class FloristeriaContenedorTest {
	
	static ArrayList<Floristeria> contenedor = new ArrayList<Floristeria>();

	@Test
	public void crearFloristeria() {
			
			String nombre = "navarro";
			
			for ( int i = 0; i < contenedor.size(); i++) {
				
				while(contenedor.get(i).getNombre().equals(nombre)) {
				
					if (contenedor.get(i).getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("El nombre introducido ya existe.");
					
					} 
				}
			}
		}
	
	@Test
	public void verArboles() {
		
		if (contenedor.size() > 0)
			for (Floristeria ver : contenedor) {
				System.out.println(ver);
			} else {
				System.out.println("ERROR");
			}
	}

}
