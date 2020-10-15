import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Add three ingredients:");
		
		String n1 = scan.nextLine();
		System.out.println("You've added " + n1 + " . Add one more ingredient.");
		
		String n2 = scan.nextLine();
		System.out.println("You've added " + n2 + ". Add one more ingredient.");
		
		String n3 = scan.nextLine();
		System.out.println("You've added " + n3 + " as the last ingredient.");
		
		Object recipe = n1 + n2 + n3;
		
		if (recipe != null) {
			System.out.println("\nYour recipe is ready: " + recipe); 
			
		} else if ((boolean) (recipe=null)) {
			System.out.println("\nYour recipe is not completed.");
		}
			
		//String recipe = scan.nextLine();  // Read user input
	    
	    /*//boolean ingred1 = (true);
		//String n = "milk";
		//String input = n1+n2+n3;
		//int n = input.nextInt();
		
		if (n>=3) {
			System.out.println("\nYour recipe is ready. Enjoy!");
		
		} else if (n<=3) {
			System.out.println("\nYour recipe is not ready.");
		}*/
	}
}
