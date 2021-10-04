package model;

import java.util.Random;

public class Adventurer extends Character {

	// Warrior 캐릭터 생성
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
		
		// Archer 캐릭터 생성
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
		
		// Magician 캐릭터 생성
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
		
		// 캐릭터 상태 확인
		public void CharStatus() {
			System.out.println("\nYour Character Status!\n");
			System.out.println("Name :"+getName()+"\nClass :"+getJob()+"\n\nlevel :"+getLevel()+"\nxp :"+getXp()+"\nMaxHP :"+getMax_hp()+"\nCurHP :"+getCur_hp()
					+"\nAttack Damage :"+getAttack_damage()+"\nDefense :"+getDefense()+"\nCritical Chance :"+getCritical_chance()+"%\nGold :"+getOwn_gold()+"\n\n");
		}
		
		// heal 스킬 사용 시 체력 체크
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
		
		// 캐릭터 아이템 사용
		public void CharUseItem() {
			
		}
		
		// 공격하다
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
		
		// 공격받다
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
		
		// 남은 체력을 체크하다
		public boolean chkhp() {
			boolean chk;
			
			if(getCur_hp() <= 0) {
				chk = false;
			}else
				chk = true;
			
			return chk;
		}
		
		// 돈을 넘겨받다
		public void receiveGold(int gold) {
			setOwn_gold(getOwn_gold()+gold);
			System.out.println("You got "+gold+" gold.");
		}
		
		// 경험치를 넘겨받다
		public void receiveXp(int xp) {
			setXp(getXp()+ xp);
			System.out.println("You got "+xp+" xp.");
		}
		
		// 레벨업 체크
		public void levelupChk(){
			if(getLevel() == 1 && getXp() >= 10) {
				setXp(getXp()- 10);
				setLevel(2);
			} else if(getLevel() == 2 && getXp() >= 20)	{
				setXp(getXp()- 20);
				setLevel(3);
			} else if(getLevel() == 3 && getXp() >= 30)	{
				setXp(getXp()- 30);
				setLevel(4);
			} else if(getLevel() == 4 && getXp() >= 40)	{
				setXp(getXp()- 40);
				setLevel(5);
			} else if(getLevel() == 5 && getXp() >= 50)	{
				setXp(getXp()- 50);
				setLevel(6);
			} else if(getLevel() == 6 && getXp() >= 70)	{
				setXp(getXp()- 70);
				setLevel(7);
			} else if(getLevel() == 7 && getXp() >= 90)	{
				setXp(getXp()- 90);
				setLevel(8);
			} else if(getLevel() == 8 && getXp() >= 110)	{
				setXp(getXp()- 110);
				setLevel(9);
			} else if(getLevel() == 9 && getXp() >= 130)	{
				setXp(getXp()- 130);
				setLevel(10);
			} else if(getLevel() == 10 && getXp() >= 150)	{
				setXp(getXp()- 150);
				setLevel(11);
			} else {
				System.out.println("lack of xp.\n");
				return;
			}
			
			System.out.println("Level UP!!\n");
			System.out.println("Your level is "+getLevel());
			System.out.println("Stat has risen!");
		}
		
}
