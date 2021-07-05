package com.lagm;

import com.lagm.interfaz.PersonaA;
import com.lagm.interfaz.PersonaB;

public class DefaultMethod implements PersonaA {

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar(); // Método default (por defecto)
	}

	@Override
	public void caminar() {
		System.out.println("Caminando");
	}
}
