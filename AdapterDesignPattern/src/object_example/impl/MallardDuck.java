package object_example.impl;

import object_example.interfaces.DuckIF;

public class MallardDuck implements DuckIF {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
