package FSM.pull.examples;

import FSM.pull.impl.ChainAbstract;

public class GumballMachineChain extends ChainAbstract {

    private static int gumBallCount = 0;

    public GumballMachineChain(int gumBallCount) {
        super(new HasNoQuarterState());
        GumballMachineChain.gumBallCount = gumBallCount;
    }

    public boolean hasGumBall() {
        return GumballMachineChain.gumBallCount > 0;
    }
    
    public boolean soldGumBall() {
        boolean result = false;
        if (GumballMachineChain.gumBallCount > 0) {
            --GumballMachineChain.gumBallCount;
            result = true;
        }

        return result;
    }

    public void refillGumBall( int gumBallCount ){
        if( gumBallCount >= 0 ){
            GumballMachineChain.gumBallCount = gumBallCount;
        }
    }
    
    @Override
    public void pull() {
        // TODO Auto-generated method stub
        super.pull();
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + gumBallCount + " gumball");
        if (gumBallCount != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append(super.toString());
        return result.toString();
    }
}
