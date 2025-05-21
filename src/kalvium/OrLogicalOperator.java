package kalvium;

public class OrLogicalOperator {
	public static void main(String args[]) {
		boolean FoundGold = false;
		boolean FoundDiamond = true;
		if(FoundGold || FoundDiamond) {
			System.out.println("Congratulations!, You found the treasure hunt!");
		}
		else {
			System.out.println("Sorry, You didn't find either gold nor Diamond. Better luck next time");
		}
	}

}
