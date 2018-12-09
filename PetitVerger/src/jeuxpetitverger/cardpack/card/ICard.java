package jeuxpetitverger.cardpack.card;

public interface ICard {

	public String ToString();
	
	public Flour GerFlour();
	
	public Symbol GetSymbol();
	
	public boolean IsVoid();
	
	public void turnOver();

}
