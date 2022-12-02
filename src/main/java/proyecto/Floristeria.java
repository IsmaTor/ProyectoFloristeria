package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
	
	private List<Floristeria> arboles = new ArrayList();
	private List<Floristeria> decoraciones = new ArrayList();
	private List<Floristeria> flores = new ArrayList();
	
	private String nombre;
	
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	//método ver árboles
	public void verArboles() {
		
		if (arboles.size() > 0)
			for (Floristeria arbolesVer : arboles) {
				System.out.println(arbolesVer);
			} else {
				System.out.println("ERROR: No hay árboles en el inventario.");
			}
	}
	
	//método ver flores
	public void verFlores() {
		
		if (flores.size() > 0)
			for (Floristeria floresVer : flores) {
				System.out.println(floresVer);
			} else {
				System.out.println("ERROR: No hay flores en el inventario.");
			}
	}
	
	//método ver decoraciones
	public void verDecoraciones() {
		
		if (decoraciones.size() > 0)
			for (Floristeria decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer);
			} else {
				System.out.println("ERROR: No hay decoraciones en el inventario.");
			}
	}
}
