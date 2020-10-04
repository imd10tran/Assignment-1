import java.util.ArrayList;
import java.util.Random;

public class Size{
	public static int numberOfElements;

	public static void setNumberOfElements(){
		numberOfElements = 1000000;
	}

	public static int getNumberOfElements(){
		Size.setNumberOfElements();
		return numberOfElements;
	}

	public static char getRandomChar(){
		Random random = new Random();
		char letter = (char)(random.nextInt(26)+'a');
		return letter;
	}

	public static double testArrayTime(){
		ArrayList<Character> testArray = new ArrayList<Character>();
		long start = System.currentTimeMillis();
		for(int i = 0; i<Size.getNumberOfElements(); i++){
			char letter = Size.getRandomChar();
			testArray.add(letter);}
		long stop = System.currentTimeMillis();
		double timeElapsed = ((double) stop - start)/1000;
		return timeElapsed;}
	
	public static void main(String[] args){
		System.out.println("It took "+testArrayTime()+" seconds to populate array");
	}
}