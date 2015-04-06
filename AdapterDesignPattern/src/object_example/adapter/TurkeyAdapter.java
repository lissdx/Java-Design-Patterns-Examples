package object_example.adapter;

import object_example.interfaces.DuckIF;
import object_example.interfaces.TurkeyIF;

public class TurkeyAdapter implements DuckIF {
	private final TurkeyIF turkey;

	public TurkeyAdapter(final TurkeyIF turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int cnt = 0; cnt < 5; cnt++) {
			turkey.fly();
		}
	}

}
