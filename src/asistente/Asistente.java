package asistente; 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import leyesRobotica.LeyesRobotica;

public class Asistente {
	private String nombre;

	public Asistente(String nombre) {
		this.nombre = nombre;
	}

	public String escuchar(String mensaje) {

		final String regex = "(@" + this.nombre + ")(?: cu[á|a]les son | recordame )(las leyes de la rob[o|ó]tica)";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(mensaje);

		if (matcher.find()){
			
			return new LeyesRobotica().mostrar();
		}

		return "Disculpa... no entiendo el pedido, @delucas ¿podrías repetirlo?";
	}
	
}
