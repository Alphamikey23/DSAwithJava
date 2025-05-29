package kalvium;

public class SchoolMenu {
	public static void main(String [] args) {
			String day = "Monday";
			boolean SpecialDay = true;
			boolean regularDay = false;
			boolean SunnyDay = true;
			boolean ColdDay = false;
			if (day.equals("Monday")) {
				if (SpecialDay) {
					System.out.println("Today's menu is pizza!");
				}
				else if(regularDay) {
					System.out.println("Today's menu is sandwiches");
				}
				
			}
			else if(day.equals("Friday")) {
				if(SunnyDay) {
					System.out.println("Today's menu is Ice-cream");
				}
				else if (ColdDay) {
					System.out.println("Today's menu is hot chocolate");
				}
			}
			else {
				System.out.println("Invalid option, Sorry We serve food only on Monday's and Friday's ");
			}
	}

}
