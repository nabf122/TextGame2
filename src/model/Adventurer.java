package model;

import java.util.Random;

public class Adventurer extends Character {

		// Warrior 생성
		public void buildWarrior() {
			setJob("Warrior");
			setLevel(1);
			setXp(0);
			setMax_hp(40);
			setCur_hp(40);
			setAttack_damage(6);
			setDefense(3);
			setCritical_chance(5);
			setOwn_gold(200);
			setSpeed(2);
		}
		
		// Archer 생성
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
		
		// Magician 생성
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
		
		/*
		 * 사용자의 캐릭터 스테이터스
		 */
		public void CharStatus() {
			System.out.println("\nYour Character Status!\n");
			System.out.println("Name :"+getName()+"\nClass :"+getJob()+"\n\nlevel :"+getLevel()+"\nxp :"+getXp()+"\nMaxHP :"+getMax_hp()+"\nCurHP :"+getCur_hp()
					+"\nAttack Damage :"+getAttack_damage()+"\nDefense :"+getDefense()+"\nCritical Chance :"+getCritical_chance()+"%\nGold :"+getOwn_gold()+
					"\nSpeed :"+ getSpeed() +"\n\n");
		}
		
		// 힐 스킬 사용 로직
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
		
		/*
		 * 아이템 구매 시 골드 체크 및 사용 로직
		 */
		public boolean buyItem(int gold) {
			if(getOwn_gold() >= gold)
			{
				setOwn_gold(getOwn_gold() - gold);
				return true;
			}
			else
				return false;
		}
		
		/*
		 * 
		 */
		public int attack() {
						
			return getAttack_damage();
		}
		
		/*
		 * 선공권을 체크하는 로직
		 */
		public boolean chkSpeed(int speed) {
			int mon_speed = speed;
			if(getSpeed() >= mon_speed) {
				return true;
			}else
				return false;
		}
		
		/*
		 * 몬스터로부터 피격 당했을 때, 받는 데미지 계산
		 */
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
		
		/*
		 * 사용자의 hp를 체크하는 로직
		 * return true or false
		 */
		public boolean chkhp() {
			
			if(getCur_hp() <= 0) {
				return false;
			}else
				return true;
		}
		
		/*
		 * 몬스터를 죽였을 때 골드 획득
		 */
		public void receiveGold(int gold) {
			setOwn_gold(getOwn_gold()+gold);
			System.out.println("You got "+gold+" gold.");
		}
		
		/*
		 * 몬스터를 죽였을 때 경험치 획득
		 */
		public void receiveXp(int xp) {
			setXp(getXp()+ xp);
			System.out.println("You got "+xp+" xp.");
		}
		
		/*
		 * 사용자의 레벨업을 체크
		 */
		public void levelupChk(){
			if(getLevel() == 1 && getXp() >= 10) {
				setXp(getXp()- 10);
				setLevel(2);
				levelup_msg();
			} else if(getLevel() == 2 && getXp() >= 20)	{
				setXp(getXp()- 20);
				setLevel(3);
				levelup_msg();
				System.out.println("새로운 스킬을 습득했습니다.");
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
				System.out.println("새로운 스킬을 습득했습니다.");
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
				System.out.println("새로운 스킬을 습득했습니다.");
			} else if(getLevel() == 10 && getXp() >= 150)	{
				setXp(getXp()- 150);
				setLevel(11);
				levelup_msg();
			} else {
				System.out.println("경험치가 모자릅니다.\n");
				return;
			}
		}
		
		void levelup_msg() {
			System.out.println("레벨 업!!\n");
			System.out.println("레벨 : "+getLevel());
			System.out.println("스탯이 조금 상승했습니다.");
		}
		
}
