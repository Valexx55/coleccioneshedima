package coleccioneshedima.bean;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona>{//ORDEN "TOTAL"

	/**
	 * si persona1 es MAYOR, devuelvo un número positivo
	 * si persona2 es MAYOR, devuelvo un número negativo
	 * si son IGUALES, devuelvo un cero
	 */
	@Override
	public int compare(Persona persona1, Persona persona2) {
		int resultado = 0;
		
			resultado = persona1.getNombre().compareTo(persona2.getNombre());
			//resultado = persona2.getNombre().compareTo(persona1.getNombre());

		return resultado;
	}
	
	

}
