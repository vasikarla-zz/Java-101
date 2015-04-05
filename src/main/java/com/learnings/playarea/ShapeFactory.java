package com.learnings.playarea;

public class ShapeFactory extends AbstractFactory{

	public Shape createShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color createColor(String colortype) {
		// TODO Auto-generated method stub
		return null;
	}
}
