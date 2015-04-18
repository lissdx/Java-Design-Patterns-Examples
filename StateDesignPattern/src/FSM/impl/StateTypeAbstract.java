package FSM.impl;


public abstract class StateTypeAbstract<T>{
	
	private final T stateTypeValue;
	
	public StateTypeAbstract( T stateTypeValue ) {
		this.stateTypeValue = stateTypeValue;
	}
	
	protected T getStateTypeValue(){
		return stateTypeValue;
	}
	
}
