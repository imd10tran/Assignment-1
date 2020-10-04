
public class ArraySum {
	public static double summingArray(){
		String alphabet = Size.alphabet;
		int numberOfElements = 1000000;
		FillingLists fill = new FillingLists();
		char[] filledArray = new char[numberOfElements];
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledArray[i] = c;}
		String sum = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i<numberOfElements; i++){
			sum=sum+filledArray[i];
		}
		long stop = System.currentTimeMillis();
		double timeElapsed = (double) stop - start; 
		return timeElapsed;
	}
	
	public static void main(String args[]){
		double timeForArray = summingArray();
		System.out.println("The time to sum the elements of the Array was " + timeForArray+ " milliseconds");
	}
}
