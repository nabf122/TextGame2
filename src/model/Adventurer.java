package model;

import java.util.Random;

public class Adventurer extends Character {

	// Warrior ĳ���� ����
		public void buildWarrior() {
			setJob("Warrior");
			setLevel(1);
			setXp(0);
			setMax_hp(40);
			setCur_hp(40);
			setAttack_damage(6);
			setDefense(3);
			setCritical_chance(5);
			setOwn_gold(0);
		}
		
		// Archer ĳ���� ����
		public void buildArcher() {
			setJob("Archer");
			setLevel(1);
			setXp(0);
			setMax_hp(30);
			setCur_hp(30);
			setAttack_damage(10);
			setDefense(1);
			setCritical_chance(10);
			setOwn_gold(0);
		}
		
		// Magician ĳ���� ����
		public void buildMagician() {
			setJob("Magician");
			setLevel(1);
			setXp(0);
			setMax_hp(40);
			setCur_hp(40);
			setAttack_damage(8);
			setDefense(1);
			setCritical_chance(5);
			setOwn_gold(0);
		}
			
		// ĳ���� ���� Ȯ��
		public void CharStatus() {
			System.out.println("\nYour Character Status!\n");
			System.out.println("Name :"+getName()+"\nClass :"+getJob()+"\n\nlevel :"+getLevel()+"\nxp :"+getXp()+"\nMaxHP :"+getMax_hp()+"\nCurHP :"+getCur_hp()
					+"\nAttack Damage :"+getAttack_damage()+"\nDefense :"+getDefense()+"\nCritical Chance :"+getCritical_chance()+"%\nGold :"+getOwn_gold()+"\n\n");
		}
		
		public int heal(int max, int cur, String str) {
			
			if(str.charAt(0) == 'w') {
				if(max <= cur) {
					System.out.println("already full your HP");
				}else {
					cur = cur + 5;
					if(max <= cur) {
						cur = max;
					}
				}
			}
			if(str.charAt(0) == 'a') {
				if(max <= cur) {
					System.out.println("already full your HP");
				}else {
					cur = cur + 5;
					if(max <= cur) {
						cur = max;
					}
				}
			}
			if(str.charAt(0) == 'm') {
				if(max <= cur) {
					System.out.println("already full your HP");
				}else {
					cur = cur + 10;
					if(max <= cur) {
						cur = max;
					}
				}
			}
			
			return cur;
		}
		
		// ĳ���� ������ ���
		public void CharUseItem() {
			
		}
		
		// �����ϴ�
		public int attack() {
			
			Random random = new Random();
			
			int result = 0;
			int critical = 0;
			
			critical = (int) (Math.random() * 100 + 1);
			if(1 <= critical && critical <= getCritical_chance()) {
				result = (random.nextInt(getAttack_damage()) - 1) * 2;
				System.out.println("Critical Attack!");
			}else {
				result = random.nextInt(getAttack_damage()) - 1;
			}
			
			return result;
		}
		
		// ���ݹ޴�
		public void attacked(int num) {
			int result = 0;
			if(getDefense() >= num) {
				System.out.println("No damage was done!");
			} else {
				result = num - getDefense();
				setCur_hp(getCur_hp() - result);
				System.out.println("Took "+result+" damage.");
			}
		}
		
		// ���� ü���� üũ�ϴ�
		public boolean chkhp() {
			boolean chk;
			
			if(getCur_hp() <= 0) {
				chk = false;
			}else
				chk = true;
			
			return chk;
		}
		
		//���� �Ѱܹ޴�
		public void receiveGold(int gold) {
			setOwn_gold(getOwn_gold()+gold);
			System.out.println("You got "+gold+" gold.");
		}
		
		//����ġ�� �Ѱܹ޴�
		public void receiveXp(int xp) {
			setXp(getXp()+ xp);
			System.out.println("You got "+xp+" xp.");
		}
		
}