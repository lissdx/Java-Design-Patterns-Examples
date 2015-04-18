package FSM.example;

import FSM.impl.StateAbstract;
import FSM.impl.StateType;

public class SoldOutState extends StateAbstract {

	protected SoldOutState() {
		super(new StateType("SoldOutState"));
	}	
	@Override
	public boolean handle() {
		throw new UnsupportedOperationException();
	}

}
