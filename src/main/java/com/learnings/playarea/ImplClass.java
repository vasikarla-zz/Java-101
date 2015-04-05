package com.learnings.playarea;

public class ImplClass {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape c = factory.createShape("circle");
		c.name();
		
		Shape r = factory.createShape("rectangle");
		r.name();
		
		Shape s = factory.createShape("square");
		s.name();
		
	}
}
