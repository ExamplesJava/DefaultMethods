package com.lagm.interfaz;

public interface PersonaA {
	void caminar();
	
	// Default m�thod
	default public void hablar() {
		System.out.println("M�todo default - PersonaA: Hablando");
	}
}
