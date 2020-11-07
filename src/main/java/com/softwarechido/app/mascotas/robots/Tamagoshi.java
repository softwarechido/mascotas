package com.softwarechido.app.mascotas.robots;

import com.softwarechido.app.mascotas.Mascota;

/**
 * Robot digital que simula el comportamiento de una mascota
 * 
 * @author fofo@softwarechido.com
 */
public class Tamagoshi implements Mascota{
	
	/**
	 * Constructor de Tamgoshi
	 *
	 */
	public Tamagoshi(){
	}
	
	/**
	 * Representa la forma de dormir a la mascota
	 */
	public void dormir(){
		System.out.println(getClass()+": zzZZzzZZ!");
	}
	
	/**
	 * Representa la forma de comer de la mascota
	 */
	public void comer(){
		System.out.println(getClass()+": Chaka chaka como bytes");		
	}

	/**
	 * Representa la forma de alimentar y comer a la mascota
	 */
	public void alimentar() {
		comer();
	}

	/**
	 * Representa la forma de jugar de la mascota
	 */
	public void jugar() {
		System.out.println(getClass()+": Chaka Chaka... Ta chido tu Wii...");		
	}
}
