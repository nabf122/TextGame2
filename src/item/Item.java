package item;

public class Item {
	
	private String item_name; // ������ �̸�
	private int price; // ������ ����
	private int sel_price; // ������ �� �� ����
	private String item_explanation; // ������ ����
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSel_price() {
		return sel_price;
	}
	public void setSel_price(int sel_price) {
		this.sel_price = sel_price;
	}
	public String getItem_explanation() {
		return item_explanation;
	}
	public void setItem_explanation(String item_explanation) {
		this.item_explanation = item_explanation;
	}	
}