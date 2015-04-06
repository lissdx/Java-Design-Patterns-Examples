package object_example.adapter;

import object_example.interfaces.DuckIF;
import object_example.interfaces.TurkeyIF;

public class DuckAdapter implements TurkeyIF {
	private final DuckIF duck;

	public DuckAdapter(final DuckIF duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
