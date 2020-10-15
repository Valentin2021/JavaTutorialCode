
public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == is equal to
		// != is not equal to
		// <=  less then or equal to
		// < less than
		// >= greater then or equal to
		// > greater than
		// || OR
		// && AND
		
		/* integers comparison
		int a = 5;
		int b = 4;
		
		boolean c= (a <= b);
		System.out.println(c); */
		
		double a = 3.7;
		
		if( a == 3.7) {
			System.out.println("They are equal.");
		}
		
		if( a > 7) {
			System.out.println("Greater than 7.");
		}
		if(a == 2.5 || a == 3.7) {      // using OR
			System.out.println("a is 2.5 or 3.7.");
		}
		if(a >=0 && a <=100) {
			System.out.println("a is in range 0-100");
		}
	}   

}
