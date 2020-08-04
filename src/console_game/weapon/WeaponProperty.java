package console_game.weapon;

public abstract class WeaponProperty {
	
	protected String name;
	protected int requiredLevel;
	protected int attackPower;
	protected CharacterType[] characterType;
	
	public String getName() {
		return name;
	}
	
	public int getRequiredLevel() {
		return requiredLevel;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public CharacterType[] getCharacterType() {
		return characterType;
	}
	
}
