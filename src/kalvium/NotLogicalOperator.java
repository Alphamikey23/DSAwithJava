package kalvium;

public class NotLogicalOperator {
	public static void main(String args[]) {
		boolean DoorLocked = true;
		if (DoorLocked) {
			DoorLocked = false;
			System.out.println("Using NOT operator we have unlocked the door!");
		}
		else {
			System.out.println("The Door is unlocked!");
		}
	}
}
