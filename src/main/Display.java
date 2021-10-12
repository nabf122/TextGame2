package main;

public class Display {

	// print messages!
	
	public void make_name_msg(String str) {
		if(str.charAt(0)=='n') {
			System.out.println("Please re-enter your name.");
		}
		else
			System.out.println("What's youer name?");
	}
	
	public void re_name_msg(String name) {
		System.out.println(name+", Is your name correct? (y/n)");
	}
	
	public void make_class_msg(String str) {
		if(str.charAt(0)=='n') {
			System.out.println("Please re-enter your Class.");
		}else
			System.out.println("Now choose the Class. What Class do you want?\n");
			System.out.println("Strong Warrior. press 'w' if you want.");
			System.out.println("Agile Archer. press 'a' if you want.");
			System.out.println("Great Magicion. press 'm' if you want.\n");
	}
	
	public void re_class_msg(String job) {
		System.out.println(job+"! Is your Class correct? (y/n)");
	}
	
	public String chk_job_msg(String job) {
		if(job.charAt(0)=='w') {
			return "Strong Warrior";
		} else if(job.charAt(0)=='a') {
			return "Agile Archer";
		} else {
			return "Great Magicion";
		}
	}
	
	public void main_msg() {
		System.out.println("What are you going to do?");
		
		System.out.println("\n(1)Character Status. press 'c' if you want.\n(2)Inventory. press 'i' if you want."
				+ "\n(3)Store. press 's' if you want.\n(4)Maker. press 'm' if you want.\n(5)Dungeon. press 'd' if you want."
				+ "\nPress 'e' to exit");
	}
	
	public void store_msg() {
		System.out.println("visited Store.\nWhat are you going to do?\n");
		System.out.println("(1) Buying Item. press '1'\n"
				+ "(2) Delete Item. press '2'\n"
				+ "(3) exit. press '3'\n");
	}
	
	public void map_msg() {
		System.out.println("Choose dungeons");
		System.out.println("(1)Granded Plains. press '1'\n"
				+"(2)Dismal Marsh. press '2'\n"
				+"(3)Valley of Dragons. press '3'\n");
	}
	
	public void dungeon_msg() {
		System.out.println("Choose dungeons");
		System.out.println("(1)Granded Plains. press '1'\n"
				+"(2)Dismal Marsh. press '2'\n"
				+"(3)Valley of Dragons. press '3'\n");
	}
	
	public void appear_monster_msg(String str) {
		System.out.println(str+" 몬스터가 등장하였습니다!");
	}
	
	public void battle_msg() {
		System.out.println("Choose your action.");
		System.out.println("(1)Attack. press '1'\n"
				+"(2)Heal. press '2'\n"
				+"(3)Check Status. press '3'\n"
				+"(4)Run away. press '4'\n");
	}
}
