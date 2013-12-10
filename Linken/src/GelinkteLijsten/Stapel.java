package GelinkteLijsten;


/**
 * De stapel, of eigenlijk 'Stack', is ook een 
 * klassieke datastructuur.
 * In [Hubbard, Hoofdstuk 5] wordt de Stack besproken. 
 * Niet te veel spieken, daar leert u immers minder van. 
 * 
 * In deze klasse implementeer je zelf een Stack, door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt in deze
 * klasse niet voor.
 */
public class Stapel {
	GelinkteLijst lijst;
	
	public Stapel(){
		lijst = new GelinkteLijst();
	}
	
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
	void push(Object object){
		if (isEmpty()) {
			lijst.insertFirst(object);
		}
		else {
			lijst.insertLast(object);
		}
	}
	
	/**
	 * Haalt het bovenste object van de stapel
	 * LIFO: Last-in, First-out
	 * @return het bovenste object
	 */
	Object pop(){
		Object object;
		if (!isEmpty()) {
			object = lijst.getLast();
			lijst.remove(lijst.getLast());
		}
		else {
			object = new Object();
		}
		return object;
		}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
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

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
	boolean isEmpty(){
		boolean isEmpty = false;
		if (lijst.getSize() == 0) {
			isEmpty = true;
		}
		return isEmpty;
	}
}
