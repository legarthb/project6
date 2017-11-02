

import java.util.*;
public class FreeCell implements Cell{
 
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;
 
	public void addCard(Card card) {
		if (this.isEmpty() == true) {
			cardStack.add(card);
			this.topCard = card;
		}
	}
 
	public void remove() {
		if (this.isEmpty() == false) {
			cardStack.remove(this.cardStack.size() - 1);
		}
	}
	
	public boolean isEmpty() {
		return (this.cardStack.size() == 0);
	}
	public Card peek() {
		return topCard;
	}
	public String toString() {
		return this.topCard.toString();
	}
}