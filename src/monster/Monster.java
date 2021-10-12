package monster;

import java.util.Random;

import model.Character;

public class Monster extends Character {

	public String getMon_name() {
		return mon_name;
	}
	public void setMon_name(String mon_name) {
		this.mon_name = mon_name;
	}
	public int getMon_level() {
		return mon_level;
	}
	public void setMon_level(int mon_level) {
		this.mon_level = mon_level;
	}
	public int getMon_max_hp() {
		return mon_max_hp;
	}
	public void setMon_max_hp(int mon_max_hp) {
		this.mon_max_hp = mon_max_hp;
	}
	public int getMon_cur_hp() {
		return mon_cur_hp;
	}
	public void setMon_cur_hp(int mon_cur_hp) {
		this.mon_cur_hp = mon_cur_hp;
	}
	public int getMon_attack_damage() {
		return mon_attack_damage;
	}
	public void setMon_attack_damage(int mon_attack_damage) {
		this.mon_attack_damage = mon_attack_damage;
	}
	public int getMon_defense() {
		return mon_defense;
	}
	public void setMon_defense(int mon_defense) {
		this.mon_defense = mon_defense;
	}
	public int getMon_own_gold() {
		return mon_own_gold;
	}
	public void setMon_own_gold(int mon_own_gold) {
		this.mon_own_gold = mon_own_gold;
	}
	public int getMon_xp() {
		return mon_xp;
	}
	public void setMon_xp(int mon_xp) {
		this.mon_xp = mon_xp;
	}
	
	public String getMon_Rank() {
		return mon_Rank;
	}
	public void setMon_Rank(String mon_Rank) {
		this.mon_Rank = mon_Rank;
	}
	
	public int getMon_speed() {
		return mon_speed;
	}
	public void setMon_speed(int mon_speed) {
		this.mon_speed = mon_speed;
	}


	private String mon_name;
	private String mon_Rank;
	private int mon_level;
	private int mon_max_hp;
	private int mon_cur_hp;
	private int mon_attack_damage;
	private int mon_defense;
	private int mon_own_gold;
	private int mon_xp;
	private int mon_speed;
	
	
	// GreenSlime
	public void buildGreenSlime() {
		setMon_name("GreenSlime");
		setMon_Rank("Normal Monster");
		setMon_level(3);
		setMon_max_hp(10);
		setMon_cur_hp(10);
		setMon_attack_damage(5);
		setMon_defense(2);
		setMon_own_gold(20);
		setMon_xp(3);
		setMon_speed(1);
	
	}
	
	// StoneGolem
	public void buildStoneGolem() {
		setMon_name("StoneGolem");
		setMon_Rank("Normal Monster");
		setMon_level(5);
		setMon_max_hp(50);
		setMon_cur_hp(50);
		setMon_attack_damage(15);
		setMon_defense(5);
		setMon_own_gold(120);
		setMon_xp(10);
		setMon_speed(1);
	}
	
	// RedDragon
	public void buildRedDragon() {
		setMon_name("RedDragon");
		setMon_Rank("Normal Monster");
		setMon_level(8);
		setMon_max_hp(100);
		setMon_cur_hp(100);
		setMon_attack_damage(25);
		setMon_defense(5);
		setMon_own_gold(200);
		setMon_xp(20);
		setMon_speed(2);
	}

	// BlueDragon
	public void buildBlueDragon() {
		setMon_name("BlueDragon");
		setMon_Rank("Normal Monster");
		setMon_level(8);
		setMon_max_hp(100);
		setMon_cur_hp(100);
		setMon_attack_damage(20);
		setMon_defense(10);
		setMon_own_gold(200);
		setMon_xp(20);
		setMon_speed(1);
	}
	
	// Boss KingSlime
	public void buildKingSlime() {
		setMon_name("KingSlime");
		setMon_Rank("Boss Monster");
		setMon_level(5);
		setMon_max_hp(50);
		setMon_cur_hp(50);
		setMon_attack_damage(10);
		setMon_defense(3);
		setMon_own_gold(200);
		setMon_xp(10);
		setMon_speed(2);
	}
	
	// Boss QuagGolem
	public void buildQuagGolem() {
		setMon_name("QuagGolem");
		setMon_Rank("Boss Monster");
		setMon_level(8);
		setMon_max_hp(100);
		setMon_cur_hp(100);
		setMon_attack_damage(20);
		setMon_defense(7);
		setMon_own_gold(500);
		setMon_xp(30);
		setMon_speed(3);
	}
	
	// Boss Dracaris 
	public void buildDracaris() {
		setMon_name("Dracaris");
		setMon_Rank("Boss Monster");
		setMon_level(10);
		setMon_max_hp(200);
		setMon_cur_hp(200);
		setMon_attack_damage(30);
		setMon_defense(10);
		setMon_own_gold(1000);
		setMon_xp(200);
		setMon_speed(4);
	}
		
	//
	public void monsterStatus() {
		System.out.println("\nMonster Status!\n");
		System.out.println("Name :"+mon_name+"\nRank :"+mon_Rank+"\n\nlevel :"+mon_level+"\nMaxHP :"+mon_max_hp+"\nCurHP :"+mon_cur_hp
				+"\nAttack Damage :"+mon_attack_damage+"\nDefense :"+mon_defense+"\nGold :"+mon_own_gold+"\nSpeed :"
				+ mon_speed +"\n\n");
	}
	
	//
	public int attack() {
		
		Random random = new Random();
		
		int result = 0;
		int critical = 0;
		
		critical = (int) (Math.random() * 100 + 1);
		if(1 <= critical && critical <= 5) {
			result = (random.nextInt(mon_attack_damage) + 1) * 2;
			
			System.out.println("Monster's Critical Attack!");
			System.out.println(getMon_name()+"은(는) "+ result +"의 데미지로 공격을 하였다.");
		}else {
			result = random.nextInt(mon_attack_damage) + 1;
			System.out.println(getMon_name()+"은(는) "+ result +"의 데미지로 공격을 하였다.");
		}
		
		return result;
	}
	
	//
	public void attacked(int num) {
		int result = 0;
		if(mon_defense >= num) {
			mon_cur_hp = mon_cur_hp - result;
			System.out.println(getMon_name()+": did no damage!");
		} else {
			result = num - mon_defense;
			mon_cur_hp = mon_cur_hp - result;
			System.out.println(getMon_name()+": Deal "+result+" damage.");
		}
	}
	
	//
	public boolean chkhp() {
		boolean chk;
		
		if(mon_cur_hp <= 0) {
			chk = false;
		}else
			chk = true;
		
		return chk;
	}
	
	//
	public int giveGold() {
		return mon_own_gold;
	}
	
	//
	public int giveXp() {
		return mon_xp;
	}
}
