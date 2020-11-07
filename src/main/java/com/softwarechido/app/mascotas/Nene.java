package com.softwarechido.app.mascotas;

/**
 * 
 * Representa a un nene que juega con su mascota y es un hilo separado,
 * es decir, varios ni�os pueden jugar al mismo tiempo con su mascota
 * 
 * @author carlos
 *
 */
public class Nene implements Runnable {

	Mascota myMascota;
	
	/**
	 * 
	 * Constructor de Nene, donde se asigna la mascota
	 * 
	 * @param myMascota
	 */
	public Nene( Mascota myMascota){
		this.myMascota = myMascota;
	}
	
	/**
	 * M�todo que define como se ejecutar� este objeto Runnable, una vez que
	 * un hilo sea asociado y el m�todo hilo.start sea invocado
	 * 
	 */
	public void run(){		
		myMascota.alimentar();
		myMascota.dormir();
		myMascota.jugar();		
	}	
}
