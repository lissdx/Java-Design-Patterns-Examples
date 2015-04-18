package FSM.pull.interfaces;

public interface ChainIF {
    public void setState( StateIF state );
    public void pull();
}
