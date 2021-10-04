package model;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adventurer adv = new Adventurer();
		Monster monster = new Monster();
		
		// Item item = new WeaponItem();
		
		Scanner answer = new Scanner(System.in);
		
		String chkUser, chkClass, chkText;
		String yn;

		// Game Start
		System.out.println("Text Game 2\n\n");
		System.out.println("Welcome to Text Game World!\n\n");
		
		// 계정 만들기
		System.out.println("What's youer name?");
		chkUser = answer.nextLine();
		
		System.out.println(chkUser+", Is your name correct? (y/n)");
		yn = answer.nextLine();
		
		while(yn.charAt(0) !='y'){
			System.out.println("Please re-enter your name.");
			chkUser = answer.nextLine();
			
			System.out.println(chkUser+", Is your name correct? (y/n)");
			yn = answer.nextLine();
		}
		
		// 플레이어 name 입력
		// player.setName(user);
		// System.out.println("Welcome to the world of text games, "+player.getName()+"\n\n");
		
		// 플레이어 직업 선택
		System.out.println("Now choose the Class. What Class do you want?\n");
		System.out.println("Strong Warrior. press 'w' if you want.");
		System.out.println("Agile Archer. press 'a' if you want.");
		System.out.println("Great Magicion. press 'm' if you want.\n");
		chkClass = answer.nextLine();
		
		if(chkClass.charAt(0)=='w') {
			chkText = "Strong Warrior";
		} else if(chkClass.charAt(0)=='a') {
			chkText = "Agile Archer";
		} else {
			chkText = "Great Magicion";
		}
		
		System.out.println(chkText+"! Is your Class correct? (y/n)");
		yn = answer.nextLine();
		
		while(yn.charAt(0) !='y'){
			System.out.println("Please re-enter your Class.");
			chkClass = answer.nextLine();
			
			if(chkClass.charAt(0)=='w') {
				chkText = "Strong Warrior";
			} else if(chkClass.charAt(0)=='a') {
				chkText = "Agile Archer";
			} else {
				chkText = "Great Magicion";
			}
			
			System.out.println(chkText+"! Is your Class correct? (y/n)");
			yn = answer.nextLine();	
		}
		
		// 선택한 직업 초기값 생성
		if(chkClass.charAt(0)=='w') {
			adv = new Warrior();
			adv.setName(chkUser);
			adv.buildWarrior();
			adv.CharStatus();
		} else if(chkClass.charAt(0)=='a') {
			adv = new Archer();
			adv.setName(chkUser);
			adv.buildArcher();
			adv.CharStatus();
		} else {
			adv = new Magician();
			adv.setName(chkUser);
			adv.buildMagician();
			adv.CharStatus();
		}
		// 캐릭터 생성 종료. 게임 시작!
		while(true) {
			
			/*
			 * 1. 캐릭터 상태
			 * 2. 인벤토리
			 * 3. 잡화상점
			 * 4. 대장간
			 * 5. 던전
			 */
			System.out.println("What are you going to do?");
			
			System.out.println("\n(1)Character Status. press 'c' if you want.\n(2)Inventory. press 'i' if you want."
					+ "\n(3)Store. press 's' if you want.\n(4)Maker. press 'm' if you want.\n(5)Dungeon. press 'd' if you want."
					+ "\nPress 'e' to exit");
			chkText = answer.nextLine();
						
			if(chkText.charAt(0) == 'c') {
				// 캐릭터 상태 확인
				// 추후 착용 중인 장비 확인 가능하도록 수정
				adv.CharStatus();
				
				
			}else if(chkText.charAt(0) == 'i') {
				// 인벤토리 - 장비, 소비, 제작 아이템 확인 가능하도록 추가
				
			}else if(chkText.charAt(0) == 's') {
				// 상점
				String item_name;
				int item_num;
				
				System.out.println("visited Store.\nWhat are you going to do?\n");
				System.out.println("(1) buying. press '1'\n"
						+ "(2) Selling. press '2'\n"
						+ "(3) exit. press '3'\n");
				chkText = answer.nextLine();
				if(chkText.charAt(0) == '1') {
					System.out.println("What would you like to buy?\n");
					System.out.println("(1) 하급 포션(회복+10). 가격: 20 gold. press '1'\n"
							+ "(2) 중급 포션(회복+15). 가격: 35 gold. press '2'\n"
							+ "(3) 상급 포션(회복+30). 가격: 55 gold. press '3'\n");
					chkText = answer.nextLine();
					if(chkText.charAt(0) == '1') {
						System.out.println("구매할 갯수를 입력해주세요. 최대 소지량: 100 개\n");
						item_num = answer.nextInt();
						if(item_num <= 100 || item_num > 0) {
							item_name = "lowPotion";
							
						}else
							System.out.println("정상적인 값을 입력해주세요.");
						
						
					} else if(chkText.charAt(0)  == '2') {
						
					} else if(chkText.charAt(0)  == '3') {
						
					} else {
						return;
					}
				} else if(chkText.charAt(0)  == '2') {
					
				}else 
					return;
			}else if(chkText.charAt(0) == 'm') {
				// 장비 제작
				
			}else if(chkText.charAt(0) == 'd') {
				// 던전 진입
				System.out.println("Choose dungeons");
				System.out.println("(1)슬라임 평원(난이도 :1). press '1'\n"
						+"(2)골렘의 사원 (난이도 :3). press '2'\n"
						+"(3)용들의 계곡(난이도 :4). press '3'\n");
				chkText = answer.nextLine();
				
				int phase = 1;
				String n = chkText;
					
				while(phase != 5) {
						
					if(phase == 1) {					
						if(n.charAt(0) == '1') {
							// 슬라임 평원 입장, Phase One 시작
							System.out.println("슬라임 평원에 도착하였습니다.\n");
							System.out.println("Start Phase 1.\n");
							// Phase 1 GreenSlime Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						} else if(n.charAt(0) == '2') {
							// 골렘의 사원 입장, Phase One 시작
							System.out.println("골렘의 사원에 도착하였습니다.\n");
							System.out.println("Start Phase 1.\n");
							// Phase 1 StoneGolem Monster build
							monster = new StoneGolem();
							monster.buildStoneGolem();
						} else {
							// 용들의 협곡 입장, Phase One 시작
							System.out.println("용들의 협곡에 도착하였습니다.\n");
							System.out.println("Start Phase 1.\n");
							// Phase 1 BlueDragon Monster build
							monster = new BlueDragon();
							monster.buildBlueDragon();
						}
					}else if(phase == 2) {
						System.out.println("Start Phase 2.\n");
						if(n.charAt(0) == '1') {
							// Phase 2 GreenSlime Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						} else if(n.charAt(0) == '2') {
							// Phase 2 StoneGolem Monster build
							monster = new StoneGolem();
							monster.buildStoneGolem();
						} else {
							// Phase 2 RedDragon Monster build
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}else if(phase == 3) {
						System.out.println("Start Phase 3.\n");
						if(n.charAt(0) == '1') {
							// Phase 3 GreenSlime Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						} else if(n.charAt(0) == '2') {
							// Phase 3 StoneGolem Monster build
							monster = new StoneGolem();
							monster.buildStoneGolem();
						} else {
							// Phase 3 RedDragon Monster build
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}else if(phase == 4) {
						System.out.println("Start Phase Boss.\n");
						if(n.charAt(0) == '1') {
							// Phase 4 KingSlime Boss Monster build
							monster = new KingSlime();
							monster.buildKingSlime();
						} else if(n.charAt(0) == '2') {
							// Phase 4 StoneGolem Boss Monster build
							monster = new QuagGolem();
							monster.buildQuagGolem();
						} else {
							// Phase 4 Dracaris Boss Monster build
							monster = new Dracaris();
							monster.buildDracaris();
						}
					}
					
					// Battle Phase Start
					while(true) {
						System.out.println("Choose your action.");
						System.out.println("(1)Attack. press '1'\n"
								+"(2)Heal. press '2'\n"
								+"(3)Check Status. press '3'\n"
								+"(4)Run away. press '4'\n");
						chkText = answer.nextLine();
					
						if(chkText.charAt(0) == '1') { // attack
								monster.attacked(adv.attack());
								if(monster.chkhp() == false) {
									if(monster.getMon_Rank().equals("Normal Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase "+phase+".");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										phase = phase + 1;
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase Boss!");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										phase = phase + 1;
										break;
									}
								}
								adv.attacked(monster.attack());
								if(adv.chkhp() == false) {
									System.out.println("<<-You die->>");
									break;
								}
							}
							if(chkText.charAt(0) == '2') { // heal
								adv.setCur_hp(adv.heal(adv.getMax_hp(), adv.getCur_hp() , chkClass));
							}
							if(chkText.charAt(0) == '3') { // status
								adv.CharStatus();
								System.out.println();
								monster.monsterStatus();
								System.out.println();
							}
							if(chkText.charAt(0) == '4') { // run away
								System.out.println("run away\n");
								phase = 5;
								break;
							}
						
						}
					}	
			}else if(chkText.charAt(0) == 'e') {
				// 게임 종료
				break;
			}else {
				System.out.println("\nPlease re-enter.\n\n");
			}
		}
	}
}
