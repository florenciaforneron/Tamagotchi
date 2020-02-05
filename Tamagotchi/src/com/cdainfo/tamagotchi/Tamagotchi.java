package com.cdainfo.tamagotchi;

import com.cdainfo.tamagotchi.estados.Aburrido;
import com.cdainfo.tamagotchi.estados.Estado;

public class Tamagotchi {
	
	private Estado estado;
	
	public Tamagotchi() {
		this.setEstado(new Aburrido());
	}
	public void setEstado(Estado estado) {
		this.estado=estado;
	}
	public Estado getEstado() {
		return estado;


}
	@Override
	public String toString() {
		return "Tamagotchi [estado=" + estado + "]";
	}
}

