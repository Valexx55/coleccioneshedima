package coleccioneshedima.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import coleccioneshedima.bean.Alumno;
import coleccioneshedima.bean.ComparadorPersonas;
import coleccioneshedima.bean.ComparadorPorNombreYEdad;
import coleccioneshedima.bean.Persona;

/**
 * 
 * Clase para practicar métodos y colecciones en JAVA en nuestro curso de HEDIMA
 * 
 * @author Jose
 * @version 1.0
 * @since 25/06/2020
 * @see Persona
 *
 */
public class MainListas {

	/**
	 * 1. HACED UN MÉTODO QUE RECIBA UNA LISTA DE PERSONAS Y DEVUELVA UNA SUBLISTA
	 * SÓLO CON LOS ALUMNOS
	 * 
	 * 2. HACED UN MÉTODO QUE RECIBA DOS LISTAS DE PERSONAS Y DEVUELVA OTRA LISTA
	 * CON LOS ELEMENTOS EN COMÚN - INTERSECCIÓN -
	 * 
	 * 3. HACED UN MÉTODO QUE RECIBA UNA LISTA DE PERSONAS Y DUVUELVA LA MEDIA DE
	 * EDAD DE TODAS ELLAS
	 * 
	 * 4. HACED UN MÉTODO QUE DADOS UNA LISTA DE PERSONAS Y UNA LETRA, DEVUELVA UNA
	 * LISTA CON LAS PERSONAS CUYO NOMBRE EMPIEZA POR ESA LETRA
	 * 
	 * NOTA: TODO ESTOS MÉTODOS SERÁN PUBLIC STATIC LAS PERSONAS TIENEN EDAD Y
	 * NOMBRE
	 * 
	 * JAVADOC --> Herramienta que integra el JDK y genera la documentación
	 * automaticámente basándonse en los comentarios de las clases
	 */

	/**
	 * Construimos una lista de alumnos a partir de una lista de personas
	 * 
	 * @param list_personas la lista de personas
	 * @return la lista de alumnos
	 */
	public static List<Alumno> obtenerSublistaAlumnos(List<Persona> list_personas) {
		List<Alumno> lista_alumnos = null;

		lista_alumnos = new ArrayList<Alumno>();
		// hay que recorrer la lista de peronas
		for (Persona p : list_personas) {
			// si p es un alumno, me lo guardo en lista_alumnos
			if (p instanceof Alumno) {
				lista_alumnos.add((Alumno) p);
			}
		}

		return lista_alumnos;
	}

	/**
	 * 
	 * Obtiene la intersección de dos lista de personas
	 * 
	 * @param lp1 la lista de personas primera
	 * @param lp2 la seunda lista de personas
	 * @return los elementos en común de lp1 y lp2
	 */
	public static List<Persona> elementosComunes(List<Persona> lp1, List<Persona> lp2) {
		List<Persona> lista_comun = null;

		// recorrer lp1 --for
		// si p está en lp2 --contains
		// add p a lista común

		lista_comun = new LinkedList<Persona>();
		for (Persona p : lp1) {
			if (lp2.contains(p)) {
				lista_comun.add(p);
			}
		}

		return lista_comun;
	}

	// 3
	/**
	 * Calcular la edad media de una de lista de personas
	 * 
	 * @param lista_personas la lista de personas
	 * @return la edad media de las personas de la lista 0 si está vacía
	 */
	public static float listaMediaEdad(List<Persona> lista_personas) {
		float media_edad = 0;
		int total_edad = 0;

		// recorrer la lista de personas, ir sumando las edades y luego dividir entre el
		// número de personas
			for (Persona persona_aux : lista_personas) {
				total_edad = total_edad + persona_aux.getEdad();
			}
	
			media_edad = total_edad / lista_personas.size();

		return media_edad;
	}

	public static List<Persona> invertirListaPersonas(List<Persona> lp1) {
		List<Persona> lista_invertida = null;
			
			lista_invertida = new ArrayList<Persona>();
			
			for (int i = lp1.size() - 1; i >= 0; i--) {
				lista_invertida.add(lp1.get(i));
			}
			
		return lista_invertida;
	}
	
	/*public static List<Object> invertirListaPersonas(Object lp1) {
		List<Object> lista_invertida = null;
		List<Object> lpp1 = null;
			
		//lp1.get()
			lpp1 = (List<Object>)lp1;
			lista_invertida = new ArrayList<Object>();
			
			for (int i = lpp1.size() - 1; i >= 0; i--) {
				lista_invertida.add(lpp1.get(i));
			}
			
		return lista_invertida;
	}*/

	public static void main(String[] args) {

		Persona p1 = new Persona("Pablo", 22, "987446");
		// Persona p2 = new Persona("Pablo", 22);
		Persona p3 = new Persona("Maria", 18, "127446");
		Persona p4 = new Persona("Marta", 98, "57446");
		Persona p5 = new Persona("Alex", 44, "337446");
		Persona p6 = new Persona("Jesús", 28, "287446");
		Persona p7 = new Persona("Jesús", 30, "997446");

		List<Persona> lp1 = new ArrayList<Persona>();
		// List<Persona> lp2 = new ArrayList<Persona>();

		lp1.add(p7);
		lp1.add(p6);
		lp1.add(p1);
		lp1.add(p3);
		lp1.add(p4);
		lp1.add(p5);
		//lp1.add(p7);
		

		//System.out.println("Lista personas " + lp1);

		Collections.shuffle(lp1);

		//System.out.println("Lista personas tras shuffle " + lp1);

		Collections.sort(lp1);//ORDENAME, LA LISTA LP1
		// CALLBACK -- LLAMADA POR DETRÁS
		// CUANDO SE LLAMA UN MÉTODO DE MANERA AUTOMÁTICA
		// ANTE DETERMINADO EVENTO

		System.out.println("Lista personas tras sort natural edad " + lp1);
		
		//List<Object>lista_invertida = invertirListaPersonas(lp1);
		
		List<Persona>lista_invertida = invertirListaPersonas(lp1);
		//System.out.println("Lista invertida " + lista_invertida);
		
		
		Comparator<Persona> comparador = new ComparadorPersonas();
		
		Collections.sort(lp1, comparador);//ORDÉNAME LA LISTA LP1, USANDO ESTE COMPARADOR
		System.out.println("Lista personas tras sort total nombre" + lp1);

		
		Comparator<Persona> comparador2 = new ComparadorPorNombreYEdad();
		
		Collections.sort(lp1, comparador2);//ORDÉNAME LA LISTA LP1, USANDO ESTE COMPARADOR
		System.out.println("Lista personas tras sort total nombre Y EDAD " + lp1);

		
		// TODO HACED UN MÉTODO EN ESTA CLASE
		// QUE DADA UNA LISTA, ME DEVUELVA LA LISTA
		// DEL REVÉS
		// Lista personas tras sort
		// [Maria 18, Pablo 22, Alex 44, Marta 98]
		// RESULTADO Lista personas tras sort
		// [ Marta 98, Alex 44, Pablo 22, Maria 18]//, Pablo 22, Alex 44, Marta 98]

		// lp2.add(p2);

		/*
		 * List<Persona> lcomun = elementosComunes(lp1, lp2);
		 * 
		 * if (lcomun==null|| lcomun.size() == 0) {
		 * System.out.println("No hay elementos en común"); } else {
		 * System.out.println("Hay " + lcomun.size() +" elementos en común"); for
		 * (Persona p : lcomun) { System.out.println(p); } }
		 * 
		 * 
		 */
		
		//int numero = Integer.parseInt("sdfbsdf");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
