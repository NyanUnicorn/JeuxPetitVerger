package jeuxpetitverger.cardpack.card;


public enum Flour {
	RED("rouge__"), YELLOW("jaune__"), WHITE("blanc__"), BLUE("bleu___"), PURPLE("violet_"), VOID("_______");
	
	public static final Flour[] FLOUR_LIST = Flour.values();
	
	public static final int NBR_FLOURS = FLOUR_LIST.length;
	
	private String display;
	
	Flour(String _display) {
		this.display = _display;
	}

	@Override
	public String toString() {
		return display;
	}
	
	
}
