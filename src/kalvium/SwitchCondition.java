package kalvium;

public class SwitchCondition {
	public static void main (String args[]) {
		int pizzaChoice;
		pizzaChoice = 3;
		switch(pizzaChoice) {
		case 1:
			System.out.println("You have ordered Cheese Pizza");
			break;
		
		case 2:
			System.out.println("You have ordered Pepperoni Pizza");
			break;
		case 3:
			System.out.println("You have ordered Veggie Pizza");
			break;
		default:
			System.out.println("You have ordered default Tomoto and cheese pizza");
		}
	
	}

}
