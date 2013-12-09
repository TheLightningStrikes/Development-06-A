package Code;
import java.util.Arrays;
import java.util.Random;

/**
 * Een deck met Cards
 * 
 */

public class Deck {
	Number[] numberArray = new Number[13];
	Suit[] suitArray = new Suit[4];
	Card[] cardArray = new Card[0];
	Card[] cardArray2;
	Card[] cardIndex = new Card[0];

	/**
	 * Constructor. Maakt een deck met lengte 0.
	 */
	Deck() {
        suitArray[0] = Suit.KLAVEREN;
        suitArray[1] = Suit.SCHOPPEN;
        suitArray[2] = Suit.HARTEN;
        suitArray[3] = Suit.RUITEN;
       
        numberArray[0] = Number.TWEE;
        numberArray[1] = Number.DRIE;
        numberArray[2] = Number.VIER;
        numberArray[3] = Number.VIJF;
        numberArray[4] = Number.ZES;
        numberArray[5] = Number.ZEVEN;
        numberArray[6] = Number.ACHT;
        numberArray[7] = Number.NEGEN;
        numberArray[8] = Number.TIEN;
        numberArray[9] = Number.BOER;
        numberArray[10] = Number.VROUW;
        numberArray[11] = Number.KONING;
        numberArray[12] = Number.AAS;
        
	}

	/**
	 * Vult de array met 52 kaarten: 2,3 ... ,10,V,B,K,A van klaveren, schoppen,
	 * harten en ruiten.
	 */
	public void fill() {
		cardArray = Arrays.copyOf(cardArray, 52);
		int p = 0;
		for (int y = 0; y <= 3; y = y+1) {
			for (int x = 0; x <= 12; x = x+1) {
				cardArray[p] = new Card(numberArray[x], suitArray[y]);
				p = p+1;
			}
		}
	}

	/**
	 * Zoals gezegd is dit spel een beetje vreemd. Bijvoorbeeld: spelers kunnen
	 * kaarten toevoegen aan het deck. Hierdoor kan het aantal kaarten groter
	 * worden dan 52.
	 * 
	 * @param card
	 *            een Kaart
	 * @param index
	 *            Op positie
	 */
	public void insertAt(Card card, int index) {
		Card[] cardArray2 = new Card[cardArray.length+1];
		
		System.arraycopy(cardArray, 0, cardArray2, 0, index);
		
		System.arraycopy(cardArray, index, cardArray2, index+1, cardArray.length-index);
		cardArray2[index] = card;
		cardArray = cardArray2;
	}
	


	/**
	 * Kaarten kunnen ook verwijderd worden uit het deck. delete Haalt de kaart
	 * met een bepaalde index er uit.
	 * 
	 * Merk op: na delete is de array zo groot als het aantal elementen dat er
	 * in zit.
	 * 
	 * @param index
	 */
	public void delete(int index) {
		Card[] n = new Card[cardArray.length - 1];
		  System.arraycopy(cardArray, 0, n, 0, index);
		  System.arraycopy(cardArray, index+1, n, index, cardArray.length - index-1);
	}

	/**
	 * Schud alle kaarten zodat de volgorde 'willekeurig' is. Hiervoor is het
	 * toegestaan de Java Random generator te gebruiken.
	 * 
	 */
	public void shuffle() {
		int z = cardArray.length - 1;
		Random rnd = new Random();
		Card[] cardArray2 = new Card[cardArray.length];
		for (int x = 0; z >= 0; x = x + 1) {
			int y = rnd.nextInt(cardArray.length);
			if (cardArray2[y] == null) {
				cardArray2[y] = cardArray[z];
				z = z - 1;
			};
		}
		cardArray = cardArray2;
	}

	/**
	 * Utillity method for swapping cards in given indices
	 * 
	 * @param indexA
	 * @param indexB
	 */
	void cardSwap(int indexA, int indexB) {
		Card cardA = cardArray[indexA];
		Card cardB = cardArray[indexB];
		
		cardArray[indexA] = cardB;
		cardArray[indexB] = cardA;
	}

	/**
	 * Een gegeven kaart moet worden opgezocht in de array, en de index ervan
	 * moet als return worden teruggegeven. Zie [Hubbard p.30]
	 * 
	 * @param card
	 *            de kaart die gezocht wordt
	 * @return De index van de gevonden kaart
	 */
	public int sequentialSearch(Card card) {
		int result = -1;
		return result;
	}

	/**
	 * Legt de kaarten op volgorde. We nemen aan dat een deck op volgorde ligt,
	 * als de volgorde hetzelfde is als na {@link #fillDeck()}
	 */
	public void sort() {
		
	}

	/**
	 * Vertelt of het deck gesorteerd is.
	 * @return
	 */
	public boolean isSorted(){
		boolean sorted = true;
		//...
		return sorted;
	}

	/**
	 * Een bepaalde kaart moet worden opgezocht in de gesorteerde array op de
	 * binary search manier zoals besproken in [Hubbard p.31].
	 * 
	 * @param card
	 *            de kaart die gezocht wordt
	 * @return De index van de gevonden kaart
	 */
	public int binarySearch(Card card) {
		int result = -1;
		return result;
	}


	/**
	 * Pretty-print het deck.
	 */
    @Override
    public String toString() {
            String str = "";
           
            for ( int x = 0; x < cardArray.length; x = x + 1){
                    str += cardArray[x];
                    str += "\n";
            }

            return str + "\n";
    }
	
	public int compareTo(Deck d){
		return 0;
	}

}
