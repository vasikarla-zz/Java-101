package com.learnings.playarea;

public abstract class AbstractFactory {

	public abstract Color createColor(String colortype);
	public abstract Shape createShape(String shapeType);
}
