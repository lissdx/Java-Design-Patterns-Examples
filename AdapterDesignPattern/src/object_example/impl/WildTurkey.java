package object_example.impl;

import object_example.interfaces.TurkeyIF;

public class WildTurkey implements TurkeyIF {

	@Override
	public void gobble() {
		System.out.println("Gobble, gobble");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance!");

	}

}
