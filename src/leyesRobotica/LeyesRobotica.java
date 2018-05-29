package leyesRobotica;
public class LeyesRobotica {

	private String leyes = 
			"1) Un robot no hará daño a un ser humano, ni permitirá con su inacción que sufra daño.\n" + 
			"2) Un robot debe cumplir las órdenes dadas por los seres humanos, a excepción de aquellas que entrasen en conflicto con la primera ley\n" + 
			"3) Un robot debe proteger su propia existencia en la medida en que esta protección no entre en conflicto con la primera o con la segunda ley.";
	
	public final static String USUARIO = "delucas";

	
	public String mostrar() {
		String respuesta = "@" + USUARIO + ", las leyes de la robotica son:\n";

		return respuesta + leyes;
	}

}
