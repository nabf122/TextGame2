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
	
	// 던전 구성 요소
	private String dungeonName;
	private String dungeonDesc;
	
	// 던전 건설하기
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
