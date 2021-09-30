package model;

public class Character {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getMax_hp() {
		return max_hp;
	}

	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}

	public int getCur_hp() {
		return cur_hp;
	}

	public void setCur_hp(int cur_hp) {
		this.cur_hp = cur_hp;
	}

	public int getAttack_damage() {
		return attack_damage;
	}

	public void setAttack_damage(int attack_damage) {
		this.attack_damage = attack_damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getCritical_chance() {
		return critical_chance;
	}

	public void setCritical_chance(int critical_chance) {
		this.critical_chance = critical_chance;
	}

	public int getOwn_gold() {
		return own_gold;
	}

	public void setOwn_gold(int own_gold) {
		this.own_gold = own_gold;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	private String job;
	private String name;
	private int level;
	private int xp;
	private int max_hp;
	private int cur_hp;
	private int attack_damage;
	private int defense;
	private int critical_chance;
	private int own_gold;

}
