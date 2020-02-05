package com.cdainfo.tamagotchi.estados;

import com.cdainfo.tamagotchi.Tamagotchi;

public class Triste extends Estado {

	@Override
	public void actualizarEstado(Tamagotchi tamagotchi) {
		System.out.println("Contame un chiste!");
		tamagotchi.setEstado(new Feliz());
		
	}
	

}

	
	
	
	
	
	
	/*private Tamagotchi tamagotchi;
	
	
	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comoEstas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi=tamagotchi;
		
	}

}
*/