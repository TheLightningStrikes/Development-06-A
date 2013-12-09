package Code;
public class Card implements Comparable<Card> {
	Number Num;
	Suit Suit;

	/**
	 * Constructor
	 * 
	 * @param number
	 * @param suit
	 */
	Card(Number num, Suit suit) {
		this.Num = num;
		this.Suit = suit;
	}


	/**
	 * Pretty-print deze Card als string
	 */
	public String toString() {
		return Num + " van " + Suit;
	}

	/**
	 * Vergelijk twee kaarten.
	 */
	public int compareTo(Card card) {
		int sameSuit = 0;
		int sameNum = 0;
		
		if (this.Suit.ordinal() > card.Suit.ordinal()) {
			sameSuit = 1;
		}
		else if (this.Suit.ordinal() < card.Suit.ordinal()) {
			sameSuit = -1;
		}
		else if (this.Suit.ordinal() == card.Suit.ordinal()) {
			sameSuit = 0;
		}
		
		if (sameSuit == 0) {
			if (this.Num.ordinal() > card.Num.ordinal()) {
				sameNum = 1;
			}
			else if (this.Num.ordinal() < card.Num.ordinal()) {
				sameNum = -1;
			}
			else if (this.Num.ordinal() == card.Num.ordinal()) {
				sameNum = 0;
			}
		}
		System.out.println(sameSuit + sameNum);
		return sameSuit + sameNum;
	}

}
