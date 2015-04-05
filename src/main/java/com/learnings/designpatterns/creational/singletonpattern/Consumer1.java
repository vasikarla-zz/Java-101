package com.learnings.designpatterns.creational.singletonpattern;

public class Consumer1 {

	public static void main(String[] args) {

		Singleton single = new Singleton();
		System.out.println(single.a);
		
	}
}
