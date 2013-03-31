package gameOfLife;
/**
 * 
 * Print help messages
 *
 */
public class Status {
	/**
	 * Print help message
	 * @param number of the selected message
	 */
	public Status(int info) {
		
	}
	public static void status(int error){
		switch (error) {
		case 1:
			DataPanel.status = "Game Running...";
			break;
		case 2:
			DataPanel.status = "Game Stopped";
			break;
		case 3:
			DataPanel.status = "Warning: Pattern dimension incompatible with the position selected!!!";
			break;
		case 4:
			DataPanel.status = "Game grid has been cleaned";
			break;
		case 5:
			DataPanel.status = "Game grid has been updated manually";
			break;
		case 6:
			DataPanel.status = "Game grid has been filled with random live cells";
			break;
		case 7:
			DataPanel.status = "Warning: killCell mode ON. killed cells cannot be used";
			break;
		case 8:
			DataPanel.status = "Killing mode OFF";
			break;
		case 9:
			DataPanel.status = "Population stabilized at generation "+(DataPanel.generationIndex-30);
			break;
		}
		DataPanel.update();
	}
}
