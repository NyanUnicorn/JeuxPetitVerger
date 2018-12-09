package controler;

import javax.swing.text.View;

import jeuxpetitverger.cardpack.CardPack;
import jeuxpetitverger.cardpack.CardPackPetitVerger;
import team.Team;
import view.ConsolePetitVergerView;
import view.PetitVergerView;
import view.bus.Bus;
import view.bus.BusPetitVerger;

public class Controler {
	
	public static final int MAX_CHERRY_COUNT = 5;
	public static final int CROW_PATH_LEN = 6;
	
	private CardPack cardPack;
	private int cherryCount;
	private int croxPosition;
	private GameState state;
	private Team team;
	private PetitVergerView view;

	public Controler() {
		
		cardPack = new CardPackPetitVerger();
		BusPetitVerger bus = new BusPetitVerger(cardPack, 5, 0, GameState.PLAYING, 0);
		bus.Message = "Sélectionnez une care ";
		view = new ConsolePetitVergerView(bus);
	}
	
	private void gameLoop() {
		
		System.console().readLine();
		
	}
	
	public void commitAction(PetitVergerAction _action, int _value) {
		switch(_action) {
		case THROWDICE:
			break;
		case TURNCARD:
			break;
		default:
			break;
		}
	}

}
