package com.lagm.interfaz;

public interface PersonaC {
	default public void hablar() {
		System.out.println("Método default - PersonaC: Hablando");
	}
}
