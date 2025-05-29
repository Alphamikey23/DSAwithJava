package kalvium;

public class NestedConditions {
	public static void main(String args[]) {
		String weather = "Sunny";
		int NumberOfFriends = 5;
		if (weather.equals("Sunny")) {
			if (NumberOfFriends > 10) {
				System.out.println("Plan for outdoor picnic");
			}
			else {
				System.out.println("Plan for organizing a bike ride");
			}
			
		}
		else if (weather.equals("Rainy")) {
			if (NumberOfFriends > 10) {
				System.out.println("Plan for indoor board games");
			}
			else {
				System.out.println("Plan for a movie marathon");
			}
		}
		else {
			System.out.println("Invalid weather input. Please choose sunny or rainy");
		}
	}

}
