import java.util.*;

public class HomeCell implements Cell{
    
    private ArrayList<Card> cardStack = new ArrayList<Card>();
    private Card topCard;
    
    public void remove() {}
    public Card peek() {
    		return topCard;
    }
    public void addCard(Card card){
        if (this.isEmpty() && (card.getRank()==1)){
            cardStack.add(card);
            this.topCard = card;
        }
        else if ((card.getSuit().equals(this.topCard.getSuit()) && (card.getRank()==this.topCard.getRank()+1))){
            cardStack.add(card);
            this.topCard = card;
        }
        else
            System.out.println("That is an improper move");
    }
    
    public boolean isEmpty(){
        return cardStack.size() == 0;
    }
    public int size(){
        return cardStack.size();
    }
    
    public String toString(){
        return this.topCard.toString();
    }
}

