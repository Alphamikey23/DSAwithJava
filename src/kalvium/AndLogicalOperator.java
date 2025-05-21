package kalvium;

public class AndLogicalOperator {
	public static void main(String args[]) {
		int age = 28;
		boolean hasTicket = true;
		if (age > 18 && hasTicket) {
			System.out.println("Yes, You can watch the movie");
		}
		else {
			System.out.println("No, Sorry better luck next time.");
		}
	}

}
