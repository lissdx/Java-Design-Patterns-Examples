package FSM.pull.examples;

import FSM.pull.impl.StateAbstract;
import FSM.pull.interfaces.ChainIF;
import FSM.pull.interfaces.StateIF;

public class SoldState extends StateAbstract {

    public SoldState() {
        super("SoldState");
    }

    @Override
    public void pull(ChainIF chain) {
        if (((GumballMachineChain) chain).hasGumBall()) {
            chain.setState( new HasNoQuarterState());
        } else {
            chain.setState( new SoldOutState());
        }
    }
}
