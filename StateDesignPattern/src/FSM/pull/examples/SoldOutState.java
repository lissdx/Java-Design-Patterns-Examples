package FSM.pull.examples;

import FSM.pull.impl.StateAbstract;
import FSM.pull.interfaces.ChainIF;
import FSM.pull.interfaces.StateIF;

public class SoldOutState extends StateAbstract {

    public SoldOutState() {
        super("SoldOutState");
    }

    @Override
    public void pull(ChainIF chain) {
        if (((GumballMachineChain) chain).hasGumBall()) {
            super.pull(chain);
        }
    }

    @Override
    protected StateIF createNextState() {
        return new HasNoQuarterState();
    }

}
