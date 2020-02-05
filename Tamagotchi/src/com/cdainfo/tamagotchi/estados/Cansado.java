package com.cdainfo.tamagotchi.estados;

import com.cdainfo.tamagotchi.Tamagotchi;

public class Cansado extends Estado{

	@Override
	public void actualizarEstado(Tamagotchi tamagotchi) {
		System.out.println("Buenas noches!");
		tamagotchi.setEstado(new Hambriento());
		
	}

	
	
	
	
}	
	
/*	private Tamagotchi tamagotchi;

	public Cansado() {
		super();
	}
	@Override
	public void jugar() {
		System.out.println("No quiero jugar, quiero dormir!");
		
	}

	@Override
	public void alimentar() {
		System.out.println("No quiero comer, quiero dormir!");
		
	}

	@Override
	public void dormir() {
		System.out.println("Sii!Por fin a dormir, buenas noches!!!");
		tamagotchi.setEstado(new Hambriento());
		
	}

	@Override
	public void comoEstas() {
		System.out.println("zzzzzzzzzzzz");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi=tamagotchi;
		
		
	}

} */
