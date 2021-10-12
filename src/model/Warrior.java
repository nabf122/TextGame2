package model;

import java.util.Random;
import java.util.Scanner;

public class Warrior extends Adventurer {
	// Warroir attack
	public int attack() {
				
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		String skill;
		int sum_d = 0;
		int result = 0;
		int critical = 0;
		
		System.out.println("Choose Skill.");
		skill();
		skill = scan.nextLine();
		
		if(skill.charAt(0) == '1') {
			System.out.println("Power Attack");
			sum_d = getAttack_damage() + 3;
		}
		if(skill.charAt(0) == '2' && getLevel() >= 3) {
			System.out.println("Wheel Wind");
			sum_d = getAttack_damage() + 5;
		}
		if(skill.charAt(0) == '3' && getLevel() >= 7) {
			System.out.println("Berserker Mode");
			sum_d = getAttack_damage() + 5;
		}
		if(skill.charAt(0) == '4' && getLevel() >= 10) {
			System.out.println("Ground Smite");
			sum_d = getAttack_damage() + 10;
		}
		
		critical = (int) (Math.random() * 100 + 1);
		if(1 <= critical && critical <= getCritical_chance()) {
			result = (random.nextInt(sum_d) + 1) * 2;
			System.out.println("Critical Attack!");
			System.out.println(getName()+"은(는) "+result+"의 데미지로 공격을 하였다.");
		}else {
			result = random.nextInt(sum_d) + 1;
			System.out.println(getName()+"은(는) "+result+"의 데미지로 공격을 하였다.");
		}
				
		return result;
	}
	
	void skill() {
		if(getLevel() >= 1) {
			System.out.println("(1) Power Attack");
		}
		if(getLevel() >= 3) {
			System.out.println("(2) Wheel Wind");
		}
		if(getLevel() >= 7) {
			System.out.println("(3) Berserker Mode");
		}
		if(getLevel() >= 10) {
			System.out.println("(4) Ground Smite");
		}
	}
}
