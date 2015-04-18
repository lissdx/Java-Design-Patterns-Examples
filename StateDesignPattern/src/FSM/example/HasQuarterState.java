package FSM.example;

import FSM.impl.StateAbstract;
import FSM.impl.StateType;

public class HasQuarterState extends StateAbstract {

	protected HasQuarterState() {
		super(new StateType("HasQuarterState"));
	}

	@Override
	public boolean handle() {
		// TODO Auto-generated method stub
		return false;
	}

}
