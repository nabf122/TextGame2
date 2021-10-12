package main;

import java.util.Scanner;

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
		Scanner answer = new Scanner(System.in);
		
		String chkClass = null;
		String chkText = null;
		String yn = "s";
		String chkUser = null;

		// Game Start
		System.out.println("Text Game 2\n\n");
		System.out.println("Welcome to Text Game World!\n\n");
		
		// make User Name
		while(yn.charAt(0) !='y'){
			display.make_name_msg(yn);
			chkUser = answer.nextLine();
			
			display.re_name_msg(chkUser);
			yn = answer.nextLine();
		}
		
		// make User Job
		yn = "s";
		while(yn.charAt(0) !='y'){
			display.make_class_msg(yn);
			chkClass = answer.nextLine();
			
			chkText = display.chk_job_msg(chkClass);
			display.re_class_msg(chkText);
			yn = answer.nextLine();
		}
		
		// make User Job Details
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
		
		while(true) {
				
			display.main_msg();
			chkText = answer.nextLine();
						
			if(chkText.charAt(0) == 'c') {
				adv.CharStatus();
			}else if(chkText.charAt(0) == 'i') {
				
			}else if(chkText.charAt(0) == 's') {
				String item_name;
				int item_num;
				
				display.store_msg();
				chkText = answer.nextLine();
				
			}else if(chkText.charAt(0) == 'm') {
				
			}else if(chkText.charAt(0) == 'd') {
				display.map_msg();
				chkText = answer.nextLine();
				
				// Dungeon Build
				Dungeon dg = new Dungeon();
				while(true) {
					if(chkText.charAt(0) == '1')
					{
						dg.GrandedPlains();
						break;
					}else if(chkText.charAt(0) == '2')
					{
						dg.DismalMarsh();
						break;
					}else if(chkText.charAt(0) == '3')
					{
						dg.ValleyOfDragons();
						break;
					}
					
					display.dungeon_msg();
					chkText = answer.nextLine();
				}
				System.out.println("---"+dg.getMap_name()+"---");
				
				// Moster Build 
				while(true) {
					
					if(dg.getPhase() == 1) {
						if(dg.getMap_no() == 1) {
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(dg.getMap_no() == 2) {
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}else {
							monster = new BlueDragon();
							monster.buildBlueDragon();
						}
					}else if(dg.getPhase() == 2) {
						if(dg.getMap_no() == 1) {
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(dg.getMap_no() == 2) {
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}else {
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}else if(dg.getPhase() == 3) {
						if(dg.getMap_no() == 1) {
							monster = new GreenSlime();
							monster.buildGreenSlime();
						}else if(dg.getMap_no() == 2) {
							monster = new StoneGolem();
							monster.buildStoneGolem();
						}else {
							monster = new RedDragon();
							monster.buildRedDragon();
						}
					}else if(dg.getPhase() == 4) {		//Boss Phase!
						if(dg.getMap_no() == 1) {
							monster = new KingSlime();
							monster.buildKingSlime();
						}else if(dg.getMap_no() == 2) {
							monster = new QuagGolem();
							monster.buildQuagGolem();
						}else {
							monster = new Dracaris();
							monster.buildDracaris();
						}
					}else
						break;
					
					// Battle Start
					while(dg.getPhase() != 5) {
						display.battle_msg();
						chkText = answer.nextLine();
						
						if(chkText.charAt(0) == '1') { // attack
							if(adv.chk_speed(monster.getSpeed()) == true) {	//선공권 체크 로직
								monster.attacked(adv.attack());
								if(monster.chkhp() == false) {
									if(monster.getMon_Rank().equals("Normal Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase .");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase Boss!");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
								}
								adv.attacked(monster.attack());
								if(adv.chkhp() == false) {
									System.out.println("<<-You die->>");
									break;
								}
							}else {
								adv.attacked(monster.attack());
								if(adv.chkhp() == false) {
									System.out.println("<<-You die->>");
									break;
								}
								monster.attacked(adv.attack());
								if(monster.chkhp() == false) {
									if(monster.getMon_Rank().equals("Normal Monster")) {
										System.out.println(monster.getMon_name()+" Kill.\n Clear Phase .");
										adv.receiveGold(monster.giveGold());
										adv.receiveXp(monster.giveXp());
										adv.levelupChk();
										dg.setPhase(dg.getPhase()+1);
										break;
									}
									if(monster.getMon_Rank().equals("Boss Monster")) {
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
							dg.setPhase(5);
							break;
						}
					}
				}	
			}else if(chkText.charAt(0) == 'e') {
				break;
			}else {
				System.out.println("\nPlease re-enter.\n\n");
			}
		}
	}
}