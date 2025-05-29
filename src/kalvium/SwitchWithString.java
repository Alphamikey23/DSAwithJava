package kalvium;

public class SwitchWithString {
	public static void main(String args[]) {
		String day = "Saturday";
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Go to work!");
			break;
		case "Saturday":
			System.out.println("Enjoy the weekend!");
			break;
		default:
			System.out.println("Invalid day!");
		}
	}

}
