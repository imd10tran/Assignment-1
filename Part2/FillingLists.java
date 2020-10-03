import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

public class FillingLists{
		
	public static LinkedList<Character> fillingLinkedList(){
		LinkedList<Character> filledLinkedList = new LinkedList<Character>();
		for(int i = 0; i<Size.getNumberOfElements(); i++){
			char letter = Size.getRandomChar();
			filledLinkedList.add(letter);}
		return filledLinkedList;
	}
	
	public static char[] fillingArray(){
		char[] filledArray = new char[Size.getNumberOfElements()];
		for(int i = 0; i<Size.getNumberOfElements(); i++){
			char letter = Size.getRandomChar();
			filledArray[i] = letter;}
		return filledArray;}
	
	public static ArrayList<Character> fillingArrayList(){
		ArrayList<Character> filledArrayList = new ArrayList<Character>();
		for(int i = 0; i<Size.getNumberOfElements(); i++){
			char letter = Size.getRandomChar();
			filledArrayList.add(letter);}
		return filledArrayList;}


}