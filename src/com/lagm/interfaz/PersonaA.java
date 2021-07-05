package com.lagm.interfaz;

public interface PersonaA {
	void caminar();
	
	// Default méthod
	default public void hablar() {
		System.out.println("Método default - PersonaA: Hablando");
	}
}
