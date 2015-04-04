package com.learnings.designpatterns.creational.internacefactorypattern;

/**
 * A factory for creating Animal objects.
 */
public class AnimalFactory {

	/**
	 * Creates a new Animal object.
	 *
	 * @param animalType the animal type
	 * @return the animal
	 */
	public Animal createAnimal(String animalType) {

		if (animalType == null) {
			return null;
		}

		if (animalType.equalsIgnoreCase("cat")) {
			return new Cat();
		} else if (animalType.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (animalType.equalsIgnoreCase("monkey")) {
			return new Monkey();
		}
		return null;
	}
}
