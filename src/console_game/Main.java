package console_game;

import java.util.Scanner;

import console_game.context.Context;
import console_game.map.Map;
import console_game.map.town.Thejoeun;

import console_game.weapon.WarriorWeapon;
import console_game.weapon.Weapon;
import console_game.weapon.database.WeaponTable;
import console_game.weapon.weaponimpl.warrior.WarriorWeponImpl;

public class Main {
	
//	public Context current;
	

	public static void main(String[] args) {
		boolean bossFinished = false;
		Context context = new TownContext();
		
		Scanner scan = new Scanner(System.in);
		while(!bossFinished) { 
			System.out.println("select :: 1 2 3  ");
			String input = scan.next();
			
			context.story();
			
			
			if (input.equals("1")) {
				context.setMapSelect("마을"); 
			} else if (input.equals("2")){
				context.setMapSelect("던전");
			} else if (input.equals("3")){
				context.setMapSelect("전투");
			} else {
				bossFinished = true;
			}
			context.printContext();
		}
		
	}
	
}
