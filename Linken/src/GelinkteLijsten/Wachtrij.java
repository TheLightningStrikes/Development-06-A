package GelinkteLijsten;

/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe; elementen worden toegevoegd 
 * aan de achterkant en worden verwijderd aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslagmethode die de 
 * klasse GelinkteLijst je biedt. De Node komt niet voor in deze klasse!
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 * 
 * @author Youri 
 *
 */
public class Wachtrij{
	
	GelinkteLijst lijst;
	
	public Wachtrij(){
		lijst = new GelinkteLijst();
		
	}
	
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	void enqueue(Object o){
		if (isEmpty()) {
			lijst.insertFirst(o);
		}
		else {
			lijst.insertLast(o);
		}
	}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	void dequeue(){
		if (!isEmpty()) {
			lijst.remove(lijst.getLast());
		}
	}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	int size(){
		return lijst.getSize();
	}
	
	/**
	 * Is de lijst leeg?
	 * @return
	 */
	boolean isEmpty(){		
	boolean isEmpty = false;
		if (lijst.getSize() == 0) {
			isEmpty = true;
		}
	return isEmpty;
}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */	
	Object front(){
		Object object;
		if (!isEmpty()) {
			object = lijst.getLast();
		}
		else {
			object = new Object();
		}
		return object;
	}
}
