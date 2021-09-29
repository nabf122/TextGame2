package model;

public class Warrior extends Character {
		
			
	// 공격하기
	public void attack() {
		System.out.println("Power Strike!");
	}
	
	// 맞다
	public void takeDamage() {
		System.out.println("take a hit!");
	}
	
	// 죽음
	public void die() {
		System.out.println("You die!");
	}
}
