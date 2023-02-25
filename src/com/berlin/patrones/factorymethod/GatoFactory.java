package com.berlin.patrones.factorymethod;

public class GatoFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		
		return new Gato();
	}

}
