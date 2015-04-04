package com.learnings.designpatterns.creational.abstractfactorypattern;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Car objects.
 */
public interface CarFactory {

	/**
	 * Creates a new Car object.
	 *
	 * @param carType the car type
	 * @return the car
	 */
	public Car createCar(String carType);
}
