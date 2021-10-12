package item;

public class EquipmentItem extends Item {
	
	public int getEqmt_hp() {
		return eqmt_hp;
	}
	public void setEqmt_hp(int eqmt_hp) {
		this.eqmt_hp = eqmt_hp;
	}
	public int getEqmt_ad() {
		return eqmt_ad;
	}
	public void setEqmt_ad(int eqmt_ad) {
		this.eqmt_ad = eqmt_ad;
	}
	public int getEqmt_df() {
		return eqmt_df;
	}
	public void setEqmt_df(int eqmt_df) {
		this.eqmt_df = eqmt_df;
	}
	public int getEqmt_cc() {
		return eqmt_cc;
	}
	public void setEqmt_cc(int eqmt_cc) {
		this.eqmt_cc = eqmt_cc;
	}
		
	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}

	private int eqmt_hp;
	private int eqmt_ad;
	private int eqmt_df;
	private int eqmt_cc;	
	private String parts;
}
