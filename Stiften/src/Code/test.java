package Code;

public class test {
	public static void main(String args[]) {
		Deck deck = new Deck();
		deck.fill(); 
		//deck.shuffle();
		deck.cardSwap(2, 3);
		deck.cardSwap(34, 23);
		deck.cardSwap(12, 51);
		deck.cardSwap(23, 45);
		for (int x = 0; x <= 51; x = x+1) {
			Card card = deck.cardArray[x];
			if  (card != null){
			System.out.println(card.toString());
			}
			else {
				System.out.println("wtf");
			}
		}
		
		deck.cardArray[8].compareTo(deck.cardArray[4]);
		
	}
}
