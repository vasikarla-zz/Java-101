package com.learnings.playarea;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color createColor(String colorType) {
		if (colorType.equalsIgnoreCase("red")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("black")) {
			return new Black();
		} else if (colorType.equalsIgnoreCase("red")) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape createShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
}
