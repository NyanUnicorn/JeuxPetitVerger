package controler;


public enum PetitVergerAction {
	THROWDICE("ThrowADice"), TURNCARD("TurnOverACard->Value");
	
	private static final PetitVergerAction[] symboles = PetitVergerAction.values();
	
	private String display;
	
	private PetitVergerAction(String _display) {
		this.display = _display;
	}
}
