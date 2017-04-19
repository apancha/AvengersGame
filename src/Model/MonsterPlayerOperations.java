package Model;
import Model.Monster;

/**
 * Class: Monster Tester
 * 
 * @author  Course : ITEC 3860, Spring, 2017 Written: April , 
 *         2017
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */

import Model.Items;
import Model.Player;
import java.util.Scanner;
public class MonsterPlayerOperations 
{
	public Player p1;
	public static Monster m1;
	public static void main(String[] args) 
	{
		System.out.println(m1);
		System.out.println("Please Enter The Item Name.");
		Scanner input = new Scanner(System.in);
		String item = input.nextLine();
		Player aj = new Player(25,25,25);
		aj.Fight();
		if(item.equalsIgnoreCase("Green Herb") || item.equalsIgnoreCase("Red Herb"))
		{
			System.out.println("Would you like to combine the green and red herbs? \nEnter Yes or No.");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("You have combined the red and green herb. \nWould you like to use the new combined herb? Enter Yes or No.");
				String answer2 = input.nextLine();
				if(answer2.equalsIgnoreCase("Yes"))
				{
					String health = aj.currentHealth();
					String[] healthNum = health.split(" ");
					int hp = Integer.parseInt(healthNum[2]);
					System.out.print("Your new health is : " + (hp + Items.healthRegen));
				}
				if(answer2.equalsIgnoreCase("no"))
				{
					System.out.println("Item is now stored in your inventory.");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Would you like to use only the Green Herb? \nEnter Yes or No.");
				String answer3 = input.nextLine();
				if(answer3.equalsIgnoreCase("Yes"))
				{
					String health = aj.currentHealth();
					String[] healthNum = health.split(" ");
					System.out.print("Your new health is : " + (Integer.parseInt(healthNum[2]) + 15));
				}
				if(answer3.equalsIgnoreCase("No"))
				{
					System.out.println("Okay, your item is back in inventory.");
					System.exit(0);
				}
			}
	
		}
		else
		{
			System.out.println("Please enter a valid item name.");
			item = input.nextLine();
		}
		
	}
	
	public void Fight()
	{
		while (Player.isAlive() && Monster.isAlive()) {
			
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do? \nAttack, Run, or Use Item?");
		String userInput = input.nextLine();
		if(userInput.equalsIgnoreCase("Attack"))
		{
			
			System.out.println("You have chosen to attack: " + m1.getName());
			p1.currentHealth();
			p1.currentAtk();
			p1.currentHealth();
			m1.getAttack();
			m1.getHealth();
			
			
			
		}
		if(userInput.equalsIgnoreCase("Run"))
		{
			Player.escapeRoll();
			if (Player.escapeRoll() > 5) {
				System.out.println("You managed to escape.");
				// Add code to exit the fight here.
			}
		}
		if(userInput.equalsIgnoreCase("Use Item"))
		{
			
		}
		else 
		{	
			System.out.println("That action was not recognized, please try to enter another option");	
			Player.Fight();
		}
	
	
}
}