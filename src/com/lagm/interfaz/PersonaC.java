package com.lagm.interfaz;

public interface PersonaC {
	default public void hablar() {
		System.out.println("M�todo default - PersonaC: Hablando");
	}
}
