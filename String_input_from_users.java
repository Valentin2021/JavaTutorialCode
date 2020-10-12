import java.util.Scanner;

public class String_input_from_users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter user 1: ");
		String user1= scan.nextLine();
		
		System.out.println("Enter user 2: ");
		String user2= scan.nextLine();
		
		System.out.println("Enter user 3: ");
		String user3= scan.nextLine();
		
		System.out.println("Here are your users:");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}

}
