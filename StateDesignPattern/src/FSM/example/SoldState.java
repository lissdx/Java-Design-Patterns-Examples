package FSM.example;

import FSM.impl.StateAbstract;
import FSM.impl.StateType;

public class SoldState extends StateAbstract {

	protected SoldState() {
		super(new StateType("SoldState"));
	}
	
	@Override
	public boolean handle() {
		// TODO Auto-generated method stub
		return false;
	}

}
