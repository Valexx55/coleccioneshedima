package coleccioneshedima.bean;

import java.util.Comparator;

public class ComparadorPorNombreYEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int resultado = 0;
		
			resultado = o1.getNombre().compareTo(o2.getNombre());
			if (resultado==0)
			{
				//estamos en empate en nombres
				resultado = o1.getEdad()-o2.getEdad();
			}
		
		return resultado;
	}

}
