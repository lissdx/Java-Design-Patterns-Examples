package FSM.example;

import FSM.impl.StateAbstract;
import FSM.impl.StateType;

public class WinnerState extends StateAbstract {

	protected WinnerState() {
		super(new StateType("WinnerState"));
	}
	
	@Override
	public boolean handle() {
		// TODO Auto-generated method stub
		return false;
	}

}
