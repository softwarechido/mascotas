package com.softwarechido.app.mascotas.animales;

/**
 * Esta clase representa un animal vivo
 * 
 * @author fofo@softwarechido.com
 */
public abstract class Animal {
	
	String foto;
	String id;
	boolean hambre;
	
	/**
	 * Contructor de animal
	 * 
	 * @param id Nombre del animal, o identificador unico
	 * @param foto Ruta del archivo en formato jpg de la foto
	 */
	public Animal( String id, String foto){
		this.id = id;
		this.foto = foto;
		hambre = false;
		System.out.println(id+": Nace y es de tipo: "+getClass());				
	}
	
	/**
	 * Imprime en la consola cuando el Animal esta durmiendo
	 *
	 */ 
	public void dormir(){
		System.out.println(id+": El animal esta durmiendo...zzZZzzZZ!");
	}
	
	/**
	 * Imprime en la consola cuando el Animal esta comiendo
	 *
	 */ 
	public abstract void comer();

}
