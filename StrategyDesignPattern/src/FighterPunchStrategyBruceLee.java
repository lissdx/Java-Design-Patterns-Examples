
public class FighterPunchStrategyBruceLee implements FighterPunchStrategyIF {

	@Override
	public void doPunch() {
		String doPunchStr = "FighterPunchStrategyBruceLee - I punch always before you.";
		System.out.println( doPunchStr );
	}

}
