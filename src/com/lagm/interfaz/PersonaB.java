package com.lagm.interfaz;

public interface PersonaB {
	// Default méthod
	default public void hablar() {
		System.out.println("Método default - PersonaB: Hablando");
	}
}
