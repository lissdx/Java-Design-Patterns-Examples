package FSM.example;

import FSM.impl.FSMAbstaract;
import FSM.interfaces.StateIF;

public class GumballMachine extends FSMAbstaract {
    private final static StateIF hasNoQuarterState = new HasNoQuarterState();
    private final static StateIF hasQuarterState   = new HasQuarterState();
    private final static StateIF soldOutState      = new SoldOutState();
    private final static StateIF soldState         = new SoldState();
    // private final static StateIF winnerState = new WinnerState();

    private int                  gumBallCount;

    public GumballMachine(int gumBallCount) {
        super(hasNoQuarterState);
        if (gumBallCount > 0) {
            this.gumBallCount = gumBallCount;
        }
    }

    public void insertQuarter() {
        if (this.getState() == hasNoQuarterState) {
            System.out.println("Quater Inserted");
            setState(hasQuarterState);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void turnCrank() {
        if (this.getState() == hasQuarterState) {

            if (gumBallCount > 0) {
                --gumBallCount;
                System.out.println("Crank turned");
                setState(soldState);
                dispenseGumball();
            } else {
                System.err.println("Unexpected state error");
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void dispenseGumball() {
        if (this.getState() == soldState) {
            if (gumBallCount > 0) {
                setState(hasNoQuarterState);
            } else {
                setState(soldOutState);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void refill() {
        if (this.getState().equals(soldOutState)) {
            gumBallCount = 5;
            setState(hasNoQuarterState);
        } else {
            throw new UnsupportedOperationException();
        }
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
        result.append("Machine is " + getState() + "\n");
        return result.toString();
    }

}
