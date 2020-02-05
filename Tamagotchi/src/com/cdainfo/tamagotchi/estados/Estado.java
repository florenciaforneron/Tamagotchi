package com.cdainfo.tamagotchi.estados;

import com.cdainfo.tamagotchi.Tamagotchi;

public abstract class Estado {
	
	private Tamagotchi tamagotchi;
	
	public void jugar() {
		System.out.println("Sii, quiero jugar!!");
		
	}

	public void alimentar() {
		System.out.println("Sii,comida :D");
		
	}

	
	public void dormir() {
		System.out.println("Buenas noches!");
	}


	public abstract void actualizarEstado(Tamagotchi tamagotchi);




	

}
