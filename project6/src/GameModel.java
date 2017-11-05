import javafx.scene.control.Cell;

public class GameModel {
	private FreeCell[] freeCells;
	private Tableau[] tableaux;
	private HomeCell[] homeCells;
	private Deck deck;
	
	public Begin() {
		deck = new Deck();
		for (int i = 0; i < 4; i++) {
			freeCells[i] = new FreeCell();
			homeCells[i] = new HomeCell();
		}
		
		for (int i = 0; i < 8; i++) {
			tableaux[i] = new Tableau();
		}
		for (int i = 0; i < 6; i++) {
			for (int i = 0; i<8; i++) {
				tableaux[i].addCardStart(deck.deal());
			}	
		}
		for (int i = 0; i < 4; i++) {
			tableaux[i].addCardStart(deck.deal());
		}
		
		public void move(Cell cell1, Cell cell2, Card card) {
			if (cell2.addCard(card)) {
				cell1.remove();
			}		
		}
	}
		
		public String toString() {
			String result = "Freecells: 								Homecells:";
			for (int i = 0; i < 4; i++) {
				result += freeCells[i].toString() + "								" + homeCells[i].toString() + "\n";
			}
			result += "Tableau Board:";
			for (int i = 0; i < 8; i++) {
				result += tableaux[i].toString() + "\n";
			}
		}	
}
