package view;

import java.util.ArrayList;
import java.util.List;

import controler.Controler;
import jeuxpetitverger.cardpack.CardPack;
import view.bus.BusPetitVerger;
import view.bus.IBus;

public class ConsolePetitVergerView extends PetitVergerView{
	public static final int BOARD_SIZE = 8;
	private List<String> lines;
	private List<String> board;
	private List<String> pack;
	private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	

	public ConsolePetitVergerView(BusPetitVerger _bus) {
		lines = new ArrayList<String>();
		board = new ArrayList<String>();
		pack = new ArrayList<String>();
		updateDisplay(_bus);
	}

	

	@Override
	public void updateDisplay(BusPetitVerger _bus) {
		writeTree(_bus.cherryCount, _bus.crowPosition);
		writePack(_bus.pack);
		writeLines();
		display();
	}
	
	private void display() {
		for(int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
	}
	
	private void writeLines() {
		lines.clear();
		for(int i = 0; i < 5; i++) {
			lines.add(board.get(i) + "    " + pack.get(i));
			//System.out.println(board.size() + "" + pack.size());
		}
	}
	
	private void writePack(CardPack _cards) {
		this.pack.clear();
		String line;
		String linestart;
		for(int i = 0; i < 5; i++) {
			switch(i) {
			case 0:
				linestart = "\\" +"      ";
				line = linestart + "";				
				for(int j = 1; j < 6; j++) {
					line += j +"________";
				}
				pack.add(line);
				break;
			case 1:
				line = "";
				pack.add(line);
				break;
			case 2:
			case 3:
			case 4:
				linestart = chars[i-2] +"   ";
				line = linestart + "";
				int k = (i-2) * _cards.cards.size() / 3;
				for(int j = 0; j < 5; j++) {
					line += "" + _cards.cards.get(k + j).ToString();
				}				
				pack.add(line);
				break;
			}
		}
	}
	
	private void writeTree(int _cherries, int _crowPos) {
		this.board.clear();
		String line;
		for(int i = 0; i < 5; i++) {
			switch(i) {
			case 0:
				line = "";
				for(int j = 0; j < BOARD_SIZE - Controler.MAX_CHERRY_COUNT; j++) {
					line += " ";
				}
				for(int j = 0; j < Controler.MAX_CHERRY_COUNT - _cherries; j++) {
					line += "_";
				}
				for(int j = 0; j < _cherries; j++) {
					line += "o";
				}
				board.add(line);
				break;
			case 1:
			case 2:
			case 3:
				line = "";
				for(int j = 0; j < BOARD_SIZE - Controler.MAX_CHERRY_COUNT; j++) {
					line += " ";
				}
				for(int j = 0; j < Controler.MAX_CHERRY_COUNT; j++) {
					line += "|";
				}
				board.add(line);
				break;
			case 4:
				line = "";
				for(int j = 0; j < BOARD_SIZE; j++) {
					line += j == _crowPos ? "C" : j <= Controler.MAX_CHERRY_COUNT ? "_" : j == Controler.MAX_CHERRY_COUNT +1 ? "|" : " ";
				}
				board.add(line);
				break;
			}
		}
	}

}
