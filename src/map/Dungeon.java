package map;

public class Dungeon extends Map {

	public void GrandedPlains() {
		setMap_name("Granded Plains");
		setMap_desc("???");
		setPhase(1);
		setMap_no(1);
		// 향후 효과 넣어주기
	}
	
	public void DismalMarsh() {
		setMap_name("Dismal Marsh");
		setMap_desc("???");
		setPhase(1);
		setMap_no(2);
		// 향후 효과 넣어주기
	}
	
	public void ValleyOfDragons() {
		setMap_name("Valley Of Dragons");
		setMap_desc("???");
		setPhase(1);
		setMap_no(3);
		// 향후 효과 넣어주기
	}
	
	// 던전 페이즈 관리
	public void phase_manager() {
		System.out.println("--Start Phase "+ getPhase() +"--\n");
	}
}
