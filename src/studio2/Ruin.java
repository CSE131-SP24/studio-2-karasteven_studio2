package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Your start amount is ");
		int startAmount = in.nextInt();
		System.out.println("Your win limit is ");
		int winLimit = in.nextInt();
		System.out.println("Your win chance is ");
		int winChance = in.nextInt();
		
		while(startAmount < winLimit) {
			
			int chance = (int)(Math.random()*100+1);
			if(chance<=winChance) {
				System.out.println("You win.");
				startAmount++;
				System.out.println("Your money amount is "+ startAmount);
				System.out.println();
			}
			else {
				System.out.println("You lose.");
				startAmount--;
				System.out.println("Your money amount is "+ startAmount);
				System.out.println();
			}
		}
		
		if(startAmount==winLimit) {
			System.out.println("Game over");
		}
	}

}
