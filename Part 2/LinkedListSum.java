import java.util.LinkedList;

public class LinkedListSum{
	public static double summingLinkedList(){
		String alphabet = Size.alphabet;
		int numberOfElements = 1000000;
		System.out.println("start");
		LinkedList<Character> filledLinkedList = new LinkedList<Character>();
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledLinkedList.add(c);}
		
		String sum = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i<numberOfElements; i++){
			sum=sum+filledLinkedList.get(i);
			
		}
		
		long stop = System.currentTimeMillis();
		double timeElapsed = (double) stop - start; 
		return timeElapsed;
	}



	public static void main(String args[]){
		double y = summingLinkedList();
		System.out.println("The time to sum the elements of the LinkedList was " + y+ " milliseconds");
	}
}
