package console_game.context;

import console_game.map.Map;

public abstract class Context {
	
	public abstract void detail();
	
	public void story(){
		while() {
			
		}
	}
	
	
	private Map map;
	public String MapSelect;
	public Map getMap() {
		return map;
	} 
	public void setMap(Map map) {
		this.map = map;
	}
	public String getMapSelect() {
		return MapSelect;
	}
	public void setMapSelect(String mapSelect) {
		MapSelect = mapSelect;
	}
	// public void goContext(Context context);
	public void printContext() {
		System.out.println(getMapSelect() + "로 상황으로 전환");
	}
	
	
	

	
}
