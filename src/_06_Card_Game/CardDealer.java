package _06_Card_Game;

import java.util.ArrayList;
import java.util.Random;
public class CardDealer {
	
	
	

    
    static ArrayList<Card> deck = new ArrayList<Card>();

    public static void main(String[] args) {
		createDeck();
		
		ArrayList<Card> p1 = new ArrayList<Card>();
		ArrayList<Card> p2 = new ArrayList<Card>();
		
		while(deck.size() > 0) {
			p1.add(deck.remove(getRandom()));
			p2.add(deck.remove(getRandom()));
		}
		
//		for(Card c : p1) {
//			System.out.println(c);
//		}
//		System.out.println();
//		for(Card c : p2) {
//			System.out.println(c);
//		}
//		System.out.println();
		
		while(p1.size() > 0 && p2.size() > 0) {
			Card p1Card = p1.remove(0);
			Card p2Card = p2.remove(0);
			
			System.out.println("Player 1: " + p1Card);
			System.out.println("Player 2: " + p2Card);

			
			if(p1Card.getRank().getValue() > p2Card.getRank().getValue()) {
				p1.add(p1Card);
				p1.add(p2Card);
				System.out.println("Player 1 wins!");
			}else if(p1Card.getRank().getValue() < p2Card.getRank().getValue()){
				p2.add(p1Card);
				p2.add(p2Card);
				System.out.println("Player 2 wins!");
			}else {
				System.out.println("TIE!");
				if(p1Card.getSuit().getValue() > p2Card.getSuit().getValue()) {
					p1.add(p1Card);
					p1.add(p2Card);
					System.out.println("Player 1 wins!");
				}else if(p1Card.getSuit().getValue() < p2Card.getSuit().getValue()) {
					p2.add(p1Card);
					p2.add(p2Card);
					System.out.println("Player 2 wins!");
				}else {
					System.out.println("Double Tie!");
					p1.add(p1Card);
					p2.add(p2Card);
				}
				
			}
			System.out.println("P1 size: " + p1.size() + "  P2 size: " + p2.size());
			System.out.println();
			
			p1 = returnShuffled(p1);
			p2 = returnShuffled(p2);
		}
			
		for(Card c : p1) {
			System.out.println(c);
		}
		System.out.println();
		for(Card c : p2) {
			System.out.println(c);
		}
		
	}
    static ArrayList<Card> returnShuffled(ArrayList<Card> a){
    	Random r = new Random();
    	for(int i = 0; i < a.size(); i++) {
    		int newIndex = r.nextInt(a.size());
    		Card temp = a.get(i);
    		a.set(i, a.get(newIndex));
    		a.set(newIndex, temp);
    	}
    	return a;
    }
    
    static void createDeck() {

    	deck.clear();
    	for(int i = 0; i < 4; i++) {
    		for(int j = 0; j < 13; j++) {
    			
    			Suit s = Suit.Club;
    			Rank r = Rank.Ace;
    			
    			switch(i){
    				
    			case 0:
    				s = Suit.Club;
    				break;
    			case 1:
    				s = Suit.Heart;
    				break;

    			case 2:
    				s = Suit.Diamond;
    				break;
    			case 3:
    				s = Suit.Spade;
    				break;
    			}
    			
    			switch(j) {
    			
    			case 0:
    				r =  Rank.Two;
    				break;
    			case 1:
    				r = Rank.Three;
    				break;
    			case 2:
    				r = Rank.Four;
    				break;
    			case 3:
    				r = Rank.Five;
    				break;
    			case 4:
    				r = Rank.Six;
    				break;
    			case 5:
    				r = Rank.Seven;
    				break;
    			case 6:
    				r = Rank.Eight;
    				break;
    			case 7:
    				r = Rank.Nine;
    				break;
    			case 8:
    				r = Rank.Ten;
    				break;
    			case 9:
    				r = Rank.Jack;
    				break;
    			case 10:
    				r = Rank.Queen;
    				break;
    			case 11:
    				r = Rank.King;
    				break;
    			case 12:
    				r = Rank.Ace;
    				break;
    				
    			}
    			
    			deck.add(new Card(r, s));
    			
    			
    		}
    	}
    }

    static int getRandom() {
    	Random r = new Random();
    	return r.nextInt(deck.size());
    }

}



