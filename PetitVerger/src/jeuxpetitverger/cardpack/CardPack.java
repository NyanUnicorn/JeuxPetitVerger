package jeuxpetitverger.cardpack;

import java.util.List;

import jeuxpetitverger.cardpack.card.Card;
import jeuxpetitverger.cardpack.card.ICard;

public abstract class CardPack implements ICardPack{
	
	public List<Card> cards;

	public CardPack() {
		super();
	}

}
