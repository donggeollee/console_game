package console_game.weapon.weaponimpl.warrior;

import console_game.weapon.WarriorWeapon;

public class WarriorWeponImpl extends WarriorWeapon{

	@Override
	public void setAttackPower(int attackPower) {
		super.attackPower = attackPower;
	}

	@Override
	public void setRequiredLevel(int requiredLevel) {
		super.requiredLevel =requiredLevel;
	}

	@Override
	public void setName(String name) {
		super.name = name;
	}

}
