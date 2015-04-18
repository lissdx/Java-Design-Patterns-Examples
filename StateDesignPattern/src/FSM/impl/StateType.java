package FSM.impl;

public class StateType extends StateTypeAbstract<String> {

	public StateType(String stateType) {
		super(stateType);
	}

	@Override
	public boolean equals(Object obj) {
		return ((StateType) obj).getStateTypeValue().compareTo(
				this.getStateTypeValue()) == 0;
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("StateType : [ ");
		stringBuffer.append( this.getStateTypeValue() );
		stringBuffer.append(" ] ");
		return stringBuffer.toString();
	}

}
