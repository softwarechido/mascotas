package com.softwarechido.app.mascotas;

import com.softwarechido.app.mascotas.animales.Gato;
import com.softwarechido.app.mascotas.animales.Perro;
import com.softwarechido.app.mascotas.robots.Tamagoshi;

/**
 * Hello world!
 *
 */
public class App 
{
			
		public static void main (String args[]){
		
			/* Creando un jobs para para cada nene con su mascota */
			Runnable job  = new Nene( new Gato("Benito","benito.jpg"));
			Runnable job2 = new Nene( new Perro("Scooby","scooby.jpg"));
			Runnable job3 = new Nene( new Tamagoshi());		
			
			/* El Job lo asociamos a un hilo de ejecucion*/
			Thread myThread  = new Thread(job);
			Thread myThread2 = new Thread(job2);
			Thread myThread3 = new Thread(job3);
					
			/* Cada hilo de ejecucion se inicia por separado */
			myThread.start();
			myThread2.start();
			myThread3.start();
		}	
	
}
