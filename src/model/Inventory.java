package model;

public interface Inventory {
	
	// 최대 소유 갯수 제한
	public int Max_Integer = 100;
	
	public String item_name = "";
	public int buyGold = 0;
	public int selGold = 0;
	
	
	// 아이템을 구매하는 메소드
	void buyItem(int num, String item_name, int gold);
	
	// 아이템을 판매하는 메소드
	void selItem(int num, String item_name, int gold);
}

/*
 * 아이템.. 
 * 
 * 장착 가능한 아이템
 * 소비 아이템
 * 
 * 제작 아이템
 * 
 * 아이템 획득
 * 
 */