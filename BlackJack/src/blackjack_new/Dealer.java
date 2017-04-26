
import java.util.*;



public class Dealer {
	Card[] deckTest = new Card[52];
	public Dealer() {
		new Deck(deckTest);
		for(int i = 0; i < 52; i++) {
			deckTest[i].printCard();
		}
		
	}
	
	public static void main(String args[]){
		new Dealer();
	}
	
}
