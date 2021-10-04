package model;

public class ConsumableItem extends Item {

	// 소비 아이템 클래스
	
	private int effect_shame; // 효과 수치
	private int effect_name; // 효과 이름
	
	public int getEffect_shame() {
		return effect_shame;
	}
	public void setEffect_shame(int effect_shame) {
		this.effect_shame = effect_shame;
	}
	public int getEffect_name() {
		return effect_name;
	}
	public void setEffect_name(int effect_name) {
		this.effect_name = effect_name;
	}
}
