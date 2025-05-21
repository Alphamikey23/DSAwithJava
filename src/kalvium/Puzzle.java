package kalvium;

public class Puzzle {
	public static void main(String args[]) {
		int coins = 20;
		int health = 70;
		boolean hasShield = false;

		if (coins > 10 && !hasShield) {
		    coins -= 10; // Buy a shield
		    hasShield = true;
		}

		if (health < 80 || hasShield) {
		    health += 10; // Heal yourself
		}

		System.out.println("Coins: " + coins);
		System.out.println("Health: " + health);
		System.out.println("Has Shield: " + hasShield);
		
	}
	
}
