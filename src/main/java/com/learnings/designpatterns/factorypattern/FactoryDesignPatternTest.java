package com.learnings.designpatterns.factorypattern;

/**
 * The Class FactoryDesignPatternTest.
 */
public class FactoryDesignPatternTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		//Before FDP
		/*Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		Monkey m = new Monkey();
		m.eat();*/
		
		
		
		//With FDP
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.createAnimal("monkey");
		animal.eat();
		
	}
}
