package model;

import java.util.Random;
import java.util.Scanner;

public class Archer extends Adventurer {
	// Archer attack
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
			System.out.println("Focus Shoot");
			sum_d = getAttack_damage();
			sum_c = getCritical_chance() + 5;
		}
		if(skill.charAt(0) == '2' && getLevel() >= 3) {
			System.out.println("Double Shoot");
			sum_d = getAttack_damage() + 4;
			sum_c = getCritical_chance();
			count = 2;
		}
		if(skill.charAt(0) == '3' && getLevel() >= 7) {
			System.out.println("Sniping");
			sum_d = getAttack_damage() + 10;
			sum_c = getCritical_chance() + 5;
			count = 1;
		}
		if(skill.charAt(0) == '4' && getLevel() >= 10) {
			System.out.println("Poem of Storm");
			sum_d = getAttack_damage() + 10;
			sum_c = getCritical_chance() + 10;
			count = 3;
			
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
			System.out.println("(1) Focus Shoot");
		}
		if(getLevel() >= 3) {
			System.out.println("(2) Double Shoot");
		}
		if(getLevel() >= 7) {
			System.out.println("(3) Sniping");
		}
		if(getLevel() >= 10) {
			System.out.println("(4) Poem of Storm");
		}
	}
}
