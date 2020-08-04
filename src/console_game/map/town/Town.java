package console_game.map.town;

import console_game.map.Map;
import console_game.map.MapProperty;

public abstract class Town extends MapProperty implements Map{

	@Override
	public boolean story(Map map) {
		
		return false;
	}
}
