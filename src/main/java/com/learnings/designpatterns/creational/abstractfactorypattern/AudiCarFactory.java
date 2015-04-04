package com.learnings.designpatterns.creational.abstractfactorypattern;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating AudiCar objects.
 */
public class AudiCarFactory implements CarFactory {

	/* (non-Javadoc)
	 * @see com.learnings.designpatterns.creational.abstractfactorypattern.CarFactory#createCar(java.lang.String)
	 */
	@Override
	public Car createCar(String carType) {
		if (carType.equalsIgnoreCase("a4")) {
			return new A4();
		} else if (carType.equalsIgnoreCase("a6")) {
			return new A6();
		}
		return null;
	}

}
