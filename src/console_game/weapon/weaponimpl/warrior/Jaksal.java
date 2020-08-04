package console_game.weapon.weaponimpl.warrior;

import console_game.weapon.WarriorWeapon;

public class Jaksal extends WarriorWeapon{
	
	@Override
	public void setName(String name) {
		super.name = "JAKSAL";
	}
	
	@Override
	public void setAttackPower(int attackPower) {
		super.attackPower = 10;
	}
	
	@Override
	public void setRequiredLevel(int requiredLevel) {
		super.requiredLevel = 1;
	}

	

}
