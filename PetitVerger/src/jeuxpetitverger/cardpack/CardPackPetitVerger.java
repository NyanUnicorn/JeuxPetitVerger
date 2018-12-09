package jeuxpetitverger.cardpack;

import java.util.ArrayList;

import jeuxpetitverger.cardpack.card.Card;
import jeuxpetitverger.cardpack.card.CardPetitVerger;
import jeuxpetitverger.cardpack.card.Flour;
import jeuxpetitverger.cardpack.card.Symbol;

public class CardPackPetitVerger extends CardPack{

	public CardPackPetitVerger() {
		cards = new ArrayList<Card>();
		initPack();
	}

	private void initPack() {
		Card c;
		for(Flour flour : Flour.FLOUR_LIST) {
			for(Symbol symbol : Symbol.SYMBOL_LIST) {
				if(flour != Flour.VOID) {
					c = new CardPetitVerger(flour, symbol);
					cards.add(c);
				}
				
			}
		}
	}
	
	
	@Override
	public void TurnOverCard(int _index) {
		cards.get(_index).turnOver();		
	}

}
