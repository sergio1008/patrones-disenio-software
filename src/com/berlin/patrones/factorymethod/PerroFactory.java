package com.berlin.patrones.factorymethod;

public class PerroFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Perro();
	}

}
