package com.learnings.designpatterns.creational.abstractfactorypattern;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryProducer.
 */
public class FactoryProducer {
	
	/**
	 * Gets the car factory.
	 *
	 * @param factType the fact type
	 * @return the car factory
	 */
	public static CarFactory getCarFactory(String factType) {
		if (factType.equalsIgnoreCase("audi")) {
			return new AudiCarFactory();
		} else if (factType.equalsIgnoreCase("bmw")) {
			return new BMWCarFactory();
		}
		return null;
	}
}
