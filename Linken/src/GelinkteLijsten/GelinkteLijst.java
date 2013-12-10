package GelinkteLijsten;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de eerste en laatste nodes
		Node next, previous;
		
	    public void printNode() {
		    System.out.print("{Previous:"+previous.data+" Data:"+data+" Next:"+next.data+"}");
	    }
	}	
	
	
	private Node first, last;
	private int size;
	
	
	public GelinkteLijst(){
		first = null;
	}
	
	
	Object getFirst(){
		return first.data;
	}
	
	
	Object getLast(){
		return last.data;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o){
		Node node = new Node();
		node.data = o;
		if (last == null) {
			first = node;
			last = node;
			System.out.println(""+first+ " "+last+"");
		} 
		else {
			node.next = first;
			first.previous = node;
			first = node;
			System.out.println(first +""+ last);
		}
		size++;
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o){
		Node node = new Node();
		node.data = o;
		if (first.next == null) {
			last = node;
			first.next = last;
			node.previous = first;
		} 
		else {
			last.next = node;
			node.previous = last;
			last = node;
		}
		size++;
	}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before){
		Node node = new Node();
		node.data = o;
		Node firstNode = first;
		
		while (firstNode != null) {
			if (firstNode.data == before) {
				if (firstNode != first) {
					firstNode.previous.next = node;
					node.previous = firstNode;
					firstNode.previous = node;
					node.previous = firstNode.previous;
					size++;
				}
				else {
					firstNode.previous = node;
					node.next = firstNode;
					first = node;
					size++;
				}
				break;
			}	
			else {
				firstNode = firstNode.next;
				if (firstNode == null) {
					System.out.println("Not in this list!");
				}
			}
		}
		
	}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after){
		Node node = new Node();
		node.data = o;
		Node firstNode = first;
		
		while (firstNode != null) {
			if (firstNode.data == after) {
				if (firstNode != last) {
					firstNode.next.previous = node;
					node.next = firstNode.next;
					firstNode.next = node;
					node.previous = firstNode.next;
					size++;
				}
				else {
					firstNode.next = node;
					node.previous = firstNode;
					last = node;
					size++;
				}
				break;
			}	
			else {
				firstNode = firstNode.next;
				if (firstNode == null) {
					System.out.println("Not in this list!");
				}
			}
		}
	}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data){
		Node firstNode = first;
		while (firstNode != null){
			if (firstNode.data == data) {
				if (firstNode == first && firstNode == last) {
					first = null;
					last = null;
					firstNode = null;
				}
				else if (firstNode == first) {
					firstNode.next.previous = null;
					firstNode = null;
					first = first.next;
					System.out.println("Eerste node!");
				}
				else if (firstNode == last) {
					firstNode.previous.next = null;
					firstNode = null;
					last = last.previous;
					System.out.println("Laatste node!");
				}
				else {
					firstNode.next.previous = firstNode.previous;
					firstNode.previous.next = firstNode.next;
					firstNode = null;
					System.out.println("Tussenin!");
				}
				size--;
				break;
			}
			else {
				firstNode = firstNode.next;
				if (firstNode == null) {
					System.out.println("Not in this list!");
				}
			}
		}
	}
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current){
		boolean isFirst = false;
		if (current == first) {
			isFirst = true;
		}
		return isFirst;
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current){
		boolean isLast = false;
		if (current == last) {
			isLast = true;
		}
		return isLast;
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize(){
		return size;
	}
}
