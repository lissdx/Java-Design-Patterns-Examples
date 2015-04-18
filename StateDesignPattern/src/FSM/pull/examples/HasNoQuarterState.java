package FSM.pull.examples;

import FSM.pull.impl.StateAbstract;
import FSM.pull.interfaces.StateIF;

public class HasNoQuarterState extends StateAbstract {

    public HasNoQuarterState() {
        super("HasNoQuarterState");
    }

    @Override
    protected StateIF createNextState() {        
        return new HasQuarterState();
    }

}
