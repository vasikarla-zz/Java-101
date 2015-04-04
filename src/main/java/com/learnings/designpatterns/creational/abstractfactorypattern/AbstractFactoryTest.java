package com.learnings.designpatterns.creational.abstractfactorypattern;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractFactoryTest.
 */
public class AbstractFactoryTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		CarFactory audiCarFactory = FactoryProducer.getCarFactory("audi");

		Car a4 = audiCarFactory.createCar("a4");
		a4.drive();

		Car a6 = audiCarFactory.createCar("a6");
		a6.drive();

		CarFactory bmwFactory = FactoryProducer.getCarFactory("bmw");

		Car x3 = bmwFactory.createCar("x3");
		x3.drive();

		Car x5 = bmwFactory.createCar("x5");
		x5.drive();

	}
}
