package FSM.impl;

import FSM.interfaces.StateIF;


public abstract class StateAbstract implements StateIF {
	private final StateType stateType;
	
	protected StateAbstract( StateType stateType ) {
		this.stateType = stateType;
	}
	
	@Override
	public boolean handle() {
		return false;
	}
	
	@Override
	public String toString() {
	    return stateType.toString();
	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		if( obj instanceof S)
//		return super.equals(obj);
//	}
}
