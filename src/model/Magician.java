package model;

import java.util.Random;
import java.util.Scanner;

public class Magician extends Adventurer {
	// Magician attack
	public int attack() {
				
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		String skill;
		int sum_d = 0;
		int sum_c = 0;
		int result = 0;
		int critical = 0;
		int count = 0;
		
		System.out.println("Choose Skill.");
		skill();
		skill = scan.nextLine();
		
		if(skill.charAt(0) == '1') {
			System.out.println("Fireball");
			sum_d = getAttack_damage() + 5;
			sum_c = getCritical_chance();
			count = 1;
		}
		if(skill.charAt(0) == '2' && getLevel() >= 3) {
			System.out.println("Thunder Storm");
			sum_d = getAttack_damage() + 7;
			sum_c = getCritical_chance();
			count = 1;
		}
		if(skill.charAt(0) == '3' && getLevel() >= 7) {
			System.out.println("Blizzard Strike");
			sum_d = getAttack_damage() + 13;
			sum_c = getCritical_chance() + 5;
			count = 1;
		}
		if(skill.charAt(0) == '4' && getLevel() >= 10) {
			System.out.println("Meteor");
			sum_d = getAttack_damage() + 13;
			sum_c = getCritical_chance() + 5;
			count = 1;
			
		}
		
		critical = (int) (Math.random() * 100 + 1);
		if(1 <= critical && critical <= sum_c) {
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
			System.out.println("(1) Fireball");
		}
		if(getLevel() >= 3) {
			System.out.println("(2) Thunder Storm");
		}
		if(getLevel() >= 7) {
			System.out.println("(3) Blizzard Strike");
		}
		if(getLevel() >= 10) {
			System.out.println("(4) Meteor");
		}
	}
}
