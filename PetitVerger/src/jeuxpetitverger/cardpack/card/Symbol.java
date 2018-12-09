package jeuxpetitverger.cardpack.card;

public enum Symbol {
	CHERRY("cerise_"), CROW("corbeau"), SLEEP("dormant");
	

	public static final Symbol[] SYMBOL_LIST = Symbol.values();
	
	public static final int NBR_SYMBOLS = SYMBOL_LIST.length;
	
	private String display;
	
	private Symbol(String _display) {
		this.display = _display;
	}

	@Override
	public String toString() {
		return display;
	}
	
	
}
