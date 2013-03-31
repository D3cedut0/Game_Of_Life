package gameOfLife;

public class Ship {
	
	 /**
	 *The Ship pattern
	 * 
	 * @param int Click Row.
	 * @param int Click Column.
	 */
	public Ship(int y, int x) {
		if (Grid.colonne - x >= 3 && Grid.righe -y >=2) {

			Grid.Flag[y][x] = true;
			Grid.Flag[y][x + 1] = true;

			Grid.Flag[y + 1][x] = true;
			Grid.Flag[y + 1][x + 2] = true;

			Grid.Flag[y + 2][x + 1] = true;
		} else
			Status.status(3);
	}
}