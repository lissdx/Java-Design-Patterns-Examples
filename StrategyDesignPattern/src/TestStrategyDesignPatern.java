
public class TestStrategyDesignPatern {

	public static void main(String[] args) {
		Fighter redFighter = new Fighter( "Red Fighter", new FighterPunchStrategyBruceLee(), new FighterKickStrategyBruceLee());
		
		redFighter.displayFighter();
		redFighter.doPunch();
		redFighter.doKick();
		
		redFighter.setKick(new FighterKickStrategyMuhammadAli());
		
		redFighter.displayFighter();
		redFighter.doPunch();
		redFighter.doKick();		

	}

}
