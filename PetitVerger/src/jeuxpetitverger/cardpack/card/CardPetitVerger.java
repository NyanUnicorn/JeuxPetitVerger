package jeuxpetitverger.cardpack.card;

public class CardPetitVerger  extends Card{
	
	private Flour flour;
	private Symbol symbol;
	private String display;
	boolean turnedOver;
	

	public CardPetitVerger(Flour _flour, Symbol _symbol) {
		super();
		this.flour = _flour;
		this.symbol = _symbol;
		this.turnedOver = false;
		this.display = flour.toString();
	}
	
	@Override
	public void turnOver() {
		this.display = turnedOver ? symbol.toString() : flour.toString();
		 
	}


	@Override
	public Flour GerFlour() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Symbol GetSymbol() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String ToString() {
		return "["+this.display+"]";
	}

	@Override
	public boolean IsVoid() {
		return flour == Flour.VOID ? true : false;
	}

}
