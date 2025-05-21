package kalvium;

public class AssingmentOperators {
	public static void main(String args[]) {
		int coins = 10;
		System.out.println("You have "+coins+" coins in your pocket");
		
		coins +=5;
		System.out.println("After adding 5 coins, Your pocket has "+coins+" coins");
		
		System.out.println("Do you want to buy chocolates? Press Y for yes or N for No");
		
		coins +=3;
		
		System.out.println("After buying chacolates, You have "+coins+" in your pocket");
		
		coins *=2;
		
		System.out.println("After doubling your coins, we have "+coins+" in your pocket");
		
		int updated_coins = coins /4;
		
		System.out.println("After spliting the total "+coins+" coins Among your four friends you have "+updated_coins+" In your pcoket" );
	}
}
