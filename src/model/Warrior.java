package model;

public class Warrior extends Character {
	
	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	// ����
	public void attack() {
		System.out.println("Power Strike!");
	}
	
	// �´�
	public void takeDamage() {
		System.out.println("take a hit!");
	}
	
	// ����
	public void die() {
		System.out.println("You die!");
	}
}
