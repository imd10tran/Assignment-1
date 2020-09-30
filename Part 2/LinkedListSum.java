import java.util.LinkedList;

public class LinkedListSum{
	public static double summingLinkedList(){
		int numberOfElements = 100000000;
		LinkedList<Character> filledLinkedList = FillingLists.fillingLinkedList();
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