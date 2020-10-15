import java.util.ArrayList; //used for example 3
import java.util.Scanner; //used for example 3

public class WhileLoops {

	public static void main(String[] args) {

		/* 1. normal while loop
		int a = 0;
		
		while (a <10) {
			System.out.println("a is less than 10:" + a);
			a++;
		} */
		
		/*
		// 2. do while loop
		int a = 0;
		
		do {                            // Flow:
			System.out.println("a");    // first do this code then check if a ==1. 
		} while (a == 1); 				// This is false and program stops
		*/
		/*
		// 3. example from "Real world" using ArrayList
		String sentence = "Programming in Java is easy."; //created a sentence to store all these words in a array list
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words= new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
		*/			
		
		/*
		//exercise1
		double a = 5.5;
		do {
			System.out.println(a);
		}while(a == 5);
		*/
		
		//exercise2
		
		long b = 10L;
		while (b<=99) {
			System.out.println(b);
			b++;
		}
	}

}
