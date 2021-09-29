package model;

public class GreenSlime extends Monster {
	
	// 공격
	public void attack() {
		System.out.println("Slime attack.");
	}
	
	// 맞음
	public void takeDamage() {
		System.out.println("take a hit.");
	}
	
	// 죽음
	public void die() {
		System.out.println("Slime die!");
	}

}
