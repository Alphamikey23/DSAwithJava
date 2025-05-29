package kalvium;

public class IceCreamParlor {
	public static void main(String args[]) {
		String choice = "milkshake";
		String flavor = "banana";
		if (choice.equals("icecream")) {
			if (flavor.equals("chocolate")) {
				System.out.println("You have choose chocolate ice-cream");
			}
			else if (flavor.equals("vanilla")) {
				System.out.println("You have choosen vanilla ice-cream");
			}
			else {
				System.out.println("Sorry, That flavor is not available in ice-cream");
			}
		}
		else if(choice.equals("milkshake")) {
			if (flavor.equals("strawberry")) {
				System.out.println("You have choose strawberry milkshake");
			}
			else if(flavor.equals("banana")) {
				System.out.println("You have choosen banana smoothie");
			}
			else {
				System.out.println("Sorry, that flavor is not available in milkshake");
			}
		}
		else {
			System.out.println("Invalid dessert choice, Please choose icecream or milkshake");
		}
	}

}
