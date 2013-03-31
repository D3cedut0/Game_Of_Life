package gameOfLife;

/**
 * 
 * The MAIN 
 * @author Beltrame Andrea VR366182
 * @author Berardo Sebastiano VR360582
 *
 */
public class GameOfLife {
	/**
	 * Main method to start the game
	 */
	public static void main(String[] args) {
		
		new Frame("Game Of Life");
		Grid.insFig((Grid.righe - 14) / 2, (Grid.colonne - 60) / 2);
		while (true) {
			StartGame.run();
		}
	}
}
