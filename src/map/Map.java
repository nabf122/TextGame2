package map;

public class Map {

	private String map_name;
	private String map_desc;
	private int phase;
	private int Map_no;
	
	public String getMap_name() {
		return map_name;
	}
	public void setMap_name(String map_name) {
		this.map_name = map_name;
	}
	public String getMap_desc() {
		return map_desc;
	}
	public void setMap_desc(String map_desc) {
		this.map_desc = map_desc;
	}
	public int getPhase() {
		return phase;
	}
	public void setPhase(int phase) {
		this.phase = phase;
	}
	public int getMap_no() {
		return Map_no;
	}
	public void setMap_no(int map_no) {
		Map_no = map_no;
	}
	// 맵 설명 불러오기
	public void map_description() {
		System.out.println(map_desc);
	}
}
