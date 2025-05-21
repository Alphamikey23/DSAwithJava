package kalvium;

public class ConditionalStatementsifelse {
	public static void main(String args[]) {
		int temparature = 30;
		if (temparature < 15) {
			System.out.println("Wear a Jacket!");
		}
		else if (temparature <= 25) {
			System.out.println("Wear a T-Shirt");
		}
		else {
			System.out.println("Wear Shorts!");
		}
	}

}
