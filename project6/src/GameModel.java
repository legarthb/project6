

public class GameModel {
	private FreeCell[] freeCells;
	private Tableau[] tableaux;
	private HomeCell[] homeCells;
	private Deck deck;
	
	public GameModel() {
		deck = new Deck();
		for (int i = 0; i < 4; i++) {
			freeCells[i] = new FreeCell();
			homeCells[i] = new HomeCell();
			tableaux[i] = new Tableau();
			for (int j = 0; j < 7; i++) {
				tableaux[i].addCard(deck.deal());
			}
		}
		for (int i = 4; i < 8; i++) {
			tableaux[i] = new Tableau();
			for (int j = 0; j < 6; i++) {
				tableaux[i].addCard(deck.deal());
			}
		}
	}
	
}
