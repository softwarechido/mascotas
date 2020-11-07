package com.softwarechido.app.mascotas.animales;

import com.softwarechido.app.mascotas.Mascota;

/**
 * 
 * Esta clase modela el comportamiento de un gato
 * 
 * @author fofo@softwarechido.com
 * 
 */
public class Gato extends Animal implements Mascota {

	/**
	 * Contructor de Gato
	 * 
	 * @param id Nombre del animal, o identificador unico
	 * @param foto Ruta del archivo en formato jpg de la foto
	 */
	public Gato(String id, String foto) {
		super(id, foto);
	}

	@Override
	public void comer() {
		System.out.println(id+": Yo soy un gato y me estoy comiendo un salmon...");
	}

	/**
	 * Implementa el metodo de la interfaz Mascota.alimentar(), delegando la 
	 * ejecucion a comer.
	 */
	public void alimentar() {
		comer();
	}

	
	/**
	 * Implementa el metodo de la interfaz Mascota.jugar(), imprimiendo
	 * en una cadena de caracteres, la forma de jugar con el gato
	 */
	public void jugar() {
		System.out.println(id+": Miauu Miauu... Estamos jugando...");		
	}
	
}
