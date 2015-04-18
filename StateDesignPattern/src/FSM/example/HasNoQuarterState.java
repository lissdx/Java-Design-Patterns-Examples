package FSM.example;

import FSM.impl.StateAbstract;
import FSM.impl.StateType;

public class HasNoQuarterState extends StateAbstract {

	protected HasNoQuarterState() {
		super(new StateType("HasNoQuarterState"));
	}

	@Override
	public boolean handle() {
		return false;
	}
	
}
