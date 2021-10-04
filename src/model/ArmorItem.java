package model;

public class ArmorItem extends EquipmentItem {

	// 방어 아이템 클래스
	private int item_defense;
	private int item_hp;
	
	public int getItem_defense() {
		return item_defense;
	}
	public void setItem_defense(int item_defense) {
		this.item_defense = item_defense;
	}
	public int getItem_hp() {
		return item_hp;
	}
	public void setItem_hp(int item_hp) {
		this.item_hp = item_hp;
	}
}
