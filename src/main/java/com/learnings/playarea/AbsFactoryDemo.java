package com.learnings.playarea;

public class AbsFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape c = shapeFactory.createShape("circle");
		c.name();
		
		Shape sq = shapeFactory.createShape("square");
		sq.name();
	}
}
