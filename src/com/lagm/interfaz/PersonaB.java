package com.lagm.interfaz;

public interface PersonaB {
	// Default m�thod
	default public void hablar() {
		System.out.println("M�todo default - PersonaB: Hablando");
	}
}
