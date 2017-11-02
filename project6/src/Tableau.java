import java.util.ArrayList;

public class Tableau implements Cell {

    private ArrayList<Card> cardStack = new ArrayList<Card>();
    private Card topCard;
    
    public void addCardStart(Card card){
    		this.cardStack.add(card);
    		this.topCard = card;
    		
    }    
    public void addCard(Card card){
    		int cardOrder = card.getSuit().getOrder();
    		
    		if ((this.isEmpty())&&(card.getRank()==13)) {
    			this.cardStack.add(card);
    			this.topCard = card;  		
    		}
    		else if ((this.topCard.getRank()==card.getRank()-1)&&!(this.isEmpty())) {
    			int topCardOrder = topCard.getSuit().getOrder();
    			if (((topCardOrder==1)||(topCardOrder==4)) && ((cardOrder==2)||(cardOrder==3))) {
    				this.cardStack.add(card);
    				this.topCard = card;
    			}
    			else if (((topCardOrder==2)||(topCardOrder==3)) && ((cardOrder==1)||(cardOrder==4))) {
    				this.cardStack.add(card);
    				this.topCard = card;
    			}
    		}
    		else {
    			System.out.println("This is an improper move");
    		}   	
    }
    
    public boolean isEmpty(){
        if (this.size() == 0)
            return true;
        else
            return false;
    }
    
    public int size(){
        return cardStack.size();
    }
    
    public String toString(){
    		String result = "";
        for (Card element:cardStack) {
        		result += element.toString()+"\n";
        }
    		return result;
        	
    }
    public void remove() {
    		cardStack.remove(cardStack.size()-1);
    }
    public Card peek() {
    		return topCard;
    }
}
