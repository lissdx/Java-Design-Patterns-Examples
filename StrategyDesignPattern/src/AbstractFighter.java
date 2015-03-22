public abstract class AbstractFighter {

	private final String fighterName;
	private FighterPunchStrategyIF punchStrategy;
	private FighterKickStrategyIF kickStrategy;

	AbstractFighter(final String fighterName,
			FighterPunchStrategyIF punchStrategy,
			FighterKickStrategyIF kickStrategy) {
		this.fighterName = fighterName;
		this.punchStrategy = punchStrategy;
		this.kickStrategy = kickStrategy;
	}

	public void doPunch() {
		this.punchStrategy.doPunch();
	};

	public void doKick() {
		this.kickStrategy.doKick();
	};

	public void setPunch(FighterPunchStrategyIF punchStrategy) {
		this.punchStrategy = punchStrategy;
	};

	public void setKick(FighterKickStrategyIF kickStrategy) {
		this.kickStrategy = kickStrategy;
	};

	public String getFighterName() {
		return fighterName;
	}

	public abstract void displayFighter();
}
