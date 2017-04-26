
import java.util.*;

public class Deck {
	
	static int heart = 1;
	static int diamond = 2;
	static int club = 3;
	static int spade = 4;
	
	static int Ace = 1;
	static int Two = 2;
	static int Three = 3;
	static int Four = 4;
	static int Five = 5;
	static int Six = 6;
	static int Seven = 7;
	static int Eight = 8;
	static int Nine = 9;
	static int Ten = 10;
	static int Jack = 11;
	static int Queen = 12;
	static int King = 13;
	
	static int v_LA = 1;
	static int v_2 = 2;
	static int v_3 = 3;
	static int v_4 = 4;
	static int v_5 = 5;
	static int v_6 = 6;
	static int v_7 = 7;
	static int v_8 = 8;
	static int v_9 = 9;
	static int v_10 = 10;
	static int v_J = 10;
	static int v_Q = 10;
	static int v_K = 10;
	static int v_HA = 11;

	Random sorted = new Random(123548);
	
	int[] a = new int[52];

	int temp = 0;

	public Deck(Card[] deck){
		//Card[] deck = new Card[52];
		
		//Hearts
		deck[0]  = new Card(heart, Ace, v_LA, makeRandom());
		deck[1]  = new Card(heart, Two, v_2, makeRandom());
		deck[2]  = new Card(heart, Three, v_3, makeRandom());
		deck[3]  = new Card(heart, Four, v_4, makeRandom());
		deck[4]  = new Card(heart, Five, v_5, makeRandom());
		deck[5]  = new Card(heart, Six, v_6, makeRandom());
		deck[6]  = new Card(heart, Seven, v_7, makeRandom());
		deck[7]  = new Card(heart, Eight, v_8, makeRandom());
		deck[8]  = new Card(heart, Nine, v_9, makeRandom());
		deck[9]  = new Card(heart, Ten, v_10, makeRandom());
		deck[10] = new Card(heart, Jack, v_J, makeRandom());
		deck[11] = new Card(heart, Queen, v_Q, makeRandom());
		deck[12] = new Card(heart, King, v_K, makeRandom());
		//Diamonds
		deck[13] = new Card(diamond, Ace, v_LA, makeRandom());
		deck[14] = new Card(diamond, Two, v_2, makeRandom());
		deck[15] = new Card(diamond, Three, v_3, makeRandom());
		deck[16] = new Card(diamond, Four, v_4, makeRandom());
		deck[17] = new Card(diamond, Five, v_5, makeRandom());
		deck[18] = new Card(diamond, Six, v_6, makeRandom());
		deck[19] = new Card(diamond, Seven, v_7, makeRandom());
		deck[20] = new Card(diamond, Eight, v_8, makeRandom());
		deck[21] = new Card(diamond, Nine, v_9, makeRandom());
		deck[22] = new Card(diamond, Ten, v_10, makeRandom());
		deck[23] = new Card(diamond, Jack, v_J, makeRandom());
		deck[24] = new Card(diamond, Queen, v_Q, makeRandom());
		deck[25] = new Card(diamond, King, v_K, makeRandom());
		//Clubs
		deck[26] = new Card(club, Ace, v_LA, makeRandom());
		deck[27] = new Card(club, Two, v_2, makeRandom());
		deck[28] = new Card(club, Three, v_3, makeRandom());
		deck[29] = new Card(club, Four, v_4, makeRandom());
		deck[30] = new Card(club, Five, v_5, makeRandom());
		deck[31] = new Card(club, Six, v_6, makeRandom());
		deck[32] = new Card(club, Seven, v_7, makeRandom());
		deck[33] = new Card(club, Eight, v_8, makeRandom());
		deck[34] = new Card(club, Nine, v_9, makeRandom());
		deck[35] = new Card(club, Ten, v_10, makeRandom());
		deck[36] = new Card(club, Jack, v_J, makeRandom());
		deck[37] = new Card(club, Queen, v_Q, makeRandom());
		deck[38] = new Card(club, King, v_K, makeRandom());
		//Spades
		deck[39] = new Card(spade, Ace, v_LA, makeRandom());
		deck[40] = new Card(spade, Two, v_2, makeRandom());
		deck[41] = new Card(spade, Three, v_3, makeRandom());
		deck[42] = new Card(spade, Four, v_4, makeRandom());
		deck[43] = new Card(spade, Five, v_5, makeRandom());
		deck[44] = new Card(spade, Six, v_6, makeRandom());
		deck[45] = new Card(spade, Seven, v_7, makeRandom());
		deck[46] = new Card(spade, Eight, v_8, makeRandom());
		deck[47] = new Card(spade, Nine, v_9, makeRandom());
		deck[48] = new Card(spade, Ten, v_10, makeRandom());
		deck[49] = new Card(spade, Jack, v_J, makeRandom());
		deck[50] = new Card(spade, Queen, v_Q, makeRandom());
		deck[51] = new Card(spade, King, v_K, makeRandom());
		
	}

	public int makeRandom(){
		boolean good = false;
		int x = 0;		
		while(!good){
			x = sorted.nextInt(52);

			for(int i = 0; i < temp; i++) {
				if(a[i] == x) {
					good = true;
				}
			}
		/*if(good) {
			good = false;
		} else {
			a[temp] = x;
			temp++;
		}*/
		a[temp] = x;
		temp++;
		}
		return x;
	}

}


	



		
