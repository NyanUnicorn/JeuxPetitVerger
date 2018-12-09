package view.bus;

import controler.GameState;
import jeuxpetitverger.cardpack.CardPack;

public class BusPetitVerger {
	
	public CardPack pack;
	public int cherryCount;
	public int crowPosition;
	public GameState state;
	public int SecondsToWait;
	public String Message;

	public BusPetitVerger(CardPack _pack, int _cherryCount, int _crowPos, GameState _state, int _secToWait) {
		this.pack = _pack;
		this.cherryCount = _cherryCount;
		this. crowPosition = _crowPos;
		this.state = _state;
		this.SecondsToWait = _secToWait;
	}

}
