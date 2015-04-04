package com.learnings.designpatterns.creational.abstractfactorypattern;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating BMWCar objects.
 */
public class BMWCarFactory implements CarFactory {

	/* (non-Javadoc)
	 * @see com.learnings.designpatterns.creational.abstractfactorypattern.CarFactory#createCar(java.lang.String)
	 */
	@Override
	public Car createCar(String carType) {
		if (carType.equalsIgnoreCase("x3")) {
			return new X3();
		} else if (carType.equalsIgnoreCase("x5")) {
			return new X5();
		}
		return null;
	}

}
