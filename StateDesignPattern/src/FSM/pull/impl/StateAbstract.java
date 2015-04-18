package FSM.pull.impl;

import FSM.pull.interfaces.ChainIF;
import FSM.pull.interfaces.StateIF;

public abstract class StateAbstract implements StateIF {
    private final String stateID;

    protected StateAbstract(final String stateID) {
        this.stateID = stateID;
    }

    public String getStateID() {
        return stateID;
    }

    @Override
    public void pull(ChainIF chain) {
        chain.setState(createNextState());
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append( "State : [ ");
        stringBuffer.append( stateID );
        stringBuffer.append( " ] ");
        return stringBuffer.toString();
    }   
    
    @Override
    public boolean equals(Object obj) {        
        return this.toString().compareTo(obj.toString()) == 0;
    }
    
    // Implement this for any new State
    // It will be a next link in chain
    protected StateIF createNextState(){ return null; };
}
