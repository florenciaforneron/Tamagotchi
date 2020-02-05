package com.cdainfo.tamagotchi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tamagotchi miTamagotchi = new Tamagotchi();
		
		System.out.println(miTamagotchi.getEstado());
		
	}
}
/*		Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar acción: " +
                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': miTamagotchi.getEstado(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }

	}
	}*/

