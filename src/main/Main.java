package main;

import java.util.Scanner;

import item.Inventory;
import item.Item;
import map.Dungeon;
import map.Map;
import model.Adventurer;
import model.Archer;
import model.Magician;
import model.Warrior;
import monster.BlueDragon;
import monster.Dracaris;
import monster.GreenSlime;
import monster.KingSlime;
import monster.Monster;
import monster.QuagGolem;
import monster.RedDragon;
import monster.StoneGolem;

public class Main {
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Display display = new Display();
		Adventurer adv = new Adventurer();
		Monster monster = new Monster();
		Item item = null;
		Inventory inven = new Inventory();
		Scanner answer = new Scanner(System.in);
		
		String chkClass = null;
		String chkText = null;
		String yn = "s";
		String chkUser = null;

		// Game Start
		System.out.println("Text Game 2\n\n");
		System.out.println("Welcome to Text Game World!\n\n");
		
		/*
		 * 사용자의 이름을 생성
		 */
		while(yn.charAt(0) !='y')
		{
			display.make_name_msg(yn);
			chkUser = answer.nextLine();
			
			display.re_name_msg(chkUser);
			yn = answer.nextLine();
		}
		
		/*
		 * 사용자의 직업을 선택
		 */
		yn = "s";
		while(yn.charAt(0) !='y')
		{
			display.make_class_msg(yn);
			chkClass = answer.nextLine();
			
			chkText = display.chk_job_msg(chkClass);
			display.re_class_msg(chkText);
			yn = answer.nextLine();
		}
		
		/*
		 * 선택한 직업을 생성
		 */
		if(chkClass.charAt(0)=='w')
		{
			adv = new Warrior();
			adv.setName(chkUser);
			adv.buildWarrior();
			adv.CharStatus();
		} 
		else if(chkClass.charAt(0)=='a') 
		{
			adv = new Archer();
			adv.setName(chkUser);
			adv.buildArcher();
			adv.CharStatus();
		} 
		else 
		{
			adv = new Magician();
			adv.setName(chkUser);
			adv.buildMagician();
			adv.CharStatus();
		}
		
		/*
		 * 게임 시작
		 * 게임 메뉴를 보여준다.
		 */
		while(true) 
		{
				
			display.main_msg();
			chkText = answer.nextLine();
			
			/*
			 * 사용자의 캐릭터 스테이터스를 보여준다.
			 */
			if(chkText.charAt(0) == 'c') 
			{
				adv.CharStatus();
			}
			
			/*
			 * 사용자의 인벤토리 총 아이템 갯수와 
			 * 아이템별 갯수를 보여준다.
			 */
			else if(chkText.charAt(0) == 'i') 
			{
				System.out.println("아이템 갯수 : " + inven.getAvailableItems());
				inven.showItems();
			}
			
			/*
			 * 상점을 방문한다.
			 * 
			 */
			else if(chkText.charAt(0) == 's') 
			{
				display.store_msg();
				chkText = answer.nextLine();
					
				if(chkText.charAt(0) == '1')
				{
					System.out.println("SYSTEM : 어떤 아이템을 구매하시겠습니까?");
					System.out.println("(1) 하급 회복 포션 : 5 Gold \n"
							+ "(2) 중급 회복 포션 : 10 Gold \n"
							+ "(3) 상급 회복 포션 : 20 Gold \n"
							+ "(4) 강철 투구 : 20 Gold \n"
							+ "(5) 강철 갑옷 : 30 Gold \n"
							+ "(6) 강철 도끼 : 50 Gold \n");
					chkText = answer.nextLine();
					
					if(chkText.charAt(0) == '1')
					{
						item = new Item();
						item.setItemID(1);
						item.setName("하급 회복 포션"); 
						item.setPrice(5);
					}
					else if(chkText.charAt(0) == '2')
					{
						item = new Item();
						item.setItemID(2);
						item.setName("중급 회복 포션"); 
						item.setPrice(10);
					}
					else if(chkText.charAt(0) == '3')
					{
						item = new Item();
						item.setItemID(3);
						item.setName("상급 회복 포션"); 
						item.setPrice(15);
					}
					else if(chkText.charAt(0) == '4')
					{
						item = new Item();
						item.setItemID(4);
						item.setName("강철 투구"); 
						item.setPrice(20);
					}
					else if(chkText.charAt(0) == '5')
					{
						item = new Item();
						item.setItemID(5);
						item.setName("강철 갑옷"); 
						item.setPrice(30);
					}
					else if(chkText.charAt(0) == '6')
					{
						item = new Item();
						item.setItemID(6);
						item.setName("강철 도끼"); 
						item.setPrice(50);
					}
					else
					{
						System.out.println("SYSTEM : 잘못 입력하셨습니다.");
						break;
					}
					
					if(adv.buyItem(item.getPrice()) == true)
					{
						if(inven.addItem(item.getName()) == true)
						{
							System.out.println("SYSTEM : "+ item.getName()+"을 구매하였습니다.");
						}
						else
							System.out.println("SYSTEM : 인벤토리가 부족하여 구매할 수 없습니다.");
					}
					else
						System.out.println("SYSTEM : 소지한 금액이 부족하여 구매할 수 없습니다.");
				}
				else if(chkText.charAt(0) == '2')
				{
					System.out.println("어떤 아이템을 삭제하시겠어요?");
					System.out.println("아이템 개수 : " + inven.getAvailableItems());
					inven.showItems();
					if(inven.removeItem(answer.nextInt()) == true)
					{
						System.out.println(answer.nextInt()+" 슬롯 아이템을 삭제하였습니다.");
					}
					else
						System.out.println(answer.nextInt()+" 슬롯이 비었거나 삭제하지 못 했습니다.");
				}
				else
				{
					System.out.println("exit");
				}
			}
			
			/*
			 * 아이템 제작을 한다.
			 */
			else if(chkText.charAt(0) == 'm') 
			{
				
			}
			
			/*
			 * 던전에 들어간다.
			 */
			else if(chkText.charAt(0) == 'd') 
			{
				display.map_msg();
				chkText = answer.nextLine();
				
				Dungeon dg = new Dungeon();	// 던전을 생성한다.
				while(true) 
				{
					if(chkText.charAt(0) == '1')
					{
						dg.GrandedPlains();	// 그란디드 평원으로 부팅한다.
						break;
					}
					else if(chkText.charAt(0) == '2')
					{
						dg.DismalMarsh();	// 음침한 습지로 부팅한다.
						break;
					}
					else if(chkText.charAt(0) == '3')
					{
						dg.ValleyOfDragons();	// 드래곤 협곡으로 부팅한다.
						break;
					}
					
					display.dungeon_msg();
					chkText = answer.nextLine();
				}
				System.out.println("---"+dg.getMap_name()+"---");
				
				/*
				 * 각 페이즈 별, 각 던전 별 일반 몬스터를 생성한다.
				 * 페이즈 4는 보스 몬스터를 생성한다.
				 */
				while(true) 
				{
					if(dg.getPhase() == 1) 
					{
						if(dg.getMap_no() == 1) 
						{
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}
						else if(dg.getMap_no() == 2) 
						{
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}
						else 
						{
							monster = new BlueDragon();
							monster.buildBlueDragon();
						}
					}
					else if(dg.getPhase() == 2) 
					{
						if(dg.getMap_no() == 1) 
						{
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}
						else if(dg.getMap_no() == 2) 
						{
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}
						else 
						{
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}
					else if(dg.getPhase() == 3) 
					{
						if(dg.getMap_no() == 1) 
						{
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}
						else if(dg.getMap_no() == 2) 
						{
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}
						else 
						{
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}
					else if(dg.getPhase() == 4)	// 페이즈 4에서 보스를 생성한다.
					{		
						if(dg.getMap_no() == 1) 
						{
							monster = new KingSlime();
							monster.buildKingSlime();
						}
						else if(dg.getMap_no() == 2) 
						{
							monster = new QuagGolem();
							monster.buildQuagGolem();
						}
						else 
						{
							monster = new Dracaris();
							monster.buildDracaris();
						}
					}
					else
						break;
					
					/*
					 * 몬스터와 배틀을 진행한다.
					 * speed 비교를 통해 선공권을 체크한다.
					 */
					while(dg.getPhase() != 5) {
						display.battle_msg();
						chkText = answer.nextLine();
						
						if(chkText.charAt(0) == '1') // 공격하다 선택 시
						{
							if(adv.chkSpeed(monster.getSpeed()) == true) 
							{
								monster.attacked(adv.attack());	// 사용자가 몬스터를 공격하다
								if(monster.chkhp() == false) 
								{
									if(monster.getMon_Rank().equals("Normal Monster")) 
									{
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase .");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) 
									{
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase Boss!");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
								}
								adv.attacked(monster.attack());	// 몬스터가 사용자를 공격하다
								if(adv.chkhp() == false) 
								{
									System.out.println("---You die---");
									break;
								}
							}
							else 
							{
								adv.attacked(monster.attack());
								if(adv.chkhp() == false) 
								{
									System.out.println("---You die---");
									break;
								}
								monster.attacked(adv.attack());
								if(monster.chkhp() == false) 
								{
									if(monster.getMon_Rank().equals("Normal Monster")) 
									{
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase .");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) 
									{
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase Boss!");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
								}
							}	
						}
						if(chkText.charAt(0) == '2') 	// heal
						{ 
							adv.setCur_hp(adv.heal(adv.getMax_hp(), adv.getCur_hp() , chkClass));
						}
						if(chkText.charAt(0) == '3') 	// status
						{ 
							adv.CharStatus();
							monster.monsterStatus();
							System.out.println();
						}
						if(chkText.charAt(0) == '4') 	// run away
						{ 
							System.out.println("run away\n");
							dg.setPhase(5);
							break;
						}
					}
				}
			}
			
			/*
			 * 게임을 그만한다.
			 */
			else if(chkText.charAt(0) == 'e') 
			{
				break;
			}
			else	// 잘못된 문자를 받았을 때, 출력해준다.
			{
				System.out.println("\nPlease re-enter.\n\n");
			}
		}
	}
}
