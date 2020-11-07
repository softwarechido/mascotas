package com.softwarechido.app.mascotas.animales;

import com.softwarechido.app.mascotas.Mascota;

public class Perro extends Animal implements Mascota {

	public Perro(String id, String foto) {
		super(id, foto);
	}

	public void comer() {
		System.out.println(id+": Soy un perro y me estoy comiendo croquetas...");
	}

	public void alimentar() {
		comer();		
	}

	public void jugar() {
		System.out.println(id+": Woof woof... Estamos jugando...");		
	}
}
