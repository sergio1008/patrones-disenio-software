package com.berlin.patrones;

import com.berlin.patrones.builder.Persona;
import com.berlin.patrones.builder.Persona.PersonaBuilder;
import com.berlin.patrones.factorymethod.Animal;
import com.berlin.patrones.factorymethod.GatoFactory;
import com.berlin.patrones.factorymethod.PerroFactory;
import com.berlin.patrones.factorymethod.Propietario;
import com.berlin.patrones.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		// ejemplo singleton
		Singleton singleton = Singleton.getInstance();
		singleton.setEmail("sergiobernalc@outlook.com");
		singleton.setNombre("Sergio");
		System.out.println(String.format("Nombre : %s , email : %s", singleton.getNombre(), singleton.getEmail()));

		Singleton singleton2 = Singleton.getInstance();
		singleton2.setNombre("Checho GP");
		System.out.println(String.format("Nombre : %s , email : %s", singleton.getNombre(), singleton.getEmail()));

		// factory method

		GatoFactory gatoFactory = new GatoFactory();
		Animal gato = gatoFactory.createAnimal();

		PerroFactory perroFactory = new PerroFactory();
		Animal perro = perroFactory.createAnimal();

		Propietario sharon = new Propietario();
		sharon.setNombre("Sharon");
		sharon.setMascota(gato);

		Propietario sergio = new Propietario();
		sergio.setNombre("Sharon");
		sergio.setMascota(perro);

		System.out.println(String.format("%s : %s", sharon.getNombre(), sharon.getMascota().emitirSonido()));
		System.out.println(String.format("%s : %s", sergio.getNombre(), sergio.getMascota().emitirSonido()));

		// builder example

		Persona p = Persona.builder().nombre("sergio").edad(31).build();
		System.out.println(p.getNombre() + "Bernal" + p.getEdad());
		
	
		;
	}

}
