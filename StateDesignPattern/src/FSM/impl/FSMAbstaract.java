package FSM.impl;

import FSM.interfaces.FSMIF;
import FSM.interfaces.StateIF;

public abstract class FSMAbstaract implements FSMIF {

    private StateIF state;

    public FSMAbstaract(final StateIF state) {
        this.state = state;
    }

    public StateIF getState() {
        return state;
    }

    public void setState(StateIF state) {
        this.state = state;
    }

}
