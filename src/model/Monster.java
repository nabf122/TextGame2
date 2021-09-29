package model;

public class Monster {

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

	private String mon_name;
	private String mon_Rank;
	private int mon_level;
	private int mon_max_hp;
	private int mon_cur_hp;
	private int mon_attack_damage;
	private int mon_defense;
	private int mon_own_gold;
	private int mon_xp;
	
	// 그린 슬라임 생성
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
	}
		
	// 몬스터의 상태 확인
	public void MonStatus() {
		System.out.println("\nMonster Status!\n");
		System.out.println("Name :"+mon_name+"\nRank :"+mon_Rank+"\n\nlevel :"+mon_level+"\nMaxHP :"+mon_max_hp+"\nCurHP :"+mon_cur_hp
				+"\nAttack Damage :"+mon_attack_damage+"\nDefense :"+mon_defense+"\nGold :"+mon_own_gold+"\n\n");
	}
	
	public void MonAttack(String a) {
		System.out.println(getMon_name()+" Attack!");
		
	}
	
}
