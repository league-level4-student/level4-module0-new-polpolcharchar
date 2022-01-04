package _06_Card_Game;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

}


enum Suit{
	Heart(0), Diamond(1), Club(2), Spade(3);
	
	int value;
	
	private Suit(int s) {
		this.value = s;
	}
	
	int getValue() {
		return value;
	}
}

enum Rank{
	Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);
	
	int value;
	
	private Rank(int v) {
		this.value = v;
	}
	
	int getValue() {
		return value;
	}
}
