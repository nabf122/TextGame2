package model;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner answer = new Scanner(System.in);
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		Magician magician = new Magician();
		
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
			warrior.setName(chkUser);
			warrior.buildWarrior();
			warrior.CharStatus();
		} else if(chkClass.charAt(0)=='a') {
			archer.setName(chkUser);
			archer.buildArcher();
			archer.CharStatus();
		} else {
			magician.setName(chkUser);
			magician.buildMagician();
			magician.CharStatus();
		}
				
		while(chkText.charAt(0)!='e') {
			
			// break;
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
				if(chkClass.charAt(0)=='w') {
					warrior.CharStatus();
				} else if(chkClass.charAt(0)=='a') {
					archer.CharStatus();
				} else {
					magician.CharStatus();
				}
			}else if(chkText.charAt(0) == 'i') {
				// 인벤토리 - 장비, 소비, 제작 아이템 확인 가능하도록 추가
				
			}else if(chkText.charAt(0) == 's') {
				// 상점 - 
				
			}else if(chkText.charAt(0) == 'm') {
				// 장비 제작
				
			}else if(chkText.charAt(0) == 'd') {
				// 던전 진입
				System.out.println("???");
				
				if(chkText.charAt(0) == '1') {
										
				}else {
					return;
				}
				
			}else if(chkText.charAt(0) == 'e') {
				// 게임 종료
				
			}else {
				System.out.println("\nPlease re-enter.\n\n");
			}
			
			
		}
	}
}
