package console_game.context;

public class TownContext {
	
	private boolean exit;
	context innContext = new InnContext();

	public void detail(){
		
	}
	public void story() {
		
		while (!exit) {
			
			// 입력
			
			
			if(input == 1) {
				
			}else if (input == 2) {
				innContext.story();
			}
		}
	}
}
