package item;

public class ConsumableItem extends Item {

	// �Һ� ������ Ŭ����
	
	private int effect_shame; // ȿ�� ��ġ
	private int effect_name; // ȿ�� �̸�
	
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
