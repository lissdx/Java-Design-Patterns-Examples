package FSM.pull.impl;

import FSM.pull.interfaces.ChainIF;
import FSM.pull.interfaces.StateIF;

public abstract class ChainAbstract implements ChainIF {

    private StateIF currentState;
    
    public ChainAbstract( StateIF currentState ) {
        this.currentState = currentState;
    }
    
    @Override    
    public void pull() {
        currentState.pull( this );
    }

    @Override
    public void setState(StateIF state) {
        this.currentState = state;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Machine is " + currentState + "\n");
        return result.toString();
    }
}
