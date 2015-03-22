
public class Fighter extends AbstractFighter {

	public Fighter(String fighterName, FighterPunchStrategyIF punchStrategy,
			FighterKickStrategyIF kickStrategy) {
		super(fighterName, punchStrategy, kickStrategy);
	}

	@Override
	public void displayFighter() {
		String displayFighterStr = "I'm Fighter [ " + getFighterName() + "]";
		
		System.out.println( displayFighterStr );

	}

}
