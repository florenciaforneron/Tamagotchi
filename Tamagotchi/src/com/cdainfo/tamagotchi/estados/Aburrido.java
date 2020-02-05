package com.cdainfo.tamagotchi.estados;

import com.cdainfo.tamagotchi.Tamagotchi;

public class Aburrido extends Estado {

	@Override
	public void actualizarEstado(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Cansado());
		
	}



}
/*	@Override
	public void actualizarEstado() {
		
		tamagotchi.setEstado(new Cansado());
		tamagotchi.jugar();
*/		
	
	
	
	
	
	
	/*	@Override
	public void jugar() {
		System.out.println("Jugamos??");
		tamagotchi.setEstado(new Cansado());
		}
	
	public void comoEstas() {
		System.out.println("Estoy aburrido...");
		};
}
		
		@Override
	public void jugar() {
		System.out.println("Jugamos??");
		tamagotchi.setEstado(new Cansado());
		
	}

	@Override
	public void alimentar() {
		System.out.println("No quiero comer, quiero jugar!");
		
	}

	@Override
	public void dormir() {
		System.out.println("No quiero dormir, juguemos porfi!!");
		
	}

	@Override
	public void comoEstas() {
		System.out.println("Estoy aburrido");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi=tamagotchi;
		
	} */


