package CISC181.Week.Treeset;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


public class Deck implements Serializable {

	private TreeSet<Card> deckCards = new TreeSet<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eSuit != eSuit.JOKER) && (eRank != eRank.JOKER)) {
					//System.out.println(iCardNbr);
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
		}

	}


	public Card Draw() {
		Card c = deckCards.first();
		deckCards.remove(c);
		return c;
	}

	public TreeSet<Card> getDeck() {
		return deckCards;
	}
}
