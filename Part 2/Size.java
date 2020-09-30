import java.util.ArrayList;

public class Size{
	public static int numberOfElements = 100000000;
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static double testArrayTime(){
		ArrayList<Character> testArray = new ArrayList<Character>();
		long start = System.currentTimeMillis();
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			testArray.add(c);}
		long stop = System.currentTimeMillis();
		double timeElapsed = ((double) stop - start)/1000;
		return timeElapsed;}
	
	public static void main(String[] args){
		System.out.println(testArrayTime());
	}
}