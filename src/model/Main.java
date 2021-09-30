package model;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adventurer adv = new Adventurer();
		Monster monster = new Monster();
		
		Scanner answer = new Scanner(System.in);
		
		String chkUser, chkClass, chkText;
		String yn;

		// Game Start
		System.out.println("Text Game 2\n\n");
		System.out.println("Welcome to Text Game World!\n\n");
		
		// ���� �����
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
		
		// �÷��̾� name �Է�
		// player.setName(user);
		// System.out.println("Welcome to the world of text games, "+player.getName()+"\n\n");
		
		// �÷��̾� ���� ����
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
		
		// ������ ���� �ʱⰪ ����
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
		// ĳ���� ���� ����. ���� ����!
		while(true) {
			
			// break;
			/*
			 * 1. ĳ���� ����
			 * 2. �κ��丮
			 * 3. ��ȭ����
			 * 4. ���尣
			 * 5. ����
			 */
			System.out.println("What are you going to do?");
			
			System.out.println("\n(1)Character Status. press 'c' if you want.\n(2)Inventory. press 'i' if you want."
					+ "\n(3)Store. press 's' if you want.\n(4)Maker. press 'm' if you want.\n(5)Dungeon. press 'd' if you want."
					+ "\nPress 'e' to exit");
			chkText = answer.nextLine();
						
			if(chkText.charAt(0) == 'c') {
				// ĳ���� ���� Ȯ��
				// ���� ���� ���� ��� Ȯ�� �����ϵ��� ����
				adv.CharStatus();
				
				
			}else if(chkText.charAt(0) == 'i') {
				// �κ��丮 - ���, �Һ�, ���� ������ Ȯ�� �����ϵ��� �߰�
				
			}else if(chkText.charAt(0) == 's') {
				// ���� - 
				
			}else if(chkText.charAt(0) == 'm') {
				// ��� ����
				
			}else if(chkText.charAt(0) == 'd') {
				// ���� ����
				System.out.println("Choose dungeons");
				System.out.println("(1)������ ���(���̵� :1). press '1'\n"
						+"(2)���� ��� (���̵� :3). press '2'\n"
						+"(3)����� ���(���̵� :4). press '3'\n");
				chkText = answer.nextLine();
				
				if(chkText.charAt(0) == '1') {
					int phase = 1;
					// ������ ��� ����, Phase One ����
					System.out.println("������ ����� �����Ͽ����ϴ�.\n");
					
					while(phase != 5) {
						
						if(phase == 1) {
							System.out.println("Start Phase 1.\n");
							// Phase One Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(phase == 2) {
							System.out.println("Start Phase 2.\n");
							// Phase One Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(phase == 3) {
							System.out.println("Start Phase 3.\n");
							// Phase One Monster build
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(phase == 4) {
							System.out.println("Start Phase Boss.\n");
							// Phase One Monster build
							monster = new KingSlime();
							monster.buildKingSlime();
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
										phase = phase + 1;
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase Boss!");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
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
					
				} else if(chkText.charAt(0) == '2') {
					
				} else if(chkText.charAt(0) == '3') {
					
				} else {
					return;
				}
				
			}else if(chkText.charAt(0) == 'e') {
				// ���� ����
				
			}else {
				System.out.println("\nPlease re-enter.\n\n");
			}
		}
	}
}
