
import java.util.*;

public class Card {
	int c_name = 0;
	int c_suit = 0;
	int c_value = 0;
	int c_rand = 0;
	
	Random gen = new Random(129837);

	//
	public Card (int name, int suit, int value, int sorter){
		//sorter should be greater than 156, or 3x(size of a deck of cards)
		c_name = name;
		c_suit = suit;
		c_value = value;
		c_rand = gen.nextInt(sorter);
		
		/*int[] Card = new int[]{
			c_name, c_suit, c_value, c_rand
		};*/
	}
	
	public void printCard() {
		System.out.println(c_name + " " + c_suit + " " + c_value + " " + c_rand);
	}
}

