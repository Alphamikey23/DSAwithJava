package kalvium;

public class RollDice {
	public static void main(String args[]) {
		int dice = 4;
		switch(dice) {
		case 1:
			System.out.println("Move 1 place");
			break;
		case 2:
			System.out.println("Move 2 place");
			break;
		case 3:
			System.out.println("Move 3 place");
			break;
		case 4:
			System.out.println("Move 4 place");
			break;
		case 5:
			System.out.println("Move 5 place");
			break;
		case 6:
			System.out.println("Move 6 place");
			break;
		default:
			System.out.println("Invalid input");
		}
		
	}
}
