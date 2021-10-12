package model;

import java.util.Random;

public class Adventurer extends Character {

		// Warrior Building
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
			setSpeed(2);
		}
		
		// Archer Building
		public void buildArcher() {
			setJob("Archer");
			setLevel(1);
			setXp(0);
			setMax_hp(30);
			setCur_hp(30);
			setAttack_damage(9);
			setDefense(1);
			setCritical_chance(10);
			setOwn_gold(0);
			setSpeed(3);
		}
		
		// Magician Building
		public void buildMagician() {
			setJob("Magician");
			setLevel(1);
			setXp(0);
			setMax_hp(35);
			setCur_hp(35);
			setAttack_damage(12);
			setDefense(2);
			setCritical_chance(5);
			setOwn_gold(0);
			setSpeed(1);
		}
		
		// Status
		public void CharStatus() {
			System.out.println("\nYour Character Status!\n");
			System.out.println("Name :"+getName()+"\nClass :"+getJob()+"\n\nlevel :"+getLevel()+"\nxp :"+getXp()+"\nMaxHP :"+getMax_hp()+"\nCurHP :"+getCur_hp()
					+"\nAttack Damage :"+getAttack_damage()+"\nDefense :"+getDefense()+"\nCritical Chance :"+getCritical_chance()+"%\nGold :"+getOwn_gold()+
					"\nSpeed :"+ getSpeed() +"\n\n");
		}
		
		// healing Adventurer
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
		
		// Item
		public void CharUseItem() {
			
		}
		
		// Adventurer attack
		public int attack() {
						
			return getAttack_damage();
		}
		
		// 선공권 확인하는 로직
		public boolean chk_speed(int speed) {
			int mon_speed = speed;
			if(getSpeed() >= mon_speed) {
				return true;
			}else
				return false;
		}
		
		// Adventurer take attacked
		public void attacked(int num) {
			int result = 0;
			if(getDefense() >= num) {
				System.out.println(getName()+": no damage was done!");
			} else {
				result = num - getDefense();
				setCur_hp(getCur_hp() - result);
				System.out.println(getName()+": took "+result+" damage.");
			}
		}
		
		// check Adventurer HP
		public boolean chkhp() {
			boolean chk;
			
			if(getCur_hp() <= 0) {
				chk = false;
			}else
				chk = true;
			
			return chk;
		}
		
		// Adventurer receive Gold
		public void receiveGold(int gold) {
			setOwn_gold(getOwn_gold()+gold);
			System.out.println("You got "+gold+" gold.");
		}
		
		// Adventurer receive XP
		public void receiveXp(int xp) {
			setXp(getXp()+ xp);
			System.out.println("You got "+xp+" xp.");
		}
		
		// Adventurer CKECK LEVEL UP 
		public void levelupChk(){
			if(getLevel() == 1 && getXp() >= 10) {
				setXp(getXp()- 10);
				setLevel(2);
				levelup_msg();
			} else if(getLevel() == 2 && getXp() >= 20)	{
				setXp(getXp()- 20);
				setLevel(3);
				levelup_msg();
				System.out.println("New skill can be used.");
			} else if(getLevel() == 3 && getXp() >= 30)	{
				setXp(getXp()- 30);
				setLevel(4);
				levelup_msg();
			} else if(getLevel() == 4 && getXp() >= 40)	{
				setXp(getXp()- 40);
				setLevel(5);
				levelup_msg();
			} else if(getLevel() == 5 && getXp() >= 50)	{
				setXp(getXp()- 50);
				setLevel(6);
				levelup_msg();
			} else if(getLevel() == 6 && getXp() >= 70)	{
				setXp(getXp()- 70);
				setLevel(7);
				levelup_msg();
				System.out.println("New skill can be used.");
			} else if(getLevel() == 7 && getXp() >= 90)	{
				setXp(getXp()- 90);
				setLevel(8);
				levelup_msg();
			} else if(getLevel() == 8 && getXp() >= 110)	{
				setXp(getXp()- 110);
				setLevel(9);
				levelup_msg();
			} else if(getLevel() == 9 && getXp() >= 130)	{
				setXp(getXp()- 130);
				setLevel(10);
				levelup_msg();
				System.out.println("New skill can be used.");
			} else if(getLevel() == 10 && getXp() >= 150)	{
				setXp(getXp()- 150);
				setLevel(11);
				levelup_msg();
			} else {
				System.out.println("lack of xp.\n");
				return;
			}
		}
		
		void levelup_msg() {
			System.out.println("Level UP!!\n");
			System.out.println("Your level is "+getLevel());
			System.out.println("Stat has risen!");
		}
		
}
