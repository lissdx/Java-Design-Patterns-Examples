package FSM.pull.examples;

import FSM.pull.impl.StateAbstract;
import FSM.pull.interfaces.ChainIF;
import FSM.pull.interfaces.StateIF;

public class HasQuarterState extends StateAbstract {

    public HasQuarterState() {
        super("HasQuarterState");
    }

    @Override
    public void pull(ChainIF chain) {
        if (((GumballMachineChain) chain).soldGumBall()) {
            super.pull(chain);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    protected StateIF createNextState() {
        return new SoldState();
    }

}
