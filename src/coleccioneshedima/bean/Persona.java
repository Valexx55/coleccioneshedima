package coleccioneshedima.bean;

/**
 * Bean de la clase persona
 * 
 * @author Jose
 *
 */
public class Persona {
	
	//TODO definir atributos, constructor y métodos de acceso
	
	private String nombre;
	private int edad;
	
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean son_iguales = false;
		Persona p2 = (Persona)obj;
		
			if ((this.edad == p2.edad)&&(this.nombre.equals(p2.nombre)))
			{
				son_iguales=true;
			}
		
		return son_iguales;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre + " " + this.edad;
	}
	
	

}
