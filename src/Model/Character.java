package Model;

/**
 * Class: Character
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

public abstract class Character {
	protected int health;
	protected int atk;
	protected int def;
	protected Room currentRoom;
	
	protected Character(int health, int atk, int def) {
		this.health = health;
		this.atk = atk;
		this.def = def;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public int getHealth() {
		return this.health;
	}
	
}