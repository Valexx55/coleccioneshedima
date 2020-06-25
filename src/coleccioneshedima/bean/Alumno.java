package coleccioneshedima.bean;

/**
 * Bean de la clase alumno
 * 
 * @author Jose
 *
 */
public class Alumno extends Persona {

	private int nota;
	
	
	public Alumno(String nombre, int edad, int nota) {
		super(nombre, edad);
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
}
