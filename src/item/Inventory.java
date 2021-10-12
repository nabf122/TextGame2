package item;

public interface Inventory {
	
	// �ִ� ���� ���� ����
	public int Max_Integer = 100;
	
	public String item_name = "";
	public int buyGold = 0;
	public int selGold = 0;
	
	
	// �������� �����ϴ� �޼ҵ�
	void buyItem(int num, String item_name, int gold);
	
	// �������� �Ǹ��ϴ� �޼ҵ�
	void selItem(int num, String item_name, int gold);
}

/*
 * ������.. 
 * 
 * ���� ������ ������
 * �Һ� ������
 * 
 * ���� ������
 * 
 * ������ ȹ��
 * 
 */