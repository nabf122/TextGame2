package model;

public class Dungeon {
	
	public String getDungeonName() {
		return dungeonName;
	}
	public void setDungeonName(String dungeonName) {
		this.dungeonName = dungeonName;
	}
	public String getDungeonDesc() {
		return dungeonDesc;
	}
	public void setDungeonDesc(String dungeonDesc) {
		this.dungeonDesc = dungeonDesc;
	}
	
	// ���� ���� ���
	private String dungeonName;
	private String dungeonDesc;
	
	// ���� �Ǽ��ϱ�
	public void buildDungeon(String str) {
		String str1 = str;
		
		if(str1.charAt(0) == '1') {
			System.out.println("You have entered 'Slime Plains'.");
			dungeonName ="sp";
			
		} else if(str1.charAt(0) == '2') {
			System.out.println("You have entered 'Golem Shunji'.");
			dungeonName ="gs";
			
		} else if(str1.charAt(0) == '3') {
			System.out.println("You have entered 'Dragon Valley'.");
			dungeonName ="dv";
		}
	}
	
	public void phaseOne() {
		
		if(dungeonName.equals("sp")) {
			
			
		}
	}
}
