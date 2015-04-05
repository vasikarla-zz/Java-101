package com.learnings.designpatterns.creational.singletonpattern;

public class Singleton {

	public static Singleton uniqueInstance;
	public static int a = 10;
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public void sample(String name) {
		System.out.println("This is Sample : " + name);
	}
}
