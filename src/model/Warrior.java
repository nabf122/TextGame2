package model;

public class Warrior extends Character {
	
	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	// 공격
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
