package item;

import java.util.ArrayList;

class ItemEntry
{
	/**
	 * 아이템 객체
	 */
	public String item;
	
	/**
	 * 중첩된 수량
	 */
	public int count;
	
	public ItemEntry(String item, int count)
	{
		this.item = item;
		this.count = count;
	}
}

public class Inventory {
	
	/**
	 * 인벤토리에 들어있는 아이템 목록. 비어있는 칸은 <code>null</code>.
	 */
	private ArrayList<ItemEntry> itemList;
	
	/**
	 * 인벤토리에 들어있는 아이템의 수
	 */
	private int items;
	
	/**
	 * 인벤토리의 실제 크기
	 */
	public static final int MAX_ITEMS = 10;
	
	public Inventory()
	{
		itemList = new ArrayList<ItemEntry>(MAX_ITEMS);
		for (int i = 0; i < MAX_ITEMS; i++)
			itemList.add(null);
		items = 0;
	}
	
	/**
	 * 인벤토리에 아이템을 한 개 추가한다.
	 * @param item 아이템 객체
	 * @return 성공 여부
	 */
	public boolean addItem(String item) {
		// 아이템이 있는지 검사
		int index = findItem(item);
		
		if(index < 0)	// 아이템이 없다면 
		{
			// 빈 자리에 추가
			for(int i = 0; i < MAX_ITEMS; ++ i)
			{
				if(itemList.get(i) == null)
				{
					itemList.set(i, new ItemEntry(item, 1));
					++ items;
					return true;
				}
			}
		}else	// 아이템이 있다면
		{
			++ itemList.get(index).count;	// 수량을 1만큼 증가
			return true;
		}
		return false;
	}
	
	/**
	 * 인벤토리에 아이템을 삭제한다.
	 * @param item 아이템 객체
	 * @return 성공 여부
	 */
	public boolean removeItem(int index) {
		ItemEntry entry = itemList.get(index);
		if(entry != null)	// 아이템이 비어있지 않다면
		{
			-- entry.count;	// 수량을 1만큼 감소
			if(entry.count <= 0)	// 수량이 0이하라면
			{
				itemList.set(index, null);	// 아이템 비우기
				-- items;
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 지정된 아이템이 들어있는 인벤토리 칸 번호를 찾는다.
	 * @param item 찾을 아이템 객체
	 * @return 인벤토리 칸 번호. 없다면 <code>-1</code>.
	 */
	public int findItem(String item) {
		
		for(int i = 0; i < MAX_ITEMS; ++ i)
		{
			if(itemList.get(i) != null && itemList.get(i).item.equals(item))
				return i;
		}
		
		return -1;
	}
	
	/**
	 * 인벤토리에 들어있는 아이템 수 찾기
	 * return 아이템 수
	 */
	public int getAvailableItems() {
		return items;
	}
	
	/**
	 * 인벤토리에 들어있는 아이템 리스트 보여주기
	 * return 아이템 수
	 */
	public void showItems() {
		System.out.println("슬롯 | 아이템 | 갯수");
		System.out.println("----------------");
		
		for(int i = 0; i < MAX_ITEMS; ++ i)
		{
			if(itemList.get(i) != null)
			{
				System.out.println(i+" | "+ itemList.get(i).item+" | "+itemList.get(i).count);
			}else
				System.out.println(i+" 번 슬롯이 비었습니다.");
		}
	}
}