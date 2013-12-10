package GelinkteLijsten;

/**
 * In deze opdracht verken je het generieke karakter van de gelinkte datastructuur.
 * Daarvoor programmeer je eerst de klasse 'GelinkteLijst'. Deze klasse is abstract.
 * De Klasses Stapel en Wachtrij implementeren de GelinkteLijst. 
 * 
 * - Zorg dat je criteria opstelt (zoals we in les 2 gedaan hebben) en beschrijf 
 *   dit in de javadoc bij elke methode.
 * - Aan de hand van de criteria controleer je of de opdracht correct werkt.
 * - Implementeer tot slot de klasse App. Deze is bedoeld om de werking van 
 *   verschillende klassses te demonstreren.
 * 
 * @author youritjang
 *
 */

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wachtrij wachtrij = new Wachtrij();
		Stapel stapel1 = new Stapel();
		Stapel stapel2 = new Stapel();
		Stapel stapel3 = new Stapel();
		GelinkteLijst list = new GelinkteLijst();
		
		list.insertFirst(stapel1);
		list.insertFirst(stapel3);
		list.insertFirst(stapel2);
		list.insertBefore(wachtrij, stapel2);
		System.out.println(list.getFirst() +""+ list.getLast());
		list.insertAfter(stapel3, stapel1);
		list.insertLast(wachtrij);
		System.out.println(list.getSize());
		
		list.remove(stapel2);
	    
	    wachtrij.enqueue(stapel1);
	    System.out.println(wachtrij.front());
	    wachtrij.size();
	    wachtrij.enqueue(stapel2);
	    System.out.println(wachtrij.front());
	    wachtrij.dequeue();
	    System.out.println(wachtrij.front());
	    wachtrij.dequeue();
	    System.out.println(wachtrij.front());
	}

}
