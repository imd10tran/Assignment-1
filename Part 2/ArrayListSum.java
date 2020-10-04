import java.util.ArrayList;

public class ArrayListSum {
	public static double summingArrayList(){
		int numberOfElements = 1000000;
		String alphabet = Size.alphabet;
		ArrayList<Character> filledArrayList = new ArrayList<Character>();
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledArrayList.add(c);}
		String sum = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i<numberOfElements; i++){
			sum=sum+filledArrayList.get(i);
		}
		long stop = System.currentTimeMillis();
		double timeElapsed = (double) stop - start; 
		return timeElapsed;
	}
	
	public static void main(String args[]){
		double timeForArrayList = summingArrayList();
		System.out.println("The time to sum the elements of the ArrayList was " + timeForArrayList+ " milliseconds");
	}
}
