package com.lagm;

import com.lagm.interfaz.PersonaA;
import com.lagm.interfaz.PersonaB;
import com.lagm.interfaz.PersonaC;

public class DefaultMethod implements PersonaA, PersonaB, PersonaC {

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar(); // Método default (por defecto)
	}

	@Override
	public void caminar() {
		System.out.println("Caminando");
	}

	@Override
	public void hablar() {
		PersonaA.super.hablar();
		PersonaB.super.hablar();
		PersonaC.super.hablar();
	}
}
