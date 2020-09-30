import java.util.LinkedList;
import java.util.ArrayList;

public class FillingLists{
	
	public static int numberOfElements = Size.numberOfElements;
	public static String alphabet = Size.alphabet;
	
	public static LinkedList<Character> fillingLinkedList(){
		LinkedList<Character> filledLinkedList = new LinkedList<Character>();
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledLinkedList.add(c);}
		return filledLinkedList;
	}
	
	public static char[] fillingArray(){
		char[] filledArray = new char[numberOfElements];
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledArray[i] = c;}
		return filledArray;}
	
	public static ArrayList<Character> fillingArrayList(){
		ArrayList<Character> filledArrayList = new ArrayList<Character>();
		for(int i = 0; i<numberOfElements; i++){
			char c = (char) alphabet.charAt(i%26);
			filledArrayList.add(c);}
		return filledArrayList;}


}