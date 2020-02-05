package com.cdainfo.tamagotchi.estados;

import com.cdainfo.tamagotchi.Tamagotchi;

public class Hambriento extends Estado{

	@Override
	public void actualizarEstado(Tamagotchi tamagotchi) {
		System.out.println("Sii, comidaa :D");
		tamagotchi.setEstado(new Triste());
		
	}
	
	
	
	
	
	
	
}
/*	private Tamagotchi tamagotchi;

		public Hambriento() {
		super();
	}
	@Override
	public void jugar() {
		System.out.println("No quiero jugar!");		
	}

	@Override
	public void alimentar() {
		System.out.println("Sii, vamos a comer :D !!!");
		tamagotchi.setEstado(new Feliz());
		
	}

	@Override
	public void dormir() {
		System.out.println("No quiero dormir!");
		
	}

	@Override
	public void comoEstas() {
		System.out.println("Tengo hambre...");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi=tamagotchi;
		
	}
	
	

} */
