package gameOfLife;

public class Glider {
	 /**
	 *The Glider pattern
	 * 
	 * @param int Click Row
	 * @param int Click Column.
	 */
	public Glider(int y, int x) {
		if (Grid.colonne - x >= 3 && Grid.righe -y >=3 && x >= 1) {
			Grid.Flag[y][x] = true;

			Grid.Flag[y + 1][x + 1] = true;

			Grid.Flag[y + 2][x - 1] = true;

			Grid.Flag[y + 2][x] = true;

			Grid.Flag[y + 2][x + 1] = true;
		} else
			Status.status(3);
	}
}