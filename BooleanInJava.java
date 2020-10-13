
public class BooleanInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean passDoor = (1 ==1);
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(passDoor) {
			System.out.println("You passed the first door!");
			doorCount = doorCount + 1;
		}
		
		if(passDoor) {
			System.out.println("You passed the second door!");
			doorCount = doorCount + 1;
		}
		
		if(passDoor) {
			System.out.println("You passed the third door!");
			doorCount = doorCount + 1;
		}
		
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("You won!");
		}
	}

}
