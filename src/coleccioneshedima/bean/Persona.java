package coleccioneshedima.bean;

/**
 * Bean de la clase persona
 * 
 * @author Jose
 *
 */
public class Persona implements Comparable<Persona> {
	
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


	//COVENCIÓN ES ESTA
	/**
	 * si THIS es mayor --> devuelvo un num positivo
	 * si THIS es menor --> devuelvo un num negativo
	 * si son iguales --> devuelvo cero
	 */
	
	@Override
	public int compareTo(Persona persona) {
		// TODO Auto-generated method stub
		int resultado = 0;
		
/*			if (this.edad>o.edad)
			{
				resultado= 1;
			} else if (this.edad<o.edad)
			{
				resultado = -1;
			}*/
			resultado = this.edad-persona.edad;
			//resultado = this.nombre.compareTo(persona.nombre);
			
		
		return resultado;
	}
	
	

}
