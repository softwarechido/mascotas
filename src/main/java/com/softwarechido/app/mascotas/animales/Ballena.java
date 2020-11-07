package com.softwarechido.app.mascotas.animales;

/**
* Esta clase representa una ballena
* 
* @author fofo@softwarechido.com
*/ 
public class Ballena extends Animal {

	/**
	 * Contructor de Ballena
	 * 
	 * @param id Nombre del animal, o identificador unico
	 * @param foto Ruta del archivo en formato jpg de la foto
	 */
	public Ballena(String id, String foto) {
		super(id, foto);
	}

	@Override
	public void comer() {
		System.out.println(id+": Soy una ballena y me estoy comiendo un calamar...");	
	}
}
